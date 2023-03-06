package es.usantatecla.aX_menu.a5_package.views.menus;

import es.usantatecla.aX_menu.a5_package.models.Model;
import es.usantatecla.aX_menu.a5_package.utils.QuitMenu;
import es.usantatecla.aX_menu.a5_package.views.options.InverseListModelOption;
import es.usantatecla.aX_menu.a5_package.views.options.ListModelOption;

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
    
}
