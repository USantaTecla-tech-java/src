package es.usantatecla.aX_menu.a9_lambda;

abstract class DynamicMenu<T> extends IterativeMenu<T> {

    public DynamicMenu(String title, T target) {
        super(title, target);
    }

    public void interact() {
        do {
            this.removeOptions();
            this.addOptions();
            this.interact_();
        } while (!this.isExecutedquitOption());
    }

}