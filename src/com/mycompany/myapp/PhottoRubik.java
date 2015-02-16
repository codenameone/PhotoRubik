package com.mycompany.myapp;

import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.SideMenuBar;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import java.io.IOException;

public class PhottoRubik {

  private Form current;

  public void init(Object context) {
    try {
      Resources theme = Resources.openLayered("/theme");
      UIManager.getInstance().setThemeProps(
        theme.getTheme(theme.getThemeResourceNames()[0])
      );
      UIManager.getInstance().getLookAndFeel()
        .setMenuBarClass(SideMenuBar.class);
    }
    catch (IOException ex) {
      Log.error(ex);
    }
    Log.Level.
  }

  public void start() {
    if (current != null) {
      current.show();
      return;
    }
    Application app = Application.instance();
    app.show();
  }

  public void stop() {
    current = Display.getInstance().getCurrent();
  }

  public void destroy() {
  }
}
