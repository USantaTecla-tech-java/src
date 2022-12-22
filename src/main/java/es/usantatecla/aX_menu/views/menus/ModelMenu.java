package es.usantatecla.aX_menu.views.menus;

import es.usantatecla.aX_menu.models.Model;
import es.usantatecla.aX_menu.utils.Menu;
import es.usantatecla.aX_menu.views.options.InverseListModelOption;
import es.usantatecla.aX_menu.views.options.ListModelOption;

public class ModelMenu extends Menu {

    private Model model;

    public ModelMenu(Model model) {
        super("Model Menu");
        this.model = model;
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
    }

    public static void main(String[] args) {
        ModelMenu modelAlternativeMenu = new ModelMenu(new Model());
        modelAlternativeMenu.interact();
    }
}
