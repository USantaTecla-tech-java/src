package es.usantatecla.aX_menu.views.options;

import es.usantatecla.aX_menu.models.Model;

public class DuplicationModelOption extends ModelOption {

    public DuplicationModelOption(Model model) {
        super("Añadir", model);
    }

    @Override
    public void interact() {
        final int SIZE = this.model.size();
        for(int i=0; i< SIZE; i++){
            this.model.add(this.model.get(i));
        }
    }

}
