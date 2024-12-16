package es.usantatecla.aX_menu.a4_5_parametrized.a4_modelDynamicMenu;

class ModelIterativeMenu extends IterativeMenu<Model> {

    public ModelIterativeMenu(Model model) {
        super("Model Iterative Dynamic Menu", model);
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.getTarget()));
        this.add(new InverseListModelOption(this.getTarget()));
        this.add(new FindModelOption(this.getTarget()));
        this.add(new AddModelOption(this.getTarget()));
        this.add(new RemoveModelsOption(this.getTarget()));
    }

}
