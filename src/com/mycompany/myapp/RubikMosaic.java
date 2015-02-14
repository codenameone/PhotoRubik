package com.mycompany.myapp;

import com.codename1.ui.Container;
import com.codename1.ui.Image;
import com.codename1.ui.table.TableLayout;
import java.util.ArrayList;

public class RubikMosaic extends Container {

  private final int width;
  private final int height;
  private final int[] image_array;
  private boolean scrollable;

  public RubikMosaic(Image image) {
    super(new TableLayout(1, 1));
    setScrollable(true);
    scrollable = true;
    image_array = image.getRGB();
    RubikSquare square;
    RubikSide side;
    width = image.getWidth();
    height = image.getHeight();
    int cubes_x = width / Defaults.CUBE_SQUARES;
    int cubes_y = height / Defaults.CUBE_SQUARES;
    int cube_height = Defaults.CUBE_SQUARES;
    int cube_width = Defaults.CUBE_SQUARES;
    int pixel_position;
    setLayout(new TableLayout(cubes_y, cubes_x));
    for (int mosaic_line = 0; mosaic_line < cubes_y; ++mosaic_line) {
      for (int mosaic_col = 0; mosaic_col < cubes_x; ++mosaic_col) {
        side = new RubikSide(cube_height, cube_width);
        for (int cube_line = 0; cube_line < cube_height; ++cube_line) {
          for (int cube_col = 0; cube_col < cube_width; ++cube_col) {
            pixel_position = (mosaic_line * cube_width + cube_line) * width
              + (mosaic_col * cube_height + cube_col);
            square = new RubikSquare();
            square.color(image_array[pixel_position]);
            side.addComponent(square);
          }
        }
        addComponent(side);
      }
    }
  }

  public int width() {
    return width;
  }

  public int height() {
    return height;
  }

  public int[] image_array() {
    return image_array;
  }

  public void scale_reset() {
    int number_of_sides = getComponentCount();
    int number_of_squares;
    RubikSide rubik_side;
    RubikSquare rubik_square;
    for (int side_index = 0; side_index < number_of_sides; ++side_index) {
      rubik_side = (RubikSide) getComponentAt(side_index);
      number_of_squares = rubik_side.getComponentCount();
      for (int square_index = 0; square_index < number_of_squares; ++square_index) {
        rubik_square = (RubikSquare) rubik_side.getComponentAt(square_index);
        rubik_square.reset_padding();
      }
    }
  }

  public void scale_up() {
    int number_of_sides = getComponentCount();
    int number_of_squares;
    RubikSide rubik_side;
    RubikSquare rubik_square;
    for (int side_index = 0; side_index < number_of_sides; ++side_index) {
      rubik_side = (RubikSide) getComponentAt(side_index);
      number_of_squares = rubik_side.getComponentCount();
      for (int square_index = 0; square_index < number_of_squares; ++square_index) {
        rubik_square = (RubikSquare) rubik_side.getComponentAt(square_index);
        rubik_square.increase_padding();
      }
    }
  }

  public void scale_down() {
    int number_of_sides = getComponentCount();
    int number_of_squares;
    RubikSide rubik_side;
    RubikSquare rubik_square;
    for (int side_index = 0; side_index < number_of_sides; ++side_index) {
      rubik_side = (RubikSide) getComponentAt(side_index);
      number_of_squares = rubik_side.getComponentCount();
      for (int square_index = 0; square_index < number_of_squares; ++square_index) {
        rubik_square = (RubikSquare) rubik_side.getComponentAt(square_index);
        rubik_square.decrease_padding();
      }
    }
  }

  public ArrayList<Counter<RubikSide>> distinct_sides() {
    ArrayList<Counter<RubikSide>> result = new ArrayList<Counter<RubikSide>>();
    int number_of_sides = getComponentCount();
    boolean found;
    RubikSide rubik_side;
    Counter<RubikSide> current_side;
    for (int side_index = 0; side_index < number_of_sides; ++side_index) {
      found = false;
      rubik_side = (RubikSide) getComponentAt(side_index);
      for (int result_index = 0; result_index < result.size(); ++result_index) {
        current_side = result.get(result_index);
        if (rubik_side.equals(current_side.key())) {
          current_side.increment_value();
          found = true;
          break;
        }
      }
      if (!found) {
        result.add(new Counter(new RubikSide(rubik_side), 1));
      }
    }
    return result;
  }

  public void scrollable(boolean scrollable) {
    this.scrollable = scrollable;
  }

  @Override
  public void pointerDragged(int x, int y) {
    if (scrollable) {
      super.pointerDragged(x, y);
    }
  }

  @Override
  public void pointerDragged(int[] x, int[] y) {
    if (scrollable) {
      super.pointerDragged(x, y);
    }
  }
}
