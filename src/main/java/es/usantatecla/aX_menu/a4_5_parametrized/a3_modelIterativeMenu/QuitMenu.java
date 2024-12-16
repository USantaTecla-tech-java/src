package es.usantatecla.aX_menu.a4_5_parametrized.a3_modelIterativeMenu;

abstract class QuitMenu<T> extends Menu<T> {

    private QuitOption<T> quitOption;

    public QuitMenu(String title) {
        super(title);
        this.quitOption = new QuitOption<T>(this.getTarget());
    }

    protected void showTitles() {
        if (!this.hasOption(this.quitOption)) {
            this.add(this.quitOption);
        }
        super.showTitles();
    }

    protected boolean isExecutedquitOption() {
        return this.quitOption.isExecuted();
    }

}
