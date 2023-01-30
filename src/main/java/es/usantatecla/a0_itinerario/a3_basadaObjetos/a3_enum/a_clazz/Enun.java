package es.usantatecla.a0_itinerario.a3_basadaObjetos.a_enum.a_clazz;

import es.usantatecla.utils.Console;

class Enun {
    public static Enun OBJECT_1 = new Enun(1, "OBJECT_1");
    public static Enun OBJECT_2 = new Enun(2, "OBJECT_2");
    public static Enun OBJECT_3 = new Enun(3, "OBJECT_3");
    private static Enun[] VALUES = new Enun[]{ Enun.OBJECT_1, Enun.OBJECT_2, Enun.OBJECT_3 };

    private int atributte;
    private String name;

    private Enun(int value, String name){
        this.atributte = value;
        this.name = name;
    }

    public void method() {
        new Console().writeln(this.atributte);
    }

    public String name() {
        return this.name;
    }

    public int ordinal(){
        for(int i=0; i< Enun.VALUES.length; i++){
            if (Enun.VALUES[i] == this){
                return i;
            }
        }
        return -1;
    }

    public static Enun[] values() {
        return Enun.VALUES;
    }
}

class ClassClient {

    public static void main(String[] args){
        Console console = new Console();
        Enun.OBJECT_1.method();
        for(Enun object : Enun.values()){
            console.writeln("name: " + object.name());
            console.writeln("ordinal: " + object.ordinal());
            object.method();
        }
        // Enun object = new Enun(0); ERROR
    }
}
