package es.usantatecla.aX_menu.a5_package.app;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.views.menus.ModelIterativeMenu;

class App {
  
  public static void main(String[] args) {
    new ModelIterativeMenu(new Model()).interact();
}
}
