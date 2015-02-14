package com.mycompany.myapp;

public class CubeSide {

  private final int size;
  private int[][] side;
  private int cell;

  public CubeSide() {
    this.size = 3;
    this.side = new int[3][3];
  }

  public CubeSide(int size) {
    this.size = 3;
    this.side = new int[3][3];
  }

  public CubeSide(int size, int cubeSide) {
    this.size = size;
    this.side = new int[size][size];
    assign_to_side(cubeSide);
  }

  public CubeSide(int size, int[][] sideMatrix) {
    this.size = size;
    this.side = sideMatrix.clone();
  }

  public CubeSide(CubeSide side) {
    this.size = side.size;
    this.side = side.getSideMatrix();
  }

  private static boolean equals(int[][] firstMatrix, int[][] secondMatrix, int size) {
    for (int i = 0; i < size; ++i) {
      for (int j = 0; j < size; ++j) {
        if (firstMatrix[i][j] != secondMatrix[i][j]) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean equals(CubeSide otherSide) {
    if (this.size != otherSide.size()) {
      return false;
    }
    int[][] otherMatrix = otherSide.getSideMatrix();
    return equals(this.side, otherMatrix, this.size);
  }

  public boolean isEquivalent(CubeSide otherSide) {
    int[][] comparedMatrix = otherSide.getSideMatrix();
    for (int i = 0; i < 4; ++i) {
      if (equals(this.side, comparedMatrix, this.size)) {
        return true;
      }
      if (i != 3) {
        comparedMatrix = rotated_matrix(comparedMatrix, this.size);
      }
    }
    return false;
  }

  public void rotateLeft() {
    int matrix[][] = clone_matrix(this.side, this.size);
    for (int i = 0; i < size; ++i) {
      for (int j = 0; j < size; ++j) {
        this.cell = this.side[i][j];
        this.side[i][j] = matrix[j][size - i - 1];
      }
    }
  }

  public void rotateRight() {
    int matrix[][] = clone_matrix(this.side, this.size);
    for (int i = 0; i < size; ++i) {
      for (int j = 0; j < size; ++j) {
        this.cell = this.side[i][j];
        this.side[i][j] = matrix[size - j - 1][i];
      }
    }
  }

  private int[][] rotated_matrix(int[][] matrix, int size) {
    int[][] rotatedMatrix = new int[size][size];
    for (int i = 0; i < size; ++i) {
      for (int j = 0; j < size; ++j) {
        rotatedMatrix[i][j] = matrix[size - j - 1][i];
      }
    }
    return rotatedMatrix;
  }

  private void assign_to_side(int parentSide) {
    for (int i = 0; i < this.size; ++i) {
      for (int j = 0; j < this.size; ++j) {
        this.side[i][j] = parentSide;
      }
    }
  }

  public int[][] getSideMatrix() {
    return clone_matrix(this.side, this.size);
  }

  public int[] row(int row) {
    int[] result = new int[this.size];
    copy_row(result, row);
    return result;
  }

  public int[] column(int column) {
    int[] result = new int[this.size];
    copy_column(result, column);
    return result;
  }

  public int size() {
    return this.size;
  }

  private void copy_row(int[] to, int rowNumber) {
    for (int i = 0; i < this.size; ++i) {
      to[i] = this.side[rowNumber][i];
    }
  }

  private void copy_column(int[] to, int columnNumber) {
    for (int i = 0; i < this.size; ++i) {
      to[i] = this.side[i][columnNumber];
    }
  }

  public void row(int[] from, int rowNumber) {
    for (int i = 0; i < this.size; ++i) {
      this.side[rowNumber][i] = from[i];
    }
  }

  public void column(int[] from, int columnNumber) {
    for (int i = 0; i < this.size; ++i) {
      this.side[i][columnNumber] = from[i];
    }
  }

  public void side(CubeSide side) {
    this.side = side.getSideMatrix();
  }

  private static int[][] clone_matrix(int[][] matrix, int size) {
    int[][] result = new int[size][size];
    for (int i = 0; i < size; ++i) {
      for (int j = 0; j < size; ++j) {
        result[i][j] = matrix[i][j];
      }
    }
    return result;
  }
}
