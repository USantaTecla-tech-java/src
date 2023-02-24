package es.usantatecla.aX_menu.a4_extends;

class RemoveModelsOption extends ModelOption {

    public RemoveModelsOption(Model model) {
        super("Eliminar", model);
    }

    @Override
    public void interact() {
        new ModelDynamicMenu(this.model).interact();
    }
}
