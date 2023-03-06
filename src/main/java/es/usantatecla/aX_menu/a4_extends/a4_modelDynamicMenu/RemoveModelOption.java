package es.usantatecla.aX_menu.a4_extends.a4_modelDynamicMenu;

class RemoveModelOption extends ModelOption {

    private int index;

    public RemoveModelOption(Model model, int index) {
        super("Eliminar ", model);
        this.index = index;
    }

    protected String getTitle() {
        return super.getTitle() + ": " + this.model.get(this.index);
    }

    public void interact() {
        this.model.remove(this.index);
    }

}
