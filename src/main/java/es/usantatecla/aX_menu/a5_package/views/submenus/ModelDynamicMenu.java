package es.usantatecla.aX_menu.a5_package.views.submenus;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.utils.DynamicMenu;
import es.usantatecla.aX_menu.a5_package.views.options.RemoveModelOption;

public class ModelDynamicMenu extends DynamicMenu {

    private Model model;

    public ModelDynamicMenu(Model model) {
        super("Model Dynamic Menu");
        this.model = model;
        this.addOptions();
    }

    protected void addOptions() {
        for (int i = 0; i < model.size(); i++) {
            this.add(new RemoveModelOption(model, i));
        }
    }

}
