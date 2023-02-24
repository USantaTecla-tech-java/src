package es.usantatecla.aX_menu.a5_package.views.options;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.utils.Console;

public class AddModelOption extends ModelOption {

    public AddModelOption(Model model) {
        super("Añadir", model);
    }

    @Override
    public void interact() {
        String string;
        do {
            string = Console.getInstance().readString("Dame una cadena de caracteres: ");
        } while (string.trim().equals(""));
        model.add(string.trim());
    }

}
