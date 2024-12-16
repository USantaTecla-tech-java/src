package es.usantatecla.aX_menu.a9_lambda;

import java.util.function.Consumer;

abstract class Menu<T> {

    private String title;
    private String[] subtitles;
    private Consumer<T>[] actions;
    private static final int MAX = 100;
    private int size;
    private T target;

    public Menu(String title, T target) {
        this.title = title;
        this.subtitles = new String[Menu.MAX];
        this.actions = new Consumer[Menu.MAX];
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
            Console.getInstance().writeln((i+1) + ". " + this.subtitles[i]);
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
        this.actions[answer].accept(this.target);
    }

    protected void add(String subtitle, Consumer<T> action) {
        assert this.size < Menu.MAX;
        assert subtitle != null && subtitle.isBlank();
  
        this.subtitles[this.size] = subtitle;
        this.actions[this.size] = action;
        this.size++;
    }

    protected boolean hasAction(Consumer<T> action) {
        for (int i = 0; i < this.size; i++) {
            if (this.actions[i] == action) {
                return true;
            }
        }
        return false;
    }

    protected void removeOptions() {
        this.size = 0;
    }

    protected T getTarget(){
        return this.target;
    }

}
