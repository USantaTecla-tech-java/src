package es.usantatecla.a5_units.a1_interval.scenarios.split;

import es.usantatecla.utils.Console;

    public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final float min = console.readFloat("Dame el mínimo: ");
        final float max = console.readFloat("Dame el máximo: ");
        final int times = console.readInt("Dame el número de partes: ");
        float[] mins = new float[times];
        float[] maxs = new float[times];
        final float length = (max - min) / times;
        float origin = min;
        for(int i=0; i<times; i++){
            mins[i] = origin;
            maxs[i] = origin + length;
            origin += length;
        }
        for(int i=0; i<times; i++){
            console.writeln("[" + mins[i] + ", " + maxs[i] + "]");
        }
    }
}
