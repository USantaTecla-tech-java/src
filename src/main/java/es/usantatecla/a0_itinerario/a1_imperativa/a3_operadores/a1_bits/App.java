package es.usantatecla.a0_itinerario.a1_imperativa.a3_operadores.a1_bits;

class App {
    
    public static void main(String[] args) {
        Console console = new Console();
        console.writeln(~4); // -5
        console.writeln(4 & 8); // 0
        console.writeln(4 | 8); // 12
        console.writeln(4 ^ 8); // 12
        console.writeln(5 ^ 9); // 12
        console.writeln(4 << 1); // 8
        console.writeln(4 >> 1); // 2
        console.writeln(4 >>> 1); // 2
    }
}

