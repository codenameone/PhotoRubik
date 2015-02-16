package com.mycompany.myapp;

import com.codename1.ui.Dialog;

public class Log {

  public static enum Level {

    DEBUG(0),
    INFO(1),
    WARN(2),
    ERROR(3),
    FATAL(4),
    UNKNOWN(5);

    private final int value;

    private Level(int value) {
      this.value = value;
    }

    public int value() {
      return this.value;
    }
  };

  private static Level log_level = Log.Level.DEBUG;

  public static void level(Log.Level level) {
    log_level = level;
  }

  public static Log.Level level() {
    return log_level;
  }

  public static void debug(String message) {
    Dialog.show("Debug", message + "\n", "OK", "Cancel");
  }

  public static void debug(Throwable error) {
    error.printStackTrace();
    Dialog.show("Debug", error.toString() + "\n", "OK", "Cancel");
  }

  public static void debug(String message, Throwable error) {
    error.printStackTrace();
    Dialog.show("Debug", message + "\n", "OK", "Cancel");
  }

  public static void info(String message) {
    Dialog.show("Info", message + "\n", "OK", "Cancel");
  }

  public static void info(Throwable error) {
    error.printStackTrace();
    Dialog.show("Info", error.toString() + "\n", "OK", "Cancel");
  }

  public static void info(String message, Throwable error) {
    error.printStackTrace();
    Dialog.show("Info", message + "\n", "OK", "Cancel");
  }

  public static void warn(String message) {
    Dialog.show("Warn", message + "\n", "OK", "Cancel");
  }

  public static void warn(Throwable error) {
    error.printStackTrace();
    Dialog.show("Warn", error.toString() + "\n", "OK", "Cancel");
  }

  public static void warn(String message, Throwable error) {
    error.printStackTrace();
    Dialog.show("Warn", message + "\n", "OK", "Cancel");
  }

  public static void error(String message) {
    Dialog.show("Error", message + "\n", "OK", "Cancel");
  }

  public static void error(Throwable error) {
    error.printStackTrace();
    Dialog.show("Error", error.toString() + "\n", "OK", "Cancel");
  }

  public static void error(String message, Throwable error) {
    error.printStackTrace();
    Dialog.show("Error", message + "\n", "OK", "Cancel");
  }

  public static void fatal(String message) {
    Dialog.show("Fatal", message + "\n", "OK", "Cancel");
  }

  public static void fatal(Throwable error) {
    error.printStackTrace();
    Dialog.show("Fatal", error.toString() + "\n", "OK", "Cancel");
  }

  public static void fatal(String message, Throwable error) {
    error.printStackTrace();
    Dialog.show("Fatal", message + "\n", "OK", "Cancel");
  }

  public static void unknown(String message) {
    Dialog.show("Error", message + "\n", "OK", "Cancel");
  }

  public static void unknown(Throwable error) {
    error.printStackTrace();
    Dialog.show("Error", error.toString() + "\n", "OK", "Cancel");
  }

  public static void unknown(String message, Throwable error) {
    error.printStackTrace();
    Dialog.show("Error", message + "\n", "OK", "Cancel");
  }
}
