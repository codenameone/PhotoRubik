package com.mycompany.myapp;

import com.codename1.capture.Capture;
import com.codename1.io.FileSystemStorage;
import com.codename1.ui.Button;
import com.codename1.ui.ComboBox;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.SideMenuBar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.table.TableLayout.Constraint;
import com.codename1.ui.util.ImageIO;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Application {

  private static Application INSTANCE;

  private Form main_form;
  private LabeledTextField cubes_field;
  private Container center_container;
  private RubikMosaic rubik_mosaic;
  private Image current_image;
  public ComboBox colors_combo;
  public HashMap<String, Integer> colors_map;
  public boolean colorable = false;

  private HashMap<String, Image> image_store;

  private Application() {
    current_image = null;
    build_main_form();
    build_side_menu();
  }

  private void build_main_form() {
    Display.getInstance().setCommandBehavior(Display.COMMAND_BEHAVIOR_SIDE_NAVIGATION);
    main_form = new Form("PhottoRubik");
    main_form.setLayout(new BorderLayout());
    main_form.setScrollable(false);
    add_main_form_elements();
  }

  private void build_side_menu() {
    add_side_menu_elements();
  }

  private void add_main_form_elements() {
    add_main_form_buttons_container();
  }

  private void add_side_menu_elements() {
    add_side_menu_left();
    add_side_menu_right();
  }

  private void add_main_form_buttons_container() {
    center_container = new Container(new GridLayout(2, 1));
    center_container.setScrollableY(false);
    Button selection_button = new Button("Select");
    add_photto_selection_action_to(selection_button);
    Button capture_button = new Button("Capture");
    add_photto_capture_action_to(capture_button);
    center_container.addComponent(selection_button);
    center_container.addComponent(capture_button);
    main_form.addComponent(BorderLayout.CENTER, center_container);
  }

  private void add_main_form_images_container() {
    center_container = new Container(new BoxLayout(BoxLayout.Y_AXIS));
    center_container.setScrollableY(true);
    main_form.addComponent(BorderLayout.CENTER, center_container);
  }

  private void add_photto_selection_action_to(Button button) {
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Display.getInstance().openImageGallery(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            if (evt == null) {
              return;
            }
            SideMenuBar.closeCurrentMenu();
            try {
              String path = (String) evt.getSource();
              display_modified_images_from(path);
            }
            catch (Exception ex) {
              Logging.exception(ex);
            }
          }
        });
      }
    });
  }

  private void add_photto_capture_action_to(Button button) {
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        try {
          String path = Capture.capturePhoto();
          if (path == null) {
            return;
          }
          SideMenuBar.closeCurrentMenu();
          display_modified_images_from(path);
        }
        catch (Exception ex) {
          Logging.exception(ex);
        }
      }
    });
  }

  private void add_photto_share_action_to(Button button) {
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        SideMenuBar.closeCurrentMenu();
        if (current_image != null) {
          String path;
          try {
            path = save_to_file(current_image);
            Display.getInstance().share("Created with PhottoRubik", path, "image/png");
          }
          catch (IOException ex) {
            Logging.exception(ex);
          }
        }
      }
    });
  }

  private RubikBender new_rubik_bender() {
    int cubes;
    try {
      cubes = Integer.parseInt(cubes_field.text_field().getText().trim());
      if (cubes < 1 || cubes > Defaults.MAX_CUBES) {
        cubes = Defaults.CUBES;
      }
    }
    catch (NumberFormatException ex) {
      cubes = Defaults.CUBES;
    }
    return new RubikBender(cubes);
  }

  private void display_modified_images_from(String path) {
    add_main_form_images_container();
    current_image = null;
    LinkedList<Image> images = new_rubik_bender().bend_with_image_from(path);
    Image resized_image;
    image_store = new HashMap<String, Image>();
    int index = 0;
    for (Image image : images) {
      int ratio = main_form.getWidth() / image.getWidth();
      int width = image.getWidth() * ratio;
      int height = image.getHeight() * ratio;
      resized_image = image.scaled(width, height);
      String name = "image" + index;
      ++index;
      resized_image.setImageName(name);
      image_store.put(name, image);
      Button image_container = new Button();
      image_container.setUIID("Component");
      image_container.setIcon(resized_image);
      image_container.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
          Image image = ((Button) evt.getComponent()).getIcon();
          String name = image.getImageName();
          center_container = new Container(new BoxLayout(BoxLayout.Y_AXIS));
          current_image = image_store.get(name);
          rubik_mosaic = new RubikMosaic(current_image);
          add_mosaic_action_buttons();
          center_container.addComponent(rubik_mosaic);
          main_form.addComponent(BorderLayout.CENTER, center_container);
          center_container.getComponentForm().revalidate();
        }
      });
      center_container.addComponent(image_container);
    }
    center_container.animateLayoutAndWait(200);
  }

  private String save_to_file(Image image) throws IOException {
    FileSystemStorage fss = FileSystemStorage.getInstance();
    String path = fss.getAppHomePath() + "img.png";
    OutputStream save = fss.openOutputStream(path);
    ImageIO.getImageIO().save(image, save, ImageIO.FORMAT_PNG, 1f);
    save.close();
    return path;
  }

  private void add_mosaic_action_buttons() {
    Button scale_up_button = new Button("+");
    Button scale_down_button = new Button("-");
    Button scale_normal_button = new Button("0");
    Button scrolling_button = new Button("Scroll");
    Button brushing_button = new Button("Brush");
    Button stats_button = new Button("Stats");
    colors_map = new HashMap<String, Integer>();
    colors_combo = new ComboBox();
    for (int index = 0; index < Defaults.COLORS_COMPLETE.length; ++index) {
      colors_map.put(Defaults.COLOR_NAMES[index], Defaults.COLORS_COMPLETE[index]);
      colors_combo.addItem(Defaults.COLOR_NAMES[index]);
    }
    add_scale_up_action_to(scale_up_button);
    add_scale_down_action_to(scale_down_button);
    add_scale_normal_action_to(scale_normal_button);
    add_scroll_action_to(scrolling_button);
    add_brush_action_to(brushing_button);
    add_statistics_action_to(stats_button);
    Container buttons_container = new Container(new BoxLayout(BoxLayout.X_AXIS));
    buttons_container.setScrollableX(true);
    buttons_container.addComponent(scale_up_button);
    buttons_container.addComponent(scale_down_button);
    buttons_container.addComponent(scale_normal_button);
    buttons_container.addComponent(scrolling_button);
    buttons_container.addComponent(brushing_button);
    buttons_container.addComponent(colors_combo);
    buttons_container.addComponent(stats_button);
    center_container.addComponent(buttons_container);
  }

  private void add_scale_up_action_to(Button scale_up_button) {
    scale_up_button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        rubik_mosaic.scale_up();
        rubik_mosaic.revalidate();
      }
    });
  }

  private void add_scale_down_action_to(Button scale_down_button) {
    scale_down_button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        rubik_mosaic.scale_down();
        rubik_mosaic.revalidate();
      }
    });
  }

  private void add_scale_normal_action_to(Button scale_normal_button) {
    scale_normal_button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        rubik_mosaic.scale_reset();
        rubik_mosaic.revalidate();
      }
    });
  }

  private void add_brush_action_to(Button brushing_button) {
    brushing_button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        rubik_mosaic.scrollable(false);
        colorable = true;
        main_form.revalidate();
      }
    });
  }

  private void add_scroll_action_to(Button scrolling_button) {
    scrolling_button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        colorable = false;
        rubik_mosaic.scrollable(true);
        main_form.revalidate();
      }
    });
  }

  private void add_statistics_action_to(Button button) {
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        center_container.removeAll();
        colorable = false;
        ArrayList<Counter<RubikSide>> sides = rubik_mosaic.distinct_sides();
        Collections.sort(sides, Counter.value_comparator_reverse);
        Container statistics_container = new Container(new TableLayout(3, 2));
        statistics_container.setScrollable(true);
        statistics_container.addComponent(new Label("Total cubes:"));
        statistics_container.addComponent(new Label("" + rubik_mosaic.getComponentCount()));
        statistics_container.addComponent(new Label("Distinct faces:"));
        statistics_container.addComponent(new Label("" + sides.size()));
        Container sides_container = new Container(new TableLayout(sides.size(), 2));
        for (Counter<RubikSide> side : sides) {
          sides_container.addComponent(side.key());
          sides_container.addComponent(new Label(" X " + side.value()));
        }
        Constraint center = new Constraint();
        center.setHorizontalAlign(Component.CENTER);
        statistics_container.addComponent(center, sides_container);
        center_container.addComponent(statistics_container);
        main_form.revalidate();
      }
    });
  }

  public void show() {
    this.main_form.show();
  }

  public static Application instance() {
    if (INSTANCE == null) {
      INSTANCE = new Application();
    }
    return INSTANCE;
  }

  private void add_side_menu_left() {
    Command command;

    // Create the Select button
    command = new Command("Select");
    Button selection_button = new Button("Select");
    add_photto_selection_action_to(selection_button);
    command.putClientProperty("SideComponent", selection_button);
    main_form.addCommand(command);

    // Create the Capture button
    command = new Command("Capture");
    Button capture_button = new Button("Capture");
    add_photto_capture_action_to(capture_button);
    command.putClientProperty("SideComponent", capture_button);
    main_form.addCommand(command);

    // Create the Share button
    command = new Command("Share");
    Button share_button = new Button("Share");
    add_photto_share_action_to(share_button);
    command.putClientProperty("SideComponent", share_button);
    main_form.addCommand(command);
  }

  private void add_side_menu_right() {
    Command command = new Command("Available cubes");
    cubes_field = new LabeledTextField("Available cubes:", Integer.toString(Defaults.CUBES));
    command.putClientProperty("SideComponent", cubes_field);
    command.putClientProperty(SideMenuBar.COMMAND_PLACEMENT_KEY, SideMenuBar.COMMAND_PLACEMENT_VALUE_RIGHT);
    main_form.addCommand(command);
  }
}
