package es.usantatecla.aX_menu_undo_redo.views.options;

import es.usantatecla.aX_menu_undo_redo.models.Model;
import es.usantatecla.aX_menu_undo_redo.utils.Option;

public abstract class ModelOption extends Option {

    protected Model model;

    public ModelOption(String string, Model model) {
        super(string);
        this.model = model;
    }

}
