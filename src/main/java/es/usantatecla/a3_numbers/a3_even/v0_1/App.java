package es.usantatecla.a3_numbers.a3_even.v0_1;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Escribe un número? ");
        final int firstBit = number & 1;
        final String parity = firstBit == 0 ? "par" : "impar";
        console.writeln("El numero " + number + " es " + parity);
    }
}
