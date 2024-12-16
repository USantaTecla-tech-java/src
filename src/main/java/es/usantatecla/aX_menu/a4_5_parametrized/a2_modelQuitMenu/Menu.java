package es.usantatecla.aX_menu.a4_5_parametrized.a2_modelQuitMenu;

abstract class Menu<T> {

    private String title;
    private Option<T>[] options;
    private static final int MAX = 100;
    private int size;
    private T target;

    public Menu(String title, T target) {
        this.title = title;
        this.options = new Option[Menu.MAX];
        this.size = 0;
        this.target = target;
    }

    public void interact() {
        this.addOptions();
        this.interact_();
    }

    protected abstract void addOptions();

    protected void interact_() {
        this.showTitles();
        this.execChoosedOption();
    }

    protected void showTitles() {
        this.showTitle();
        for (int i = 0; i < this.size; i++) {
            this.options[i].showTitle(i + 1);
        }
    }

    private void showTitle() {
        String string = "\n" + this.title + "\n";
        for (int i = 0; i < this.title.length(); i++) {
            string += "-";
        }
        Console.getInstance().writeln(string);
    }

    protected void execChoosedOption() {
        int answer;
        boolean ok;
        do {
            answer = Console.getInstance().readInt("Opción? [1-" + this.size + "]: ") - 1;
            ok = 0 <= answer && answer < this.size;
            if (!ok) {
                Console.getInstance().writeln("Error!!!");
            }
        } while (!ok);
        this.options[answer].interact();
    }

    protected void add(Option<T> option) {
        assert this.size < Menu.MAX;

        this.options[this.size] = option;
        this.size++;
    }

    protected T getTarget(){
        return this.target;
    }

}
