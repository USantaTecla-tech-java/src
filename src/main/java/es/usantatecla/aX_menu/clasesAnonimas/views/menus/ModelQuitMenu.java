package es.usantatecla.aX_menu.clasesAnonimas.views.menus;

import es.usantatecla.aX_menu.modelView.models.Model;
import es.usantatecla.aX_menu.modelView.views.options.InverseListModelOption;
import es.usantatecla.aX_menu.modelView.views.options.ListModelOption;
import es.usantatecla.aX_menu.utils.QuitMenu;

public class ModelQuitMenu extends QuitMenu {

    private Model model;

    public ModelQuitMenu(Model model) {
        super("Model Quit Menu");
        this.model = model;
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
    }

    public static void main(String[] args) {
        ModelQuitMenu modelQuitMenu = new ModelQuitMenu(new Model());
        modelQuitMenu.interact();
    }
}
