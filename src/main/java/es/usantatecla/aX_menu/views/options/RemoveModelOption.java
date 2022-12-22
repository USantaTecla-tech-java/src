package es.usantatecla.aX_menu.views.options;

import es.usantatecla.aX_menu.models.Model;

public class RemoveModelOption extends ModelOption {

    private Model model;
    private int index;

    public RemoveModelOption(Model model, int index) {
        super("Eliminar ", model);
        this.model = model;
        this.index = index;
    }

    protected String getTitle() {
        return super.getTitle() + ": " + model.get(this.index);
    }

    @Override
    public void interact() {
        this.model.remove(this.index);
    }

}
