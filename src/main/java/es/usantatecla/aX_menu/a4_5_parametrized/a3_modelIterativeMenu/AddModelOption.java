package es.usantatecla.aX_menu.a4_5_parametrized.a3_modelIterativeMenu;

class AddModelOption extends Option<Model> {

    public AddModelOption(Model model) {
        super("Añadir", model);
    }

    public void interact() {
        String string;
        do {
            string = Console.getInstance().readString("Dame una cadena de caracteres: ");
        } while (string.trim().equals(""));
        this.getTarget().add(string.trim());
    }

}
