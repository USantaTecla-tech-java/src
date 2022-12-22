package es.usantatecla.aX_menu.views.menus;

import es.usantatecla.aX_menu.models.Model;
import es.usantatecla.aX_menu.utils.IterativeMenu;
import es.usantatecla.aX_menu.views.options.InverseListModelOption;
import es.usantatecla.aX_menu.views.options.ListModelOption;

public class ModelIterativeMenu extends IterativeMenu {

    private Model model;

    public ModelIterativeMenu(Model model) {
        super("Model Iterative Menu");
        this.model = model;
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
    }

    public static void main(String[] args) {
        ModelIterativeMenu modelIterativeMenu = new ModelIterativeMenu(new Model());
        modelIterativeMenu.interact();
    }
}
