package es.usantatecla.aX_menu.aX_menu_undo_redo.views.options;

import es.usantatecla.aX_menu.aX_menu_undo_redo.models.Model;
import es.usantatecla.aX_menu.aX_menu_undo_redo.utils.Console;

public class InverseListModelOption extends ModelOption {

    public InverseListModelOption(Model model) {
        super("Listar inverso", model);
    }

    @Override
    public void interact() {
        for (int i = this.model.size() - 1; i >= 0; i--) {
            Console.getInstance().writeln((i + 1) + ". " + this.model.get(i));
        }
        Console.getInstance().writeln();
    }

}
