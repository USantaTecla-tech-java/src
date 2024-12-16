package es.usantatecla.aX_menu.a4_5_parametrized.a4_modelDynamicMenu;

class ModelDynamicMenu extends DynamicMenu<Model> {

    public ModelDynamicMenu(Model model) {
        super("Model Dynamic Menu", model);
        this.addOptions();
    }

    protected void addOptions() {
        for (int i = 0; i < this.getTarget().size(); i++) {
            this.add(new RemoveModelOption(this.getTarget(), i));
        }
    }

}
