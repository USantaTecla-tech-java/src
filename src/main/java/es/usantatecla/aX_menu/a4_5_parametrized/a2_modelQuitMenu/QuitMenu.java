package es.usantatecla.aX_menu.a4_5_parametrized.a2_modelQuitMenu;

abstract class QuitMenu<T> extends Menu<T> {

    private QuitOption<T> quitOption;

    public QuitMenu(String title, T target) {
        super(title, target);
        this.quitOption = new QuitOption<T>(this.getTarget());
    }

    protected void showTitles() {
        this.add(this.quitOption);
        super.showTitles();
    }

}
