package es.usantatecla.aX_menu_undo_redo.views.options;

import es.usantatecla.aX_menu_undo_redo.models.Model;
import es.usantatecla.aX_menu_undo_redo.views.menus.ModelDynamicMenu;

public class RemoveModelsOption extends ModelOption {

    private Registry registry;

    public RemoveModelsOption(Model model, Registry registry) {
        super("Eliminar", model);
        this.registry = registry;
    }

    @Override
    public void interact() {
        new ModelDynamicMenu(this.model, this.registry).interact();
    }
}
