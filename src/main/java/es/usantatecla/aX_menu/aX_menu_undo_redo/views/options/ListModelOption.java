package es.usantatecla.aX_menu.aX_menu_undo_redo.views.options;

import es.usantatecla.aX_menu.aX_menu_undo_redo.models.Model;
import es.usantatecla.aX_menu.aX_menu_undo_redo.utils.Console;

public class ListModelOption extends ModelOption {

    public ListModelOption(Model model) {
        super("Listar", model);
    }

    @Override
    public void interact() {
        for (int i = 0; i < this.model.size(); i++) {
            Console.getInstance().writeln((i + 1) + ". " + this.model.get(i));
        }
        Console.getInstance().writeln();
    }

}
