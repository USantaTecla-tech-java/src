package es.usantatecla.a0_itinerario.a3_basadaObjetos.a_enum.a_enum;

import es.usantatecla.utils.Console;

enum Enun {
    OBJECT_1(1),
    OBJECT_2(2),
    OBJECT_3(3);

    private int atributte;

    private Enun(int value){
        this.atributte = value;
    }

    public void method() {
        new Console().writeln(this.atributte);
    }
    
}

class EnunClient {

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