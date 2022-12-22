package es.usantatecla.aX_menu.views.options;

import es.usantatecla.aX_menu.models.Model;
import es.usantatecla.aX_menu.views.menus.ModelDynamicMenu;

public class RemoveModelsOption extends ModelOption {

    public RemoveModelsOption(Model model) {
        super("Eliminar", model);
    }

    @Override
    public void interact() {
        new ModelDynamicMenu(this.model).interact();
    }
}
