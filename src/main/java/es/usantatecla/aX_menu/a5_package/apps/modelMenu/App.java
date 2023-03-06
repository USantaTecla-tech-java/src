package es.usantatecla.aX_menu.a5_package.apps.modelMenu;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.views.menus.ModelMenu;

public class App {
  
  public static void main(String[] args) {
    new ModelMenu(new Model()).interact();
}
}
