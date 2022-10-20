package es.usantatecla.aX_menu;

import es.usantatecla.aX_menu.model.AddOption;
import es.usantatecla.aX_menu.model.Model;
import es.usantatecla.aX_menu.model.ReadOption;
import es.usantatecla.aX_menu.model.RemoveOption;

public abstract class DynamicMenu extends IterativeMenu {

    public DynamicMenu(String title) {
        super(title);
    }

    @Override
    public void exec() {
        do {
            this.addOptions();
            super.exec();
        } while (!this.isExecutedEscapeOption());
    }

}

class YIterativeMenu extends IterativeMenu {

    private Model model;

    public YIterativeMenu(Model model) {
        super("YIterativeMenu");
        this.model = model;
        this.addOptions();
    }

    @Override
    protected void addOptions() {
        if (this.model != null) {
            this.add(new ReadOption(this.model));
            this.add(new AddOption(this.model));
            this.add(new RemoveOption(this.model));
        }
    }

    public static void main(String[] args) {
        new YIterativeMenu(new Model()).exec();
    }

}
