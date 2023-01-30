package es.usantatecla.a0_itinerario.a3_basadaObjetos.a1_clazz;

import es.usantatecla.utils.Console;

class Clazz {
    
    public int publicAtributte; // Desaconsejado
    private int privateAtributte;

    public Clazz(int value){
        this.publicAtributte = 2;
        this.privateAtributte = value;
    }

    private Clazz(){
        this(3);
        // ...
    }

    public void publicInstnaceMethod() {
        Console console = new Console();
        console.writeln();
        console.writeln("publicInstnaceMethod : publicAtributte: " + this.publicAtributte);
        console.writeln("publicInstnaceMethod : privateAtributte: " + this.privateAtributte);
        this.privateInstnaceMethod();
    }

    private void privateInstnaceMethod() {
        Console console = new Console();
        console.writeln();
        console.writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        console.writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
    }
    
}

class App {

    public static void main(String[] args){
        Console console = new Console();
        console.writeln();
        Clazz object = new Clazz(0);
        console.writeln("main.publicAtributte: " + object.publicAtributte);
        // console.writeln("main.privateAtributte: " + object.privateAtributte);
        object.publicInstnaceMethod();
        // object.privateInstnaceMethod();
    }
}

