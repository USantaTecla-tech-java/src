package es.usantatecla.aX_menu.model;

import es.usantatecla.aX_menu.DynamicMenu;

public class RemoveOption extends ModelOption {

    public RemoveOption(Model model) {
        super("Eliminar", model);
    }

    @Override
    public void exec() { 
        new XDynamicMenu(model).exec();
    }   
}

class XDynamicMenu extends DynamicMenu {

    private Model model;

    public XDynamicMenu(Model model) {
        super("Selección");
        this.model = model;
    }

    @Override
    protected void addOptions() {
        for(int i=0; i<model.size(); i++){
            this.add(new RemoveUnitOption(model, i));
        }
    }
    
}
