package com.mycompany.myapp;

import java.util.Comparator;

public class Counter<KEY> {

  private final KEY key;
  private int value;

  public static Comparator<Counter> reverse_order = new Comparator<Counter>() {
    public int compare(Counter first, Counter second) {
      return second.value() - first.value();
    }
  };

  public static Comparator<Counter> natural_order = new Comparator<Counter>() {
    public int compare(Counter first, Counter second) {
      return first.value() - second.value();
    }
  };

  public Counter(KEY key) {
    this.key = key;
    this.value = 0;
  }

  public Counter(KEY key, int value) {
    this.key = key;
    this.value = value;
  }

  public KEY key() {
    return key;
  }

  public int value() {
    return value;
  }

  public void value(int value) {
    this.value = value;
  }

  public void increment_value() {
    ++value;
  }
}
