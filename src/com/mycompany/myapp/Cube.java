package com.mycompany.myapp;

public class Cube {

  private ColorPalette colorScheme;

  protected static final int FRONT = 0;
  protected static final int BACK = 1;
  protected static final int LEFT = 2;
  protected static final int RIGHT = 3;
  protected static final int UP = 4;
  protected static final int DOWN = 5;

  protected CubeSide cubeSides[];
  protected final int cubeRows;
  private int[] line;
  private int cell;

  public Cube() {
    this.colorScheme = null; //Default color Scheme
    this.cubeRows = 0; //Default number of rows
    this.line = new int[this.cubeRows];
    this.cubeSides = new CubeSide[6];
    for (int i = 0; i < 6; ++i) {
      this.cubeSides[i] = new CubeSide(this.cubeRows, i);
    }
  }

  public Cube(int cubeRows) {
    this.colorScheme = null; //Default color Scheme
    this.cubeRows = cubeRows < 1 || cubeRows > 25 ? 0 : cubeRows;
    this.line = new int[this.cubeRows];
    this.cubeSides = new CubeSide[6];
    for (int i = 0; i < 6; ++i) {
      this.cubeSides[i] = new CubeSide(this.cubeRows, i);
    }
  }

  public Cube(ColorPalette colorScheme) {
    this.colorScheme = colorScheme;
    this.cubeSides = new CubeSide[6];
    this.cubeRows = 0;
    this.line = new int[this.cubeRows];
    for (int i = 0; i < 6; ++i) {
      this.cubeSides[i] = new CubeSide(this.cubeRows, i);
    }
  }

  public Cube(Cube cube) {
    this.colorScheme = cube.color_scheme();
    this.cubeSides = new CubeSide[6];
    this.cubeRows = cube.cube_size();
    this.line = new int[this.cubeRows];
    for (int i = 0; i < 6; ++i) {
      this.cubeSides[i] = new CubeSide(cube.side(i));
    }
  }

  public Cube(int cubeRows, ColorPalette colorScheme) {
    this.colorScheme = colorScheme;
    this.cubeSides = new CubeSide[6];
    this.cubeRows = cubeRows < 1 || cubeRows > 25 ? 0 : cubeRows;
    this.line = new int[this.cubeRows];
    for (int i = 0; i < 6; ++i) {
      this.cubeSides[i] = new CubeSide(this.cubeRows, i);
    }
  }

  private void rotateH(int row, int face1, int face2, int face3, int face4) {
    copy_line(line, this.cubeSides[face1].row(row));
    this.cubeSides[face1].row(this.cubeSides[face2].row(row), row);
    this.cubeSides[face2].row(this.cubeSides[face3].row(row), row);
    this.cubeSides[face3].row(this.cubeSides[face4].row(row), row);
    this.cubeSides[face4].row(line, row);
  }

  private void rotateV(int column, int face1, int face2, int face3, int face4) {
    copy_line(line, this.cubeSides[face1].row(column));
    this.cubeSides[face1].row(this.cubeSides[face2].row(column), column);
    this.cubeSides[face2].row(reverse_line(this.cubeSides[face3].row(this.cubeRows - column - 1)), column);
    this.cubeSides[face3].row(reverse_line(this.cubeSides[face4].row(column)), this.cubeRows - column - 1);
    this.cubeSides[face4].row(line, column);
  }

  private void rotatePUp(int segment, int face1, int face2, int face3, int face4) {
    copy_line(line, this.cubeSides[face1].column(segment));
    this.cubeSides[face1].column(this.cubeSides[face2].row(this.cubeRows - segment - 1), segment);
    this.cubeSides[face2].row(reverse_line(this.cubeSides[face3].column(this.cubeRows - segment - 1)),
      this.cubeRows - segment - 1);
    this.cubeSides[face3].column(this.cubeSides[face4].row(segment), segment);
    this.cubeSides[face4].row(line, segment);
  }

  private void rotatePDown(int segment, int face1, int face2, int face3, int face4) {
    copy_line(line, this.cubeSides[face1].column(segment));
    this.cubeSides[face1].column(reverse_line(this.cubeSides[face2].row(segment)), segment);
    this.cubeSides[face2].row(this.cubeSides[face3].column(this.cubeRows - segment - 1), segment);
    this.cubeSides[face3].column(reverse_line(this.cubeSides[face4].row(this.cubeRows - segment - 1)),
      this.cubeRows - segment - 1);
    this.cubeSides[face4].row(line, this.cubeRows - segment - 1);
  }

  public void horQLeft(int row) {
    rotateH(row, FRONT, RIGHT, BACK, LEFT);
    if (row == 0) {
      cubeSides[UP].rotateRight();
    }
    else if (row == this.cubeRows - 1) {
      cubeSides[DOWN].rotateLeft();
    }
  }

  public void horQRight(int row) {
    rotateH(row, FRONT, LEFT, BACK, RIGHT);
    if (row == 0) {
      cubeSides[UP].rotateLeft();
    }
    else if (row == this.cubeRows - 1) {
      cubeSides[DOWN].rotateRight();
    }
  }

  public void verQUp(int column) {
    rotateV(column, FRONT, DOWN, BACK, UP);
    if (column == 0) {
      cubeSides[LEFT].rotateLeft();
    }
    else if (column == this.cubeRows - 1) {
      cubeSides[RIGHT].rotateRight();
    }
  }

  public void verQDown(int column) {
    rotateV(column, FRONT, UP, BACK, DOWN);
    if (column == 0) {
      cubeSides[LEFT].rotateRight();
    }
    else if (column == this.cubeRows - 1) {
      cubeSides[RIGHT].rotateLeft();
    }
  }

  public void parQUp(int column) {
    rotatePUp(column, LEFT, DOWN, RIGHT, UP);
    if (column == 0) {
      cubeSides[BACK].rotateRight();
    }
    else if (column == this.cubeRows - 1) {
      cubeSides[FRONT].rotateLeft();
    }
  }

  public void parQDown(int column) {
    rotatePDown(column, LEFT, UP, RIGHT, DOWN);
    if (column == 0) {
      cubeSides[BACK].rotateLeft();
    }
    else if (column == this.cubeRows - 1) {
      cubeSides[FRONT].rotateRight();
    }
  }

  public void horHLeft(int row) {
    horQLeft(row);
    horQLeft(row);
  }

  public void horHRight(int row) {
    horQRight(row);
    horQRight(row);
  }

  public void verHUp(int column) {
    verQUp(column);
    verQUp(column);
  }

  public void verHDown(int column) {
    verQDown(column);
    verQDown(column);
  }

  public void parHUp(int column) {
    parQUp(column);
    parQUp(column);
  }

  public void parHDown(int column) {
    parQDown(column);
    parQDown(column);
  }

  private void copy_line(int[] to, int[] from) {
    for (int i = 0; i < this.cubeRows; ++i) {
      to[i] = from[i];
    }
  }

  private int[] reverse_line(int[] line) {
    for (int i = 0; i < this.cubeRows / 2; ++i) {
      cell = line[i];
      line[i] = line[this.cubeRows - i - 1];
      line[this.cubeRows - i - 1] = cell;
    }
    return line;
  }

  private String side_name(int side) {
    switch (side) {
      case 0:
        return "front";
      case 1:
        return "back";
      case 2:
        return "left";
      case 3:
        return "right";
      case 4:
        return "up";
      case 5:
        return "down";
      default:
        return "invalid side";
    }
  }

  public int has_side(CubeSide side) {
    for (int i = 0; i < 6; ++i) {
      if (this.cubeSides[i].isEquivalent(side)) {
        return i;
      }
    }
    return -1;
  }

  public ColorPalette color_scheme() {
    return colorScheme;
  }

  public int cube_size() {
    return this.cubeRows;
  }

  public CubeSide side(int side) {
    return new CubeSide(this.cubeSides[side]);
  }

  public void color_cheme(ColorPalette color_scheme) {
		//TODO this
    //this.colorScheme = new ColorScheme(color_scheme);
  }
}
