package es.usantatecla.aX_menu_undo_redo.utils;

public class QuitOption extends Option {

    private boolean executed;

    public QuitOption() {
        super("Salir");
        this.executed = false;
    }

    @Override
    public void interact() {
        this.executed = true;
    }

    protected boolean isExecuted() {
        return this.executed;
    }

}
