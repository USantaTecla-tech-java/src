package es.usantatecla.aX_menu.modelView.views.options;

import es.usantatecla.aX_menu.modelView.models.Model;
import es.usantatecla.aX_menu.modelView.views.menus.ModelDynamicMenu;

public class RemoveModelsOption extends ModelOption {

    public RemoveModelsOption(Model model) {
        super("Eliminar", model);
    }

    @Override
    public void interact() {
        new ModelDynamicMenu(this.model).interact();
    }
}
