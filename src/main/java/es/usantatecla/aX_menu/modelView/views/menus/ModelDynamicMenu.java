package es.usantatecla.aX_menu.modelView.views.menus;

import es.usantatecla.aX_menu.modelView.models.Model;
import es.usantatecla.aX_menu.modelView.views.options.RemoveModelOption;
import es.usantatecla.aX_menu.utils.DynamicMenu;

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
