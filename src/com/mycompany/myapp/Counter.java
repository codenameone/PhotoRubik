package com.mycompany.myapp;

import java.util.Comparator;

public class Counter<K> {

  private final K key;
  private int value;

  public Counter(K key) {
    this.key = key;
    this.value = 0;
  }

  public Counter(K key, int value) {
    this.key = key;
    this.value = value;
  }

  public K key() {
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

  public static Comparator<Counter> value_comparator_reverse = new Comparator<Counter>() {
    public int compare(Counter first, Counter second) {
      return second.value() - first.value();
    }
  };
}
