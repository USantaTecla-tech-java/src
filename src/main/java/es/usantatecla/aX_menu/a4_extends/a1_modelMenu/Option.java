package es.usantatecla.aX_menu.a4_extends.a1_modelMenu;

abstract class Option {

    private String title;

    protected Option(String title) {
        this.title = title;
    }

    public abstract void interact();

    public void showTitle(int index) {
        Console.getInstance().writeln(index + ". " + this.title);
    }

}
