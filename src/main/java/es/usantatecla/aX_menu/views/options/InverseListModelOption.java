package es.usantatecla.aX_menu.views.options;

import es.usantatecla.aX_menu.models.Model;
import es.usantatecla.aX_menu.utils.Option;

public class InverseListModelOption extends ModelOption {

    public InverseListModelOption(Model model) {
        super("Listar inverso", model);
    }

    @Override
    public void interact() {
        for (int i = this.model.size() - 1; i >= 0; i--) {
            Option.console.writeln((i + 1) + ". " + this.model.get(i));
        }
        console.writeln();
    }

}
