package es.usantatecla.aX_menu.a4_5_parametrized.a2_modelQuitMenu;

class ModelQuitMenu extends QuitMenu<Model> {

    public ModelQuitMenu(Model model) {
        super("Model Quit Menu", model);
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.getTarget()));
        this.add(new InverseListModelOption(this.getTarget()));
        this.add(new FindModelOption(this.getTarget()));
    }

}
