package es.usantatecla.aX_menu.a4_5_parametrized.a2_modelQuitMenu;

class QuitOption<T> extends Option<T> {

    public QuitOption(T target) {
        super("Salir", target);
    }

    public void interact() {
        Console.getInstance().writeln("Adios");
    }

}
