package es.usantatecla.a5_units.a1_interval.a3_asserts;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int SIZE = 3;
        Interval[] intervals = new Interval[SIZE];
        for (int i = 0; i < intervals.length; i++) {
            intervals[i] = Interval.read();
        }
        for (int i = 0; i < intervals.length; i++) {
            console.writeln("Intervalo: " + intervals[i] + " e inversa: " + intervals[i].opposite());
        }
        Interval union = intervals[0];
        Interval intersection = intervals[0];
        for (Interval interval : intervals) {
            union = union.union(interval);
            intersection = intersection.intersection(interval);
        }
        console.writeln("Union: " + union);
        console.writeln("Intersección: " + intersection);

        final int times = console.readInt("Dame el número de partes: ");
        intervals = union.split(times);
        for (Interval interval : intervals) {
            interval.writeln();
        }
    }

}
