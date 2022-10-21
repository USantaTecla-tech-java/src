package es.usantatecla.aX_menu.clasesAnonimas.views.menus;

import es.usantatecla.aX_menu.modelView.models.Model;
import es.usantatecla.aX_menu.modelView.views.options.InverseListModelOption;
import es.usantatecla.aX_menu.modelView.views.options.ModelOption;
import es.usantatecla.aX_menu.utils.Menu;
import es.usantatecla.aX_menu.utils.Option;

public class ModelMenu extends Menu {

    private Model model;

    public ModelMenu(Model model) {
        super("Model Menu");
        this.model = model;
    }

    protected void addOptions() {
        this.add(new ModelOption("Añadir", this.model) {
        
            @Override
            public void interact() {
                String string;
                do {
                    string = Option.console.readString("Dame una cadena de caracteres: ");
                } while (string.trim().equals(""));
                model.add(string.trim());
            }
        
        });
        this.add(new InverseListModelOption(this.model));
    }

    public static void main(String[] args) {
        ModelMenu modelAlternativeMenu = new ModelMenu(new Model());
        modelAlternativeMenu.interact();
    }
}
