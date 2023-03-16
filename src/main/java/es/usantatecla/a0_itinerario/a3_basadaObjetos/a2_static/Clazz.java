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
        Console.getInstance().writeln();
        Console.getInstance().writeln("publicInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        Console.getInstance().writeln("publicInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        Console.getInstance().writeln("publicInstnaceMethod : publicAtributte: " + this.publicAtributte);
        Console.getInstance().writeln("publicInstnaceMethod : privateAtributte: " + this.privateAtributte);
        this.privateInstnaceMethod();
        Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }

    private void privateInstnaceMethod() {
        Console.getInstance().writeln();
        Console.getInstance().writeln("privateInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        Console.getInstance().writeln("privateInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        Console.getInstance().writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        Console.getInstance().writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
        Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }

    public static void publicStaticMethod() {
        Console.getInstance().writeln();
        Console.getInstance().writeln("privateInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        Console.getInstance().writeln("privateInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        // Console.getInstance().writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        // Console.getInstance().writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
        // this.privateInstnaceMethod();
        // Clazz.publicStaticMethod();
        Clazz.privateStaticMethod();
    }

    private static void privateStaticMethod() {
        Console.getInstance().writeln();
        Console.getInstance().writeln("privateInstnaceMethod : PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        Console.getInstance().writeln("privateInstnaceMethod : PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        // Console.getInstance().writeln("privateInstnaceMethod : publicAtributte: " + this.publicAtributte);
        // Console.getInstance().writeln("privateInstnaceMethod : privateAtributte: " + this.privateAtributte);
    }
    
}

class Client {

    public static void main(String[] args){
        Console.getInstance().writeln();
        Clazz object = new Clazz(0);
        Console.getInstance().writeln("main.PUBLIC_CONSTANT: " + Clazz.PUBLIC_CONSTANT);
        // Console.getInstance().writeln("main.PRIVATE_CONSTANT: " + Clazz.PRIVATE_CONSTANT);
        Console.getInstance().writeln("main.publicAtributte: " + object.publicAtributte);
        // Console.getInstance().writeln("main.privateAtributte: " + object.privateAtributte);
        object.publicInstnaceMethod();
        // object.privateInstnaceMethod();
        Clazz.publicStaticMethod();
        // Clazz.privateStaticMethod();
    }
}

