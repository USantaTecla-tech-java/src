package es.usantatecla.aX_menu.aX_menu_undo_redo.views.menus;

import es.usantatecla.aX_menu.aX_menu_undo_redo.models.Model;
import es.usantatecla.aX_menu.aX_menu_undo_redo.utils.DynamicMenu;
import es.usantatecla.aX_menu.aX_menu_undo_redo.views.options.Registry;
import es.usantatecla.aX_menu.aX_menu_undo_redo.views.options.RemoveModelOption;

public class ModelDynamicMenu extends DynamicMenu {

    private Model model;
    private Registry registry;

    public ModelDynamicMenu(Model model, Registry registry) {
        super("Model Dynamic Menu");
        this.model = model;
        this.registry = registry;
        this.addOptions();
    }

    @Override
    protected void addOptions() {
        for (int i = 0; i < model.size(); i++) {
            this.add(new RemoveModelOption(this.model, i, this.registry));
        }
    }

}
