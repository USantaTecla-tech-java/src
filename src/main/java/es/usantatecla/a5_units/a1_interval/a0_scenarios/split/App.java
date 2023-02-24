package es.usantatecla.a5_units.a1_interval.a0_scenarios.split;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        final double min = console.readDouble("Dame el mínimo: ");
        final double max = console.readDouble("Dame el máximo: ");
        final int times = console.readInt("Dame el número de partes: ");
        double[] mins = new double[times];
        double[] maxs = new double[times];
        final double length = (max - min) / times;
        double origin = min;
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
