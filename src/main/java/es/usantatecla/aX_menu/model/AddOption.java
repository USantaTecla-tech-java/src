package es.usantatecla.aX_menu.model;

import es.usantatecla.utils.Console;

public class AddOption extends ModelOption {

    public AddOption(Model model) {
        super("Añadir", model);
    }

    @Override
    public void exec() {
        Console console = new Console();
        String string;
        do {
            string = console.readString("Dame una cadena de caracteres");
        } while (!string.trim().equals(""));
        model.add(string);
    }
    
}
