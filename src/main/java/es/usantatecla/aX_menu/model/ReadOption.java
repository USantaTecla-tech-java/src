package es.usantatecla.aX_menu.model;

import es.usantatecla.utils.Console;

public class ReadOption extends ModelOption {

    public ReadOption(Model model) {
        super("Listar", model);
    }

    @Override
    public void exec() {
        Console console = new Console();
        for (int i = 0; i < this.model.size(); i++) {
            console.writeln((i + 1) + ". " + this.model.get(i));
        }
        console.writeln();
    }

}
