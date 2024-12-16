package es.usantatecla.aX_menu.a4_5_parametrized.a2_modelQuitMenu;

class InverseListModelOption extends Option<Model> {

    public InverseListModelOption(Model model) {
        super("Listar inverso", model);
    }

    public void interact() {
        for (int i = this.getTarget().size() - 1; i >= 0; i--) {
            Console.getInstance().writeln((i + 1) + ". " + this.getTarget().get(i));
        }
        Console.getInstance().writeln();
    }

}
