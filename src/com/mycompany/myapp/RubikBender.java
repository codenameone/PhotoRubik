package com.mycompany.myapp;

import com.codename1.ui.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

class RubikBender {

  final private int cubes;
  final private int squares;
  final private static ColorScheme[] color_schemes = new ColorScheme[]{
    new ColorScheme(Defaults.COLORS_COMPLETE),
    new ColorScheme(Defaults.COLORS_NO_BLUE),
    new ColorScheme(Defaults.COLORS_NO_GREEN),
    new ColorScheme(Defaults.COLORS_NO_ORANGE),
    new ColorScheme(Defaults.COLORS_NO_RED),
    new ColorScheme(Defaults.COLORS_NO_WHITE),
    new ColorScheme(Defaults.COLORS_NO_YELLOW)
  };

  private int resized_width;
  private int resized_height;
  private ArrayList<Color> actual_colors;
  private ArrayList<Color> distinct_colors;
  private ArrayList<Color> distinct_colors_backup;
  private ArrayList<ArrayList<Color>> boxes;
  private LinkedList<Image> images;
  private HashMap<Integer, ArrayList<Color>> quantized_samples;
  private HashMap<Integer, int[]> distinct_to_quantized_mapping;
  private HashMap<Integer, int[]> quantized_to_scheme_mapping;

  public RubikBender(int cubes) {
    this.cubes = cubes;
    this.squares = Defaults.CUBE_SQUARES;
  }

  public LinkedList<Image> bend_with_image_from(String path) {
    Image image;
    try {
      image = Image.createImage(path);
      int original_width = image.getWidth();
      int original_height = image.getHeight();
      float ratio = ((float) original_width) / ((float) original_height);
      int cubes_h = (int) Math.floor(Math.sqrt(this.cubes * (1f / ratio)));
      int cubes_w = (int) Math.floor(ratio * Math.sqrt(this.cubes * (1f / ratio)));
      resized_width = cubes_w * this.squares;
      resized_height = cubes_h * this.squares;
      image = image.scaled(resized_width, resized_height);
      initialize_color_structures(image.getRGB());
      transform_image_with(color_schemes);
    }
    catch (IOException ex) {
      Log.error(ex);
    }
    catch (NumberFormatException ex) {
      Log.error(ex);
    }
    catch (ArithmeticException ex) {
      Log.error(ex);
    }
    return this.images;
  }

  private void initialize_color_structures(int[] color_array) {
    images = new LinkedList<Image>();
    quantized_samples = new HashMap();
    distinct_to_quantized_mapping = new HashMap();
    quantized_to_scheme_mapping = new HashMap();
    int number_of_colors = color_array.length;
    int[] intermediate_array = new int[number_of_colors];
    this.actual_colors = new ArrayList();
    this.distinct_colors = new ArrayList();
    this.distinct_colors_backup = new ArrayList();
    Color current_color = new Color(0);
    Image image = Image.createImage(color_array, resized_width, resized_height);
    images.add(image);
    for (int index = 0; index < number_of_colors; ++index) {
      current_color.mutate_to(color_array[index]);
      current_color.saturate(80d);
      current_color.create_ARGB();
      intermediate_array[index] = current_color.argb;
    }
    images.add(Image.createImage(intermediate_array, resized_width, resized_height));
    for (int index = 0; index < number_of_colors; ++index) {
      current_color.mutate_to(color_array[index]);
      current_color.saturate(80d);
      current_color.truncate(50);
      current_color.create_ARGB();
      intermediate_array[index] = current_color.argb;
    }
    images.add(Image.createImage(intermediate_array, resized_width, resized_height));
    for (int color : color_array) {
      current_color.mutate_to(color);
      current_color.saturate(80d);
      current_color.truncate(50);
      int color_index = this.distinct_colors.indexOf(current_color);
      if (color_index == -1) {
        Color color_clone = new Color(current_color);
        this.actual_colors.add(color_clone);
        this.distinct_colors.add(color_clone);
      }
      else {
        this.actual_colors.add(this.distinct_colors.get(color_index));
      }
    }
    for (Color color : distinct_colors) {
      this.distinct_colors_backup.add(new Color(color));
    }
  }

  private void transform_image_with(ColorScheme[] color_schemes) {
    int number_of_color_schemes = color_schemes.length;
    ColorScheme current_color_scheme;
    Image generated_image;
    for (int scheme_index = 0; scheme_index < number_of_color_schemes; ++scheme_index) {
      current_color_scheme = color_schemes[scheme_index];
      median_cut_quantization(current_color_scheme.size());
      map_quantized_to_scheme(current_color_scheme.colors, scheme_index);
      generated_image = generate_image_for_color_scheme(scheme_index);
      images.add(generated_image);
      reset_distinct_color_values();
    }
  }

  private void median_cut_quantization(int size) {
    if (this.quantized_samples.containsKey(size)) {
      return;
    }
    ArrayList<Color> quantized_colors = new ArrayList();
    boxes = new ArrayList();
    int distinct_color_size = distinct_colors.size();
    ArrayList<Color> all_colors = new ArrayList<Color>();
    all_colors.addAll(distinct_colors);
    boxes.add(all_colors);
    for (int index = 1; index < size; ++index) {
      int largest_box_index = find_largest_box_index();
      split_box(largest_box_index);
    }
    int number_of_boxes = boxes.size();
    ArrayList<Color> current_box;
    Color current_box_color;
    int current_box_size;
    int[] mapping = new int[distinct_color_size];
    for (int box_index = 0; box_index < number_of_boxes; ++box_index) {
      current_box = boxes.get(box_index);
      quantized_colors.add(color_rep_in(current_box));
      current_box_size = current_box.size();
      for (int box_color_index = 0; box_color_index < current_box_size; ++box_color_index) {
        current_box_color = current_box.get(box_color_index);
        for (int distinct_color_index = 0; distinct_color_index < distinct_color_size; ++distinct_color_index) {
          if (current_box_color.equals(distinct_colors.get(distinct_color_index))) {
            mapping[distinct_color_index] = box_index;
          }
        }
      }
    }
    this.quantized_samples.put(size, quantized_colors);
    this.distinct_to_quantized_mapping.put(size, mapping);
    add_quantized_image_for_debugging(size);
  }

  private int find_largest_box_index() {
    int boxes_size = this.boxes.size();
    double max_volume = Double.MIN_VALUE;
    double current_volume;
    int box_index = 0;
    for (int index = 0; index < boxes_size; ++index) {
      current_volume = calculate_box_volume(boxes.get(index));
      if (max_volume < current_volume) {
        max_volume = current_volume;
        box_index = index;
      }
    }
    return box_index;
  }

  private double calculate_box_volume(ArrayList<Color> box) {
    int min_l = Integer.MAX_VALUE;
    int min_a = Integer.MAX_VALUE;
    int min_b = Integer.MAX_VALUE;
    int max_l = Integer.MIN_VALUE;
    int max_a = Integer.MIN_VALUE;
    int max_b = Integer.MIN_VALUE;
    for (Color color : box) {
      if (min_l > color.current_L) {
        min_l = color.current_L;
      }
      if (min_a > color.current_A) {
        min_a = color.current_A;
      }
      if (min_b > color.current_B) {
        min_b = color.current_B;
      }
      if (max_l < color.current_L) {
        max_l = color.current_L;
      }
      if (max_a < color.current_A) {
        max_a = color.current_A;
      }
      if (max_b < color.current_B) {
        max_b = color.current_B;
      }
    }
    return (max_a - min_a + 256) * (max_b - min_b + 256) * ((max_l - min_l) * 2.56d);
  }

  private void split_box(int index) {
    ArrayList<Color> big_box = boxes.get(index);
    if (big_box.size() < 2) {
      return;
    }
    ArrayList<Color> left_box = new ArrayList();
    ArrayList<Color> right_box = new ArrayList();
    int longest_axis = get_longest_axis(big_box);
    switch (longest_axis) {
      case 0:
        Collections.sort(big_box, Color.color_L_comparator);
        break;
      case 1:
        Collections.sort(big_box, Color.color_A_comparator);
        break;
      case 2:
        Collections.sort(big_box, Color.color_B_comparator);
        break;
    }
    int big_box_size = big_box.size();
    int median = big_box_size / 2;
    for (int box_index = 0; box_index < median; ++box_index) {
      left_box.add(big_box.get(box_index));
    }
    for (int box_index = median; box_index < big_box_size; ++box_index) {
      right_box.add(big_box.get(box_index));
    }
    boxes.set(index, left_box);
    boxes.add(right_box);
  }

  private int get_longest_axis(ArrayList<Color> box) {
    int min_l = Integer.MAX_VALUE;
    int min_a = Integer.MAX_VALUE;
    int min_b = Integer.MAX_VALUE;
    int max_l = Integer.MIN_VALUE;
    int max_a = Integer.MIN_VALUE;
    int max_b = Integer.MIN_VALUE;
    for (Color color : box) {
      if (min_l > color.current_L) {
        min_l = color.current_L;
      }
      if (min_a > color.current_A) {
        min_a = color.current_A;
      }
      if (min_b > color.current_B) {
        min_b = color.current_B;
      }
      if (max_l < color.current_L) {
        max_l = color.current_L;
      }
      if (max_a < color.current_A) {
        max_a = color.current_A;
      }
      if (max_b < color.current_B) {
        max_b = color.current_B;
      }
    }
    double length_l = (max_l - min_l) * 2.56d;
    double length_a = max_a - min_a;
    double length_b = max_b - min_b;
    int biggest;
    if (length_l > length_a) {
      if (length_l > length_b) {
        biggest = 0;
      }
      else {
        biggest = 2;
      }
    }
    else {
      if (length_a > length_b) {
        biggest = 1;
      }
      else {
        biggest = 2;
      }
    }
    return biggest;
  }

  private Color color_rep_in(ArrayList<Color> box) {
    return new Color(box.get(box.size() / 2));
  }

  public void map_quantized_to_scheme(ArrayList<Color> scheme_colors, int scheme_number) {
    ArrayList<Color> quantized_colors = quantized_samples.get(scheme_colors.size());
    int scheme_size = scheme_colors.size();
    int quantized_size = quantized_colors.size();
    int[] mapping = new int[quantized_size];
    double[][] match_matrix = new double[scheme_size + 1][];
    double min;
    Color current_color;
    int saved_scheme_index;
    int saved_quantized_index;
    for (int index = 0; index <= scheme_size; ++index) {
      match_matrix[index] = new double[quantized_size + 1];
    }
    for (int index = 1; index <= scheme_size; ++index) {
      match_matrix[index][0] = index - 1;
    }
    for (int index = 1; index <= quantized_size; ++index) {
      match_matrix[0][index] = index - 1;
    }
    for (int scheme_index = 1; scheme_index <= scheme_size; ++scheme_index) {
      current_color = scheme_colors.get(scheme_index - 1);
      for (int quantized_index = 1; quantized_index <= quantized_size; ++quantized_index) {
        match_matrix[scheme_index][quantized_index] = current_color.cie_de_2000(quantized_colors.get(quantized_index - 1));
      }
    }
    for (int index = 0; index < quantized_size; ++index) {
      min = Double.MAX_VALUE;
      saved_scheme_index = -1;
      saved_quantized_index = -1;
      for (int scheme_index = 1; scheme_index <= scheme_size; ++scheme_index) {
        for (int quantized_index = 1; quantized_index <= quantized_size; ++quantized_index) {
          if (min > match_matrix[scheme_index][quantized_index]
            && match_matrix[scheme_index][0] != -1
            && match_matrix[0][quantized_index] != -1) {
            min = match_matrix[scheme_index][quantized_index];
            saved_scheme_index = scheme_index;
            saved_quantized_index = quantized_index;
          }
        }
      }
      match_matrix[saved_scheme_index][0] = -1;
      match_matrix[0][saved_quantized_index] = -1;
      mapping[saved_quantized_index - 1] = saved_scheme_index - 1;
    }
    this.quantized_to_scheme_mapping.put(scheme_number, mapping);
  }

  private Image generate_image_for_color_scheme(int scheme_index) {
    ColorScheme current_scheme = color_schemes[scheme_index];
    int[] quantized_to_color_scheme_map = quantized_to_scheme_mapping.get(scheme_index);
    int[] distinct_to_quantized_map = distinct_to_quantized_mapping.get(current_scheme.size());
    int number_of_distinct_colors = distinct_colors.size();
    Color scheme_color;
    for (int distinct_index = 0; distinct_index < number_of_distinct_colors; ++distinct_index) {
      scheme_color = current_scheme.colors.get(quantized_to_color_scheme_map[distinct_to_quantized_map[distinct_index]]);
      distinct_colors.get(distinct_index).mutate_to(scheme_color);
    }
    return image_from_actual_colors();
  }

  private void reset_distinct_color_values() {
    int number_of_colors = distinct_colors.size();
    for (int index = 0; index < number_of_colors; ++index) {
      this.distinct_colors.get(index).mutate_to(this.distinct_colors_backup.get(index));
    }
  }

  private Image image_from_actual_colors() {
    int number_of_actual_colors = this.actual_colors.size();
    int[] intermediate_array = new int[number_of_actual_colors];
    for (Color color : distinct_colors) {
      color.create_ARGB();
    }
    for (int color_index = 0; color_index < number_of_actual_colors; ++color_index) {
      intermediate_array[color_index] = this.actual_colors.get(color_index).argb;
    }
    return Image.createImage(intermediate_array, resized_width, resized_height);
  }

  private void add_quantized_image_for_debugging(int key) {
    ArrayList<Color> quantized_colors = quantized_samples.get(key);
    int[] distinct_to_quantized_map = distinct_to_quantized_mapping.get(key);
    int number_of_distinct_colors = distinct_colors.size();
    Color qauntized_color;
    for (int distinct_index = 0; distinct_index < number_of_distinct_colors; ++distinct_index) {
      qauntized_color = quantized_colors.get(distinct_to_quantized_map[distinct_index]);
      distinct_colors.get(distinct_index).mutate_to(qauntized_color);
    }
    images.add(image_from_actual_colors());
    reset_distinct_color_values();
  }
}
