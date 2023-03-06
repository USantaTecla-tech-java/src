package es.usantatecla.aX_menu.a5_package.views.options;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.utils.Console;

public class FindModelOption extends ModelOption {

  public FindModelOption(Model model) {
    super("Buscar", model);
  }

  public void interact() {
    String string;
    boolean ok;
    do {
      string = Console.getInstance().readString("Dame una cadena de caracteres: ").trim();
      ok = !string.equals("");
      if (!ok){
        Console.getInstance().writeln("Error! Introduce algún caracter");
      }
    } while (!ok);
    Console.getInstance().writeln((this.model.find(string) ? "Si" : "No") + " se encuentra");
  }

}
