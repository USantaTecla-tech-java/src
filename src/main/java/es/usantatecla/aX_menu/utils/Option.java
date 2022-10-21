package es.usantatecla.aX_menu.utils;

import es.usantatecla.utils.Console;

public abstract class Option {

    public static Console console = new Console();
    private String title;

    public Option(String title) {
        this.title = title;
    }

    public abstract void interact();

    public void showTitle(int index) {
        console.writeln(index + ". " + this.getTitle());
    }

    protected String getTitle() {
        return this.title;
    }

}
