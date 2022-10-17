package es.usantatecla.aX_menu;

public abstract class EscapeMenu extends AlterantiveMenu {

    private EscapeOption escapeOption;

    public EscapeMenu(String title){
        super(title);
        this.escapeOption = new EscapeOption("Salir");
        this.add(escapeOption);
    }

    protected boolean isExecutedEscapeOption(){
        return this.escapeOption.isExecuted();
    }

}

class XEscapeMenu extends EscapeMenu {

    public XEscapeMenu(String title) {
        super(title);
    }

    protected void addOptions(){
        this.add(new XOption("A"));
        this.add(new XOption("B"));
        this.add(new XOption("C"));
    }

    public static void main(String[] args) {
        XEscapeMenu xEscapeMenu = new XEscapeMenu("Titulo");
        xEscapeMenu.exec();
    }
}
