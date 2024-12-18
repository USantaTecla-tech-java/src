package es.usantatecla.aX_menu.a4_5_parametrized.a4_modelDynamicMenu;

abstract class Option<T> {

    private String title;
    private T target;

    public Option(String title, T target) {
        this.title = title;
        this.target = target;
    }

    public abstract void interact();

    public void showTitle(int index) {
        Console.getInstance().writeln(index + ". " + this.getTitle());
    }

    protected String getTitle() {
        return this.title;
    }

    protected T getTarget() {
        return this.target;
    }

}