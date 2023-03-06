package es.usantatecla.aX_menu.a5_package.utils;

public abstract class DynamicMenu extends IterativeMenu {

    public DynamicMenu(String title) {
        super(title);
    }

    public void interact() {
        do {
            this.removeOptions();
            this.addOptions();
            this.interact_();
        } while (!this.isExecutedquitOption());
    }

}
