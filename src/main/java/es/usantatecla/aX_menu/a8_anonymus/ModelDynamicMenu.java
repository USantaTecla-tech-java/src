package es.usantatecla.aX_menu.a8_anonymus;

class ModelDynamicMenu extends DynamicMenu<Model> {

    public ModelDynamicMenu(Model model) {
        super("Model Dynamic Menu", model);
        this.addOptions();
    }

    protected void addOptions() {
        
        for (int i = 0; i < this.getTarget().size(); i++) {
            final int index = i;
            this.add(new Option<Model>("Eliminar ", this.getTarget()) {
       
                protected String getTitle() {
                    return super.getTitle() + ": " + this.getTarget().get(index);
                }
        
                public void interact() {
                    this.getTarget().remove(index);
                }
        
            });
        }
    }

}
