package es.usantatecla.aX_menu.a4_5_parametrized.a3_modelIterativeMenu;

abstract class IterativeMenu<T> extends QuitMenu<T> {

    public IterativeMenu(String title) {
        super(title);
    }

    public void interact() {
        this.addOptions();
        do {
            this.interact_();
        } while (!this.isExecutedquitOption());
    }

}
