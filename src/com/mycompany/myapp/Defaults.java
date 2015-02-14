package com.mycompany.myapp;

class Defaults {

  // Default values
  public static final int CUBES = 40;
  public static final int CUBE_SQUARES = 3;
  public static final int MAX_CUBES = 10000;
  public static final int GRID_SCALE = 7;
  public static final double MAX_DELTA = Double.MAX_VALUE;
  public static final int CN_BLACK = (int) 0xFF000000;
  public static final int CN_GREY = (int) 0xFF444444;
  public static String[] COLOR_NAMES = {"Blue", "Green", "Orange", "Red", "White", "Yellow"};

  //Default cube color schemes (Pantone C)
  public static final int[] COLORS_COMPLETE = new int[]{
    0x003DA5, //BLUE
    0x009A44, //GREEN
    0xFE5000, //ORANGE
    0xBA0C2F, //RED
    0xFFFFFF, //WHITE
    0xFFD700 //YELLOW
  };
  public static final int[] COLORS_NO_BLUE = new int[]{
    0x009A44, //GREEN
    0xFE5000, //ORANGE
    0xBA0C2F, //RED
    0xFFFFFF, //WHITE
    0xFFD700 //YELLOW
  };
  public static final int[] COLORS_NO_GREEN = new int[]{
    0x003DA5, //BLUE
    0xFE5000, //ORANGE
    0xBA0C2F, //RED
    0xFFFFFF, //WHITE
    0xFFD700 //YELLOW
  };
  public static final int[] COLORS_NO_ORANGE = new int[]{
    0x003DA5, //BLUE
    0x009A44, //GREEN
    0xBA0C2F, //RED
    0xFFFFFF, //WHITE
    0xFFD700 //YELLOW
  };
  public static final int[] COLORS_NO_RED = new int[]{
    0x003DA5, //BLUE
    0x009A44, //GREEN
    0xFE5000, //ORANGE
    0xFFFFFF, //WHITE
    0xFFD700 //YELLOW
  };
  public static final int[] COLORS_NO_WHITE = new int[]{
    0x003DA5, //BLUE
    0x009A44, //GREEN
    0xFE5000, //ORANGE
    0xBA0C2F, //RED
    0xFFD700 //YELLOW
  };
  public static final int[] COLORS_NO_YELLOW = new int[]{
    0x003DA5, //BLUE
    0x009A44, //GREEN
    0xFE5000, //ORANGE
    0xBA0C2F, //RED
    0xFFFFFF //WHITE
  };
}
