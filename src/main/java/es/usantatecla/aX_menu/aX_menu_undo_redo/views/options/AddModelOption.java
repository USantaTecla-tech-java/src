package es.usantatecla.aX_menu.aX_menu_undo_redo.views.options;

import es.usantatecla.aX_menu.aX_menu_undo_redo.models.Model;
import es.usantatecla.aX_menu.aX_menu_undo_redo.utils.Console;

public class AddModelOption extends RegistrableModelOption {

    private String string;

    public AddModelOption(Model model, Registry registry) {
        super("Añadir", model, registry);
    }

    public AddModelOption(Model model, Registry registry, String string) {
        this(model, registry);
        this.string = string;
    }

    @Override
    public void interact() {
        do {
            this.string = Console.getInstance().readString("Dame una cadena de caracteres: ");
        } while (this.string.trim().equals(""));
        model.add(this.string.trim());
        this.registry.register(this);
    }

    @Override
    public void undo() {
        this.model.remove(this.model.size()-1);
    }

    @Override
    public void redo() {
        this.model.add(this.string);
    }

}
