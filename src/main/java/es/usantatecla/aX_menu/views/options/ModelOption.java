package es.usantatecla.aX_menu.views.options;

import es.usantatecla.aX_menu.models.Model;
import es.usantatecla.aX_menu.utils.Option;

public abstract class ModelOption extends Option {

    protected Model model;

    public ModelOption(String string, Model model) {
        super(string);
        this.model = model;
    }

}
