package es.usantatecla.aX_menu.a9_lambda;

class ModelDynamicMenu extends DynamicMenu<Model> {

    public ModelDynamicMenu(Model model) {
        super("Model Dynamic Menu", model);
        this.addOptions();
    }

    protected void addOptions() {
        for (int i = 0; i < this.getTarget().size(); i++) {
            final int index = i;
            this.add("Eliminar : " + this.getTarget().get(index), (Model model) -> {
                    model.remove(index);
                });
        }
    }

}
