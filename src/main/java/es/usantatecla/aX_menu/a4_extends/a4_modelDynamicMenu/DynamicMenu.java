package es.usantatecla.aX_menu.a4_extends.a4_modelDynamicMenu;

abstract class DynamicMenu extends IterativeMenu {

    public DynamicMenu(String title) {
        super(title);
    }

    @Override
    public void interact() {
        do {
            this.removeOptions();
            this.addOptions();
            this.interact_();
        } while (!this.isExecutedquitOption());
    }

}
