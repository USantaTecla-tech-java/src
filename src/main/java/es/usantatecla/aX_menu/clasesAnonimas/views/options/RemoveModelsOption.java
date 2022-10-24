package es.usantatecla.aX_menu.clasesAnonimas.views.options;

import es.usantatecla.aX_menu.modelView.models.Model;
import es.usantatecla.aX_menu.utils.DynamicMenu;

public class RemoveModelsOption extends ModelOption {

    public RemoveModelsOption(Model model) {
        super("Eliminar", model);
    }

    @Override
    public void interact() {        
        new DynamicMenu("Model Dynamic Menu") {
             
            @Override
            protected void addOptions() {
                for (int i = 0; i < model.size(); i++) {
                    this.add(new RemoveModelOption(model, i));
                }
            }
        
        }.interact();
    }
}
