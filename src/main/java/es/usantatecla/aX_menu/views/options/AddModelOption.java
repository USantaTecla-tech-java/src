package es.usantatecla.aX_menu.views.options;

import es.usantatecla.aX_menu.models.Model;
import es.usantatecla.aX_menu.utils.Option;

public class AddModelOption extends ModelOption {

    public AddModelOption(Model model) {
        super("Añadir", model);
    }

    @Override
    public void interact() {
        String string;
        do {
            string = Option.console.readString("Dame una cadena de caracteres: ");
        } while (string.trim().equals(""));
        model.add(string.trim());
    }

}
