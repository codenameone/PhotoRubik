package com.mycompany.myapp;

import com.codename1.ui.Image;

public class MosaicConverter {

  private Image image;
  private int[] image_array;
  private int width;
  private int height;

  public MosaicConverter() {

  }

  public MosaicConverter(int[] image_array, int width, int height) {

  }

  public MosaicConverter(RubikMosaic mosaic) {

  }

  public MosaicConverter(Image image) {

  }

  public Image image() {
    return image;
  }

  public int[] image_array() {
    return image_array;
  }

  public int width() {
    return width;
  }

  public int height() {
    return height;
  }
}
