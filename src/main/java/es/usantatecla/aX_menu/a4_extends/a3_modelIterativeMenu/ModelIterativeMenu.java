package es.usantatecla.aX_menu.a4_extends.a3_modelIterativeMenu;

class ModelIterativeMenu extends IterativeMenu {

    private Model model;

    public ModelIterativeMenu(Model model) {
        super("Model Iterative Menu");
        this.model = model;
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
        this.add(new FindModelOption(this.model));
    }

}
