package com.mycompany.myapp;

import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.plaf.Style;

public class RubikSquare extends Container {

  public RubikSquare() {
    super();
    setUIID("RubiksCubeSquare");
  }

  public RubikSquare(RubikSquare other) {
    this();
    setUnselectedStyle(new Style(other.getUnselectedStyle()));
  }

  @Override
  public void pointerPressed(int x, int y) {
    change_component_color();
    super.pointerPressed(x, y);
  }

  @Override
  public void pointerDragged(int x, int y) {
    change_component_color();
    super.pointerPressed(x, y);
  }

  private void change_component_color() {
    if (Application.instance().colorable) {
      Style style = getUnselectedStyle();
      String color_name = (String) Application.instance().colors_combo.getSelectedItem();
      int selected_color = Application.instance().colors_map.get(color_name);
      style.setBgColor(selected_color);
      revalidate();
    }
  }

  public void color(int color) {
    Style new_look = getSelectedStyle();
    new_look.setBgColor((int) (color & 0x00FFFFFF));
    setUnselectedStyle(new_look);
  }

  public void increase_padding() {
    Style style = getUnselectedStyle();
    int new_padding = style.getPadding(Component.TOP) + 1;
    style.setPadding(new_padding, new_padding, new_padding, new_padding);
    style.setPaddingUnit(null);
    setUnselectedStyle(style);
  }

  public void decrease_padding() {
    Style style = getUnselectedStyle();
    int new_padding = style.getPadding(Component.TOP);
    if (new_padding > 4) {
      --new_padding;
    }
    style.setPadding(new_padding, new_padding, new_padding, new_padding);
    style.setPaddingUnit(null);
    setUnselectedStyle(style);
  }

  public void reset_padding() {
    Style style = getUnselectedStyle();
    int new_padding = 4;
    style.setPadding(new_padding, new_padding, new_padding, new_padding);
    style.setPaddingUnit(null);
    setUnselectedStyle(style);
  }

  public boolean equals(RubikSquare other) {
    int current_color = getUnselectedStyle().getBgColor();
    int other_color = other.getUnselectedStyle().getBgColor();
    return current_color == other_color;
  }
}
