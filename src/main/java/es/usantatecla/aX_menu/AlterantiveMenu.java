package es.usantatecla.aX_menu;

import java.util.ArrayList;
import java.util.List;

import es.usantatecla.utils.Console;

public abstract class AlterantiveMenu {

    private String title;
    private List<Option> options;

    public AlterantiveMenu(String title){
        this.title = title;
        this.options = new ArrayList<Option>();
        this.addOptions();
    }

    protected abstract void addOptions();

    protected void add(Option option) {
        this.options.add(option);
    }

    protected void removeOptions(){
        this.options.clear();
    }

    public void exec() {
        Console console = new Console();
        console.writeln(this.title);
        console.writeln();
        for (int i = 0; i < this.options.size(); i++) {
            console.writeln((i + 1) + ". " + this.options.get(i).getTitle());
        }
        int answer;
        boolean ok;
        do {
            answer = console.readInt("Opción? [1-" + this.options.size() + "]: ") - 1;
            ok = 0 <= answer && answer <= this.options.size() - 1;
            if (!ok) {
                console.writeln("Error!!!");
            }
        } while (!ok);
        this.options.get(answer).exec();
    }

}

class XAlternativeMenu extends AlterantiveMenu {

    
    public XAlternativeMenu() {
        super("XAlternativeMenu");
    }

    protected void addOptions(){
        this.add(new XOption("A"));
        this.add(new XOption("B"));
        this.add(new XOption("C"));
    }

    public static void main(String[] args) {
        XAlternativeMenu xAlterantiveMenu = new XAlternativeMenu();
        xAlterantiveMenu.exec();
    }
}
