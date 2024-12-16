package es.usantatecla.aX_menu.a5_package.views.options;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.utils.Console;
import es.usantatecla.aX_menu.a5_package.views.menus.ModelOption;

public class InverseListModelOption extends ModelOption {

    public InverseListModelOption(Model model) {
        super("Listar inverso", model);
    }

    public void interact() {
        for (int i = this.model.size() - 1; i >= 0; i--) {
            Console.getInstance().writeln((i + 1) + ". " + this.model.get(i));
        }
        Console.getInstance().writeln();
    }

}
