package es.usantatecla.aX_menu.a7_local;

class QuitOption<T> extends Option<T> {

    private boolean executed;

    public QuitOption(T target) {
        super("Salir", target);
        this.executed = false;
    }

    public void interact() {
        this.executed = true;
        Console.getInstance().writeln("Adiós");
    }

    protected boolean isExecuted() {
        return this.executed;
    }

}
