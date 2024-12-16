package es.usantatecla.aX_menu.a5_package.views.menus;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.utils.IterativeMenu;
import es.usantatecla.aX_menu.a5_package.views.options.AddModelOption;
import es.usantatecla.aX_menu.a5_package.views.options.FindModelOption;
import es.usantatecla.aX_menu.a5_package.views.options.InverseListModelOption;
import es.usantatecla.aX_menu.a5_package.views.options.ListModelOption;
import es.usantatecla.aX_menu.a5_package.views.options.RemoveModelsOption;

public class ModelIterativeMenu extends IterativeMenu {

    private Model model;

    public ModelIterativeMenu(Model model) {
        super("Model Iterative Dynamic Menu");
        this.model = model;
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
        this.add(new FindModelOption(this.model));
        this.add(new AddModelOption(this.model));
        this.add(new RemoveModelsOption(this.model));
    }

}
