package es.usantatecla.aX_menu.a4_extends.a4_modelDynamicMenu;

class AddModelOption extends ModelOption {

    public AddModelOption(Model model) {
        super("Añadir", model);
    }

    public void interact() {
        String string;
        do {
            string = Console.getInstance().readString("Dame una cadena de caracteres: ");
        } while (string.trim().equals(""));
        model.add(string.trim());
    }

}
