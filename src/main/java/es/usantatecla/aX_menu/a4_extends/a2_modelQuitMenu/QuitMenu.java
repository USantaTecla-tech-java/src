package es.usantatecla.aX_menu.a4_extends.a2_modelQuitMenu;

abstract class QuitMenu extends Menu {

    private QuitOption quitOption;

    public QuitMenu(String title) {
        super(title);
        this.quitOption = new QuitOption();
    }

    protected void showTitles() {
        this.add(this.quitOption);
        super.showTitles();
    }

}
