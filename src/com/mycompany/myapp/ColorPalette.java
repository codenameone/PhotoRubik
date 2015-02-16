package com.mycompany.myapp;

import com.codename1.ui.plaf.Style;
import java.util.ArrayList;
import java.util.HashMap;

public class ColorPalette {

  public HashMap<Integer, Style> styles;
  public ArrayList<Color> colors;

  public ColorPalette(int[] colors) {
    this.styles = new HashMap<Integer, Style>();
    this.colors = new ArrayList<Color>();
    RubikSquare square = new RubikSquare();
    Style style = square.getUnselectedStyle();
    Color new_color;
    Style new_style;
    int color;
    int color_number = colors.length;
    for (int index = 0; index < color_number; ++index) {
      new_style = new Style(style);
      new_color = new Color(colors[index]);
      color = new_color.argb & 0x00FFFFFF;
      new_style.setBgColor(color);
      this.styles.put(color, new_style);
      this.colors.add(new_color);
    }
  }

  public int size() {
    return colors.size();
  }
}
