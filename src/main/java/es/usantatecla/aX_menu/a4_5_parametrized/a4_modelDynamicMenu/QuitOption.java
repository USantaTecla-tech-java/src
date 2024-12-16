package es.usantatecla.aX_menu.a4_5_parametrized.a4_modelDynamicMenu;

class QuitOption<T> extends Option<T> {

    private boolean executed;

    public QuitOption(T target) {
        super("Salir", target);
        this.executed = false;
    }

    public void interact() {
        this.executed = true;
        Console.getInstance().writeln("Adios");
    }

    protected boolean isExecuted() {
        return this.executed;
    }

}
