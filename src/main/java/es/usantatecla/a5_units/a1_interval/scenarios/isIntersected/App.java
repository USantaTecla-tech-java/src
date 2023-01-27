package es.usantatecla.a5_units.a1_interval.scenarios.isIntersected;

import es.usantatecla.utils.Console;

    public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final float min1 = console.readFloat("Dame el mínimo: ");
        final float max1 = console.readFloat("Dame el máximo: ");
        final float min2 = console.readFloat("Dame el mínimo: ");
        final float max2 = console.readFloat("Dame el máximo: ");
        String isIntersected = "No";
        if (min1 <=  min2 && min2 <= max1 
            || min1 <= max2 && max2 <= max1
            || min2 <= min1 && min1 <= max2
            || min2 <= max1 && max1 <= max2) {
           isIntersected = "Sí"; 
        }
        console.writeln(isIntersected + " existe intersección entre los intervalos "
                + "[" + min1 + ", " + max1 + "] y " 
                + "[" + min2 + ", " + max2 + "] y ");
    }
}
