package es.usantatecla.aX_menu.clasesAnonimas.views.options;

import es.usantatecla.aX_menu.modelView.models.Model;
import es.usantatecla.aX_menu.modelView.views.menus.ModelDynamicMenu;
import es.usantatecla.aX_menu.utils.DynamicMenu;

public class RemoveModelsOption extends ModelOption {

    public RemoveModelsOption(Model model) {
        super("Eliminar", model);
    }

    @Override
    public void interact() {        
        new DynamicMenu(this.model) {

            private Model model;
        
            public ModelDynamicMenu(Model model) {
                super("Model Dynamic Menu");
                this.model = model;
                this.addOptions();
        
            }
        
            @Override
            protected void addOptions() {
                for (int i = 0; i < model.size(); i++) {
                    this.add(new RemoveModelOption(model, i));
                }
            }
        
        }.interact();
    }
}
