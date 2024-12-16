package es.usantatecla.aX_menu.a6_inner;

abstract class QuitMenu<T> extends Menu<T> {

    private QuitOption<T> quitOption;

    public QuitMenu(String title, T target) {
        super(title, target);
        this.quitOption = new QuitOption<T>(target);
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
