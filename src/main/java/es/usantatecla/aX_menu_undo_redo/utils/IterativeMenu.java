package es.usantatecla.aX_menu_undo_redo.utils;

public abstract class IterativeMenu extends QuitMenu {

    public IterativeMenu(String title) {
        super(title);
    }

    @Override
    public void interact() {
        do {
            this.deleteOptions();
            this.addOptions();
            this.interact_();
        } while (!this.isExecutedquitOption());
    }

}
