package es.usantatecla.aX_menu.clasesAnonimas.views.options;

import es.usantatecla.aX_menu.modelView.models.Model;
import es.usantatecla.aX_menu.utils.Option;

public class ListModelOption extends ModelOption {

    public ListModelOption(Model model) {
        super("Listar", model);
    }

    @Override
    public void interact() {
        for (int i = 0; i < this.model.size(); i++) {
            Option.console.writeln((i + 1) + ". " + this.model.get(i));
        }
        console.writeln();
    }

}
