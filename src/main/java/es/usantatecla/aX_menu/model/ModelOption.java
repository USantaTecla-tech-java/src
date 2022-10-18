package es.usantatecla.aX_menu.model;

import es.usantatecla.aX_menu.Option;

public abstract class ModelOption extends Option {

    protected Model model;

    public ModelOption(String string, Model model) {
        super(string);
        this.model = model;
    }

}
