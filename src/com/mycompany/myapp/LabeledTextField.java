package com.mycompany.myapp;

import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.table.TableLayout;

public class LabeledTextField extends Container {

  private final TextField text_field;

  public LabeledTextField(String label_value, String text_field_value) {
    super(new TableLayout(2, 1));
    addComponent(new Label(label_value));
    text_field = new TextField(text_field_value);
    addComponent(text_field);
  }

  public TextField text_field() {
    return text_field;
  }
}
