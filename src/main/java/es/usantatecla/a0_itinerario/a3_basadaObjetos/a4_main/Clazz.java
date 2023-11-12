package es.usantatecla.a0_itinerario.a3_basadaObjetos.a4_main;

class App {
    
    public static void main(String[] args){
        Console.instance().write("Eco!!!\njava App ");
        for(String current : args){
            Console.instance().writeln(current);
        }
        Console.instance().writeln();
    }
    
}
