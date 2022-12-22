package es.usantatecla.aX_menu.views.menus;

import es.usantatecla.aX_menu.models.Model;
import es.usantatecla.aX_menu.utils.DynamicMenu;
import es.usantatecla.aX_menu.views.options.RemoveModelOption;

public class ModelDynamicMenu extends DynamicMenu {

    private Model model;

    public ModelDynamicMenu(Model model) {
        super("Model Dynamic Menu");
        this.model = model;
        this.addOptions();

    }

    @Override
    protected void addOptions() {
        for (int i = 0; i < model.size(); i++) {
            this.add(new RemoveModelOption(model, i));
        }
    }

}
