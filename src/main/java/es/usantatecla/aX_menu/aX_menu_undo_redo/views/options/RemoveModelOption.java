package es.usantatecla.aX_menu.aX_menu_undo_redo.views.options;

import es.usantatecla.aX_menu.aX_menu_undo_redo.models.Model;

public class RemoveModelOption extends RegistrableModelOption {

    private Model model;
    private int index;
    private String string;

    public RemoveModelOption(Model model, int index, Registry registry) {
        super("Eliminar ", model, registry);
        this.model = model;
        this.index = index;
    }

    protected String getTitle() {
        return super.getTitle() + ": " + model.get(this.index);
    }

    @Override
    public void interact() {
        this.string = this.model.get(this.index);
        this.model.remove(this.index);
        this.registry.register(this);
    }

    @Override
    public void undo() {
        this.model.add(this.string);
    }

    @Override
    public void redo() {
        this.model.remove(this.index);
    }

}
