package es.usantatecla.aX_menu.clasesAnonimas.views.options;

import es.usantatecla.aX_menu.modelView.models.Model;
import es.usantatecla.aX_menu.utils.Option;

public abstract class ModelOption extends Option {

    protected Model model;

    public ModelOption(String string, Model model) {
        super(string);
        this.model = model;
    }

    public abstract void interact();

}
