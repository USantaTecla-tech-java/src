package es.usantatecla.aX_menu.a4_extends.a1_modelMenu;

class InverseListModelOption extends ModelOption {

    public InverseListModelOption(Model model) {
        super("Listar inverso", model);
    }

    public void interact() {
        for (int i = this.model.size() - 1; i >= 0; i--) {
            Console.getInstance().writeln((i + 1) + ". " + this.model.get(i));
        }
        Console.getInstance().writeln();
    }

}
