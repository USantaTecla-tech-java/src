package es.usantatecla.aX_menu.a4_extends.a2_modelQuitMenu;

class QuitOption extends Option {

    public QuitOption() {
        super("Salir");
    }

    public void interact() {
        Console.getInstance().writeln("Adiós");
    }

}
