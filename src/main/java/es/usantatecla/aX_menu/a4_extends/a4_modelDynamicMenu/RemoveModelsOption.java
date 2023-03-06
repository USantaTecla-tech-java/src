package es.usantatecla.aX_menu.a4_extends.a4_modelDynamicMenu;

class RemoveModelsOption extends ModelOption {

    public RemoveModelsOption(Model model) {
        super("Eliminar", model);
    }

    public void interact() {
        new ModelDynamicMenu(this.model).interact();
    }
}
