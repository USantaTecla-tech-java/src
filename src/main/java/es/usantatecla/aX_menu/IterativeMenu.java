package es.usantatecla.aX_menu;

public abstract class IterativeMenu extends EscapeMenu {
    
    public IterativeMenu(String title){
        super(title);
    }
    
    @Override
    public void exec(){
        do {
            super.exec();
        } while(!this.isExecutedEscapeOption());
    }

}

class XIterativeMenu extends IterativeMenu {

    public XIterativeMenu(String title) {
        super(title);
    }

    protected void addOptions(){
        this.add(new XOption("A"));
        this.add(new XOption("B"));
        this.add(new XOption("C"));
    }

    public static void main(String[] args) {
        XIterativeMenu xIterativeMenu = new XIterativeMenu("Titulo");
        xIterativeMenu.exec();
    }
}
