package es.usantatecla.aX_menu.a4_extends.a1_modelMenu;

class FindModelOption extends ModelOption {

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
