package es.usantatecla.a4_numberingSystems.a0_digits.v0_1;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        int number = console.readInt("Dame un número entero: ");
        final int ones = number % 10;
        number -= ones;
        number /= 10;
        final int tens = number % 10;
        number -= tens;
        number /= 10;
        final int hundreds = number % 10;
        console.writeln("Unidades: " + ones + "\nDecenas: " + tens + "\nCentenas: " + hundreds);
    }
}


