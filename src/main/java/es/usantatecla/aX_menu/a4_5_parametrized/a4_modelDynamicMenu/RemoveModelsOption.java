package es.usantatecla.aX_menu.a4_5_parametrized.a4_modelDynamicMenu;

class RemoveModelsOption extends Option<Model> {

    public RemoveModelsOption(Model model) {
        super("Eliminar", model);
    }

    public void interact() {
        new ModelDynamicMenu(this.getTarget()).interact();
    }
}
