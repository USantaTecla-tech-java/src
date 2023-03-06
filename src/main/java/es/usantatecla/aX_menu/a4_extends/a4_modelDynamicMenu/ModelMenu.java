package es.usantatecla.aX_menu.a4_extends.a4_modelDynamicMenu;

class ModelMenu extends Menu {

    private Model model;

    public ModelMenu(Model model) {
        super("Model Menu");
        this.model = model;
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.model));
        this.add(new InverseListModelOption(this.model));
    }

    public static void main(String[] args) {
        ModelMenu modelAlternativeMenu = new ModelMenu(new Model());
        modelAlternativeMenu.interact();
    }
}
