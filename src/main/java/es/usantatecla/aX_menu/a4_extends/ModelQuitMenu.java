package es.usantatecla.aX_menu.a4_extends;

class ModelQuitMenu extends QuitMenu {

    private Model model;

    public ModelQuitMenu(Model model) {
        super("Model Quit Menu");
        this.model = model;
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
    }

    public static void main(String[] args) {
        ModelQuitMenu modelQuitMenu = new ModelQuitMenu(new Model());
        modelQuitMenu.interact();
    }
}
