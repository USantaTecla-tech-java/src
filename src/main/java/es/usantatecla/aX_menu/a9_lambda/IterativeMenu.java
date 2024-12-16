package es.usantatecla.aX_menu.a9_lambda;

abstract class IterativeMenu<T> extends QuitMenu<T> {

    public IterativeMenu(String title, T target) {
        super(title, target);
    }

    public void interact() {
        this.addOptions();
        do {
            this.interact_();
        } while (!this.isExecutedquitOption());
    }

}
