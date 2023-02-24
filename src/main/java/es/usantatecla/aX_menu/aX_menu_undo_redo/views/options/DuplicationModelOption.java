package es.usantatecla.aX_menu.aX_menu_undo_redo.views.options;

import es.usantatecla.aX_menu.aX_menu_undo_redo.models.Model;

public class DuplicationModelOption extends RegistrableModelOption {

    public DuplicationModelOption(Model model, Registry registry) {
        super("Duplicar", model, registry);
    }

    @Override
    public void interact() {
        final int SIZE = this.model.size();
        for(int i=0; i< SIZE; i++){
            this.model.add(this.model.get(i));
        }
        this.registry.register(this);
    }

    @Override
    public void undo() {
        final int SIZE = this.model.size();
        for(int i=0; i < SIZE / 2; i++){
            this.model.remove(this.model.size()-1);
        }       
    }

    @Override
    public void redo() {  
        final int SIZE = this.model.size();
        for(int i=0; i< SIZE; i++){
            this.model.add(this.model.get(i));
        }      
    }

}
