package es.usantatecla.a0_itinerario.a1_imperativa.a4_expresiones.a2_parentesis;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln(100/(2-1)); // ¿100 o 49?
        console.writeln(4>=7 && (2==4 || 5<6)); // ¿false o true?
        console.writeln(100/(2/2)); // ¿100 o 25?
        console.writeln(1-(1-1)); // ¿1 o -1?
        console.writeln(5 * (4+4) * 2); // ¿80 o 28?
        console.writeln((5+4) / (4+2)); // ¿1 u 8?
        console.writeln((false? true:false) ? false:true);
    }
}