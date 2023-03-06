package es.usantatecla.aX_menu.a5_package.views.options;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.views.submenus.ModelDynamicMenu;

public class RemoveModelsOption extends ModelOption {

    public RemoveModelsOption(Model model) {
        super("Eliminar", model);
    }

    public void interact() {
        new ModelDynamicMenu(this.model).interact();
    }
}
