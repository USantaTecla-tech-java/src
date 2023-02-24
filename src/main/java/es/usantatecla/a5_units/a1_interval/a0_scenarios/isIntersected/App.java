package es.usantatecla.a5_units.a1_interval.a0_scenarios.isIntersected;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        final double min1 = console.readDouble("Dame el mínimo: ");
        final double max1 = console.readDouble("Dame el máximo: ");
        final double min2 = console.readDouble("Dame el mínimo: ");
        final double max2 = console.readDouble("Dame el máximo: ");
        String isIntersected = "No";
        if (min1 <= min2 && min2 <= max1
                || min1 <= max2 && max2 <= max1
                || min2 <= min1 && min1 <= max2
                || min2 <= max1 && max1 <= max2) {
            isIntersected = "Sí";
        }
        console.writeln(isIntersected + " existe intersección entre los intervalos "
                + "[" + min1 + ", " + max1 + "] y "
                + "[" + min2 + ", " + max2 + "]");
    }
}
