package es.usantatecla.a0_itinerario.a1_imperativa.a3_operadores.a4_acumulador;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        int x = 234;
        console.writeln(x += 2); // 236
        console.writeln(x -= 2); // 234
        console.writeln(x *= 2); // 468
        console.writeln(x /= 2); // 234
        console.writeln(x %= 7); // 3
        console.writeln(x |= 2); // 3
        console.writeln(x &= 2); // 2
        console.writeln(x ^= 3); // 1
        console.writeln(x <<= 2); // 4
        console.writeln(x >>= 2); // 1
        console.writeln(x >>>= 2); // 0
        console.writeln(x += 1 * 5); // 5
        console.writeln(x += 1 * 5); // 10
        console.writeln(x); // 10
    }
}