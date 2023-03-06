package es.usantatecla.aX_menu.a5_package.utils;

public abstract class Option {

    private String title;

    public Option(String title) {
        this.title = title;
    }

    public abstract void interact();

    protected void showTitle(int index) {
        Console.getInstance().writeln(index + ". " + this.getTitle());
    }

    protected String getTitle() {
        return this.title;
    }

}
