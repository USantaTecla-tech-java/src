package es.usantatecla.aX_menu.a9_lambda;

import java.util.function.Consumer;

abstract class QuitMenu<T> extends Menu<T> {

    private boolean executed;
    private Consumer<T> quitAction = (T target) -> {
        this.executed = true;
    };

    public QuitMenu(String title, T target) {
        super(title, target);
        this.executed = false;
    }

    protected void showTitles() {
        if (!this.hasAction(this.quitAction)) {
            this.add("Salir", this.quitAction);
        }
        super.showTitles();
    }

    protected boolean isExecutedquitOption() {
        return this.executed;
    }

}
