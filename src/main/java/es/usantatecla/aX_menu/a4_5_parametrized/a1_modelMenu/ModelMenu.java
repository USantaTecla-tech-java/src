package es.usantatecla.aX_menu.a4_5_parametrized.a1_modelMenu;

class ModelMenu extends Menu<Model> {

    public ModelMenu(Model target) {
        super("Model Menu", target);
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.getTarget()));
        this.add(new InverseListModelOption(this.getTarget()));
        this.add(new FindModelOption(this.getTarget()));
    }

}
