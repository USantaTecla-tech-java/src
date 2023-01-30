package es.usantatecla.a0_itinerario.a3_basadaObjetos.a_clazz;

import es.usantatecla.utils.Console;

class Clazz {
    
    public static int PUBLIC_CONSTANT = 0;
    private static int PRIVATE_CONSTANT = 1;
    public int publicAtributte;
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
        console.writeln("publicInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        console.writeln("publicInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        console.writeln("publicInstnaceMethod : publicAtributte: " + this.publicAtributte);
        console.writeln("publicInstnaceMethod : privateAtributte: " + this.privateAtributte);
        this.privateInstnaceMethod();
        Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }

    private void privateInstnaceMethod() {
        Console console = new Console();
        console.writeln();
        console.writeln("privateInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        console.writeln("privateInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        console.writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        console.writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
        Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }

    public static void publicStaticMethod() {
        Console console = new Console();
        console.writeln();
        console.writeln("privateInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        console.writeln("privateInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        // console.writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        // console.writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
        // this.privateInstnaceMethod();
        // Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }

    private static void privateStaticMethod() {
        Console console = new Console();
        console.writeln();
        console.writeln("privateInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        console.writeln("privateInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        // console.writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        // console.writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
    }
    
}

class Client {

    public static void main(String[] args){
        Console console = new Console();
        console.writeln();
        Clazz object = new Clazz(0);
        console.writeln("main.PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        // console.writeln("main.PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        console.writeln("main.publicAtributte: " + object.publicAtributte);
        // console.writeln("main.privateAtributte: " + object.privateAtributte);
        object.publicInstnaceMethod();
        // object.privateInstnaceMethod();
        Clazz.publicStaticMethod();
        // Clazz.privateStaticMethod();
    }
}

