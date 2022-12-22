package es.usantatecla.aX_menu_undo_redo.views.menus;

import es.usantatecla.aX_menu_undo_redo.models.Model;
import es.usantatecla.aX_menu_undo_redo.utils.IterativeMenu;
import es.usantatecla.aX_menu_undo_redo.views.options.AddModelOption;
import es.usantatecla.aX_menu_undo_redo.views.options.DuplicationModelOption;
import es.usantatecla.aX_menu_undo_redo.views.options.InverseListModelOption;
import es.usantatecla.aX_menu_undo_redo.views.options.ListModelOption;
import es.usantatecla.aX_menu_undo_redo.views.options.RedoModelOption;
import es.usantatecla.aX_menu_undo_redo.views.options.Registry;
import es.usantatecla.aX_menu_undo_redo.views.options.RemoveModelsOption;
import es.usantatecla.aX_menu_undo_redo.views.options.UndoModelOption;

class ModelIterativeDynamicMenu extends IterativeMenu {

    private Model model;
    private Registry registry;

    public ModelIterativeDynamicMenu(Model model, Registry registry) {
        super("Model Iterative Dynamic Menu");
        this.model = model;
        this.registry = registry;
    }

    @Override
    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
        this.add(new AddModelOption(this.model, this.registry));
        this.add(new DuplicationModelOption(this.model, this.registry));
        this.add(new RemoveModelsOption(this.model, this.registry));
        if (this.registry.undoable()){
            this.add(new UndoModelOption(this.registry));
        }
        if (this.registry.redoable()){
            this.add(new RedoModelOption(this.registry));
        }
    }

    public static void main(String[] args) {
        new ModelIterativeDynamicMenu(new Model(), new Registry()).interact();
    }

}
