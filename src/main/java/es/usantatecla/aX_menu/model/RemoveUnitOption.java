package es.usantatecla.aX_menu.model;

public class RemoveUnitOption extends ModelOption {
    
    private Model model;
    private int index;

    public RemoveUnitOption(Model model, int index) {
        super("Eliminar ", model);
        this.index = index;
    }

    @Override
    public void exec() { 
        this.model.remove(index);
    }   
    
}
