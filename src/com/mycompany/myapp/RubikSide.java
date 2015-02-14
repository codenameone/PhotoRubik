package com.mycompany.myapp;

import com.codename1.ui.Container;
import com.codename1.ui.table.TableLayout;

public class RubikSide extends Container {

  public RubikSide(int cube_height, int cube_width) {
    super(new TableLayout(cube_height, cube_width));
    setUIID("RubiksCubeSide");
  }

  private RubikSide(TableLayout layout) {
    this(layout.getRows(), layout.getColumns());
  }

  public RubikSide(RubikSide other) {
    this((TableLayout) other.getLayout());
    int number_of_squares = other.getComponentCount();
    for (int index = 0; index < number_of_squares; ++index) {
      addComponent(new RubikSquare((RubikSquare) other.getComponentAt(index)));
    }
  }

  public boolean equals(RubikSide other) {
    int number_of_squares = getComponentCount();
    RubikSquare[] current_square_array = new RubikSquare[number_of_squares];
    RubikSquare[] other_square_array = new RubikSquare[number_of_squares];
    for (int index = 0; index < number_of_squares; ++index) {
      current_square_array[index] = (RubikSquare) getComponentAt(index);
      other_square_array[index] = (RubikSquare) other.getComponentAt(index);
    }
    if (equal_arrays(current_square_array, other_square_array)) {
      return true;
    }
    rotate_90_degrees(other_square_array);
    if (equal_arrays(current_square_array, other_square_array)) {
      return true;
    }
    rotate_90_degrees(other_square_array);
    if (equal_arrays(current_square_array, other_square_array)) {
      return true;
    }
    rotate_90_degrees(other_square_array);
    if (equal_arrays(current_square_array, other_square_array)) {
      return true;
    }
    return false;
  }

  private boolean equal_arrays(RubikSquare[] first, RubikSquare[] second) {
    for (int index = 0; index < first.length; ++index) {
      if (!first[index].equals(second[index])) {
        return false;
      }
    }
    return true;
  }

  private void rotate_90_degrees(RubikSquare[] array) {
    int size = (int) Math.round(Math.sqrt(array.length));
    int line_size = size / 2;
    int column_size;
    RubikSquare carry;
    for (int line = 0; line < line_size; line++) {
      column_size = size - line - 1;
      for (int column = line; column < column_size; column++) {
        carry = array[line * size + column];
        array[line * size + column] = array[column * size + size - line - 1];
        array[column * size + size - line - 1] = array[(size - line - 1) * size + size - column - 1];
        array[(size - line - 1) * size + size - column - 1] = array[(size - column - 1) * size + line];
        array[(size - column - 1) * size + line] = carry;
      }
    }
  }
}
