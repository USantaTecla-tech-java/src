package es.usantatecla.aX_menu.a4_5_parametrized.a4_modelDynamicMenu;

class RemoveModelOption extends Option<Model> {

    private int index;

    public RemoveModelOption(Model model, int index) {
        super("Eliminar ", model);
        this.index = index;
    }

    protected String getTitle() {
        return super.getTitle() + ": " + this.getTarget().get(this.index);
    }

    public void interact() {
        this.getTarget().remove(this.index);
    }

}
