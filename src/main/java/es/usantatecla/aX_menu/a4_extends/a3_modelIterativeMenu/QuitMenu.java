package es.usantatecla.aX_menu.a4_extends.a3_modelIterativeMenu;

abstract class QuitMenu extends Menu {

    private QuitOption quitOption;

    public QuitMenu(String title) {
        super(title);
        this.quitOption = new QuitOption();
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
