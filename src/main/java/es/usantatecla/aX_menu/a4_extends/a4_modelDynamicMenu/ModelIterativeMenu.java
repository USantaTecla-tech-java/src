package es.usantatecla.aX_menu.a4_extends.a4_modelDynamicMenu;

class ModelIterativeMenu extends IterativeMenu {

    private Model model;

    public ModelIterativeMenu(Model model) {
        super("Model Iterative Dynamic Menu");
        this.model = model;
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
        this.add(new FindModelOption(this.model));
        this.add(new AddModelOption(this.model));
        this.add(new RemoveModelsOption(this.model));
    }

}
