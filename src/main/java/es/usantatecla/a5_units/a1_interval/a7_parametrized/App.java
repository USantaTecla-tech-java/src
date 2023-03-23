package es.usantatecla.a5_units.a1_interval.a7_parametrized;

class App {

    public static void main(String[] args) {
        final int SIZE = 3;
        Interval<Integer>[] intervals = new Interval[SIZE];
        for (int i = 0; i < intervals.length; i++) {
            intervals[i] = new Interval<Integer>(-i - 1, i + 1);
        }
        App.scenarioPrametrized(intervals, SIZE);

        Interval<Fraction>[] fractions = new Interval[SIZE];
        for (int i = 0; i < fractions.length; i++) {
            fractions[i] = new Interval<Fraction>(new Fraction(-i - 1, i + 1), new Fraction(i + 2, i + 1));
        }
        App.scenarioPrametrized(fractions, SIZE);

        Interval<Integer>[] integers = new Interval[SIZE];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = new Interval<Integer>(-i,i);
        }
        App.scenarioPrametrized(integers, SIZE);
    }

    private static <E> void scenarioPrametrized(Interval<? extends Comparable<E>>[] intervals, final int SIZE) {
        for (int i = 0; i < intervals.length; i++) {
            Console.getInstance().writeln("Intervalo: " + intervals[i]);
        }
        Interval union = intervals[0];
        Interval intersection = intervals[0];
        for (Interval<? extends Comparable<E>> interval : intervals) {
            union = union.union(interval);
            intersection = intersection.intersection(interval);
        }
        Console.getInstance().writeln("Union: " + union);
        Console.getInstance().writeln("Intersección: " + intersection);
    }

}
