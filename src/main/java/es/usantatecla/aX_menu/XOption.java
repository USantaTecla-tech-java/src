package es.usantatecla.aX_menu;

import es.usantatecla.utils.Console;

public class XOption extends Option {

    public XOption(String title) {
        super(title);
    }

    @Override
    public void exec() {
        new Console().writeln("Eejcutando comando " + this.getTitle());
    }
    
}
