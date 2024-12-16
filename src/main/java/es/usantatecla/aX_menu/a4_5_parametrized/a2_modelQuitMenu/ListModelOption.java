package es.usantatecla.aX_menu.a4_5_parametrized.a2_modelQuitMenu;

class ListModelOption extends Option<Model> {

    public ListModelOption(Model model) {
        super("Listar", model);
    }

    public void interact() {
        for (int i = 0; i < this.getTarget().size(); i++) {
            Console.getInstance().writeln((i + 1) + ". " + this.getTarget().get(i));
        }
        Console.getInstance().writeln();
    }

}
