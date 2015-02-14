package com.mycompany.myapp;

import com.codename1.ui.Dialog;

public class Logging {

  public static void exception(Throwable ex) {
    ex.printStackTrace();
    Dialog.show("Error", ex.toString() + "\n", "OK", "Cancel");
  }
}
