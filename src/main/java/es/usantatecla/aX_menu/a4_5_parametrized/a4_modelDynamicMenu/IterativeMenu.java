package es.usantatecla.aX_menu.a4_5_parametrized.a4_modelDynamicMenu;

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
