package es.usantatecla.a0_itinerario.a4_orientadoObjetos.a6_enums.a1_inherits;

abstract class Enum {
    public static Enum OBJECT_1 = new Object_1("OBJECT_1");
    public static Enum OBJECT_2 = new Object_2("OBJECT_2");
    public static Enum OBJECT_3 = new Object_3("OBJECT_3");

    public static Enum[] values() {
        return new Enum[] { Enum.OBJECT_1, Enum.OBJECT_2, Enum.OBJECT_3 };
    }

    private String name;

    protected Enum(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public void transmitedMethod() {
        Console.instance().writeln("General");
    }

    public abstract void redefinedMethod();

    public static void main(String[] args) {
        for (Enum current : Enum.values()) {
            current.transmitedMethod();
            current.redefinedMethod();
            // if (current == Enum.OBJECT_3){
            // current.addedMethod();
            // }
        }
        // Enum.OBJECT_3.addedMethod();
    }
}

class Object_1 extends Enum {

    protected Object_1(String name) {
        super(name);
    }

    public void redefinedMethod() {
        Console.instance().writeln(this.name());
    }
}

class Object_2 extends Enum {

    protected Object_2(String name) {
        super(name);
    }

    public void redefinedMethod() {
        Console.instance().writeln(this.name());
    }

    public void transmitedMethod() {
        Console.instance().writeln("Particular");
    }
}

class Object_3 extends Enum {

    protected Object_3(String name) {
        super(name);
    }

    public void redefinedMethod() {
        Console.instance().writeln(this.name());
    }

    public void addedMethod() {
        Console.instance().writeln("addedMethod");
    }

}
