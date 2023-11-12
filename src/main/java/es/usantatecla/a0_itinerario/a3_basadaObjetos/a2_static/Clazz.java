package es.usantatecla.a0_itinerario.a3_basadaObjetos.a2_static;

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
        Console.instance().writeln();
        Console.instance().writeln("publicInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        Console.instance().writeln("publicInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        Console.instance().writeln("publicInstnaceMethod : publicAtributte: " + this.publicAtributte);
        Console.instance().writeln("publicInstnaceMethod : privateAtributte: " + this.privateAtributte);
        this.privateInstnaceMethod();
        Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }

    private void privateInstnaceMethod() {
        Console.instance().writeln();
        Console.instance().writeln("privateInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        Console.instance().writeln("privateInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        Console.instance().writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        Console.instance().writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
        Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }

    public static void publicStaticMethod() {
        Console.instance().writeln();
        Console.instance().writeln("privateInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        Console.instance().writeln("privateInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        // Console.instance().writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        // Console.instance().writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
        // this.privateInstnaceMethod();
        // Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }

    private static void privateStaticMethod() {
        Console.instance().writeln();
        Console.instance().writeln("privateInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        Console.instance().writeln("privateInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        // Console.instance().writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        // Console.instance().writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
    }

    public static void main(String[] args){
        Console.instance().writeln();
        Clazz object = new Clazz(0);
        Console.instance().writeln("main.PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        Console.instance().writeln("main.PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        Console.instance().writeln("main.publicAtributte: " + object.publicAtributte);
        Console.instance().writeln("main.privateAtributte: " + object.privateAtributte);
        object.publicInstnaceMethod();
        object.privateInstnaceMethod();
        Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }
    
}

class Client {

    public static void main(String[] args){
        Console.instance().writeln();
        Clazz object = new Clazz(0);
        Console.instance().writeln("main.PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        // Console.instance().writeln("main.PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        Console.instance().writeln("main.publicAtributte: " + object.publicAtributte);
        // Console.instance().writeln("main.privateAtributte: " + object.privateAtributte);
        object.publicInstnaceMethod();
        // object.privateInstnaceMethod();
        Clazz.publicStaticMethod();
        // Clazz.privateStaticMethod();
    }

}

