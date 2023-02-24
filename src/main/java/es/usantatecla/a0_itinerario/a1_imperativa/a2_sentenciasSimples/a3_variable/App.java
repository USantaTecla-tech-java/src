package es.usantatecla.a0_itinerario.a1_imperativa.a2_sentenciasSimples.a3_variable;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        int identifier = 0;
        console.writeln("Valor actual ." + identifier + "."); // Valor actual .0.
        console.writeln("Valor siguiente ." + (identifier + 1) + "."); // Valor siguiente .1.
        console.writeln("Valor actual ." + identifier + "."); // Valor actual .0.
        int identifierWithoutInitialization;
        //console.writeln("." + identifierWithoutInitialization + "."); // Error
        byte code = 127;
        short age = -1000;
        long euros = 1234567890;
        float distance; // conversion
        double lighYear = 0.0234;
        char initial = 'A';
        boolean error = false;
    }
}
