package es.usantatecla.aX_menu.a4_extends.a2_modelQuitMenu;

class QuitOption extends Option {

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
