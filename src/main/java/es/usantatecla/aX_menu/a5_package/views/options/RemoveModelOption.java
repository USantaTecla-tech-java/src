package es.usantatecla.aX_menu.a5_package.views.options;

import es.usantatecla.aX_menu.a5_package.models.Model;

public class RemoveModelOption extends ModelOption {

    private int index;

    public RemoveModelOption(Model model, int index) {
        super("Eliminar ", model);
        this.index = index;
    }

    protected String getTitle() {
        return super.getTitle() + ": " + model.get(this.index);
    }

    public void interact() {
        this.model.remove(this.index);
    }

}
