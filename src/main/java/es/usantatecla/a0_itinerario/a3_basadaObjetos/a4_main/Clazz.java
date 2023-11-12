package es.usantatecla.a0_itinerario.a3_basadaObjetos.a4_main;

class Clazz {

    private void exec(String[] args){

    }

    public static void main(String[] args){
        new Clazz().exec(args);
    }
}

class App {
    
    public static void main(String[] args){
        Console.instance().write("Eco!!!\njava App ");
        for(String current : args){
            Console.instance().writeln(current);
        }
        Console.instance().writeln();
    }
    
}


