package es.usantatecla.aX_menu.a5_package.views.options;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.utils.Console;

public class ListModelOption extends ModelOption {

    public ListModelOption(Model model) {
        super("Listar", model);
    }

    public void interact() {
        for (int i = 0; i < this.model.size(); i++) {
            Console.getInstance().writeln((i + 1) + ". " + this.model.get(i));
        }
        Console.getInstance().writeln();
    }

}
