package es.usantatecla.aX_menu.a4_extends;

class ModelDynamicMenu extends DynamicMenu {

    private Model model;

    public ModelDynamicMenu(Model model) {
        super("Model Dynamic Menu");
        this.model = model;
        this.addOptions();

    }

    @Override
    protected void addOptions() {
        for (int i = 0; i < model.size(); i++) {
            this.add(new RemoveModelOption(model, i));
        }
    }

}
