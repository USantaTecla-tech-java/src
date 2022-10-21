package es.usantatecla.aX_menu.modelView.views.menus;

import es.usantatecla.aX_menu.modelView.models.Model;
import es.usantatecla.aX_menu.modelView.views.options.AddModelOption;
import es.usantatecla.aX_menu.modelView.views.options.InverseListModelOption;
import es.usantatecla.aX_menu.modelView.views.options.ListModelOption;
import es.usantatecla.aX_menu.modelView.views.options.RemoveModelsOption;
import es.usantatecla.aX_menu.utils.IterativeMenu;

class ModelIterativeDynamicMenu extends IterativeMenu {

    private Model model;

    public ModelIterativeDynamicMenu(Model model) {
        super("Model Iterative Dynamic Menu");
        this.model = model;
    }

    @Override
    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
        this.add(new AddModelOption(this.model));
        this.add(new RemoveModelsOption(this.model));
    }

    public static void main(String[] args) {
        new ModelIterativeDynamicMenu(new Model()).interact();
    }

}
