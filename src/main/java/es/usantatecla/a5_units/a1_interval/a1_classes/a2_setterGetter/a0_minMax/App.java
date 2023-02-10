package es.usantatecla.a5_units.a1_interval.a1_classes.a2_setterGetter.a0_minMax;

import es.usantatecla.utils.Console;

class Interval {

    private double min;
    private double max;

    public Interval(double min, double max) {
        this.set(min, max);
    }

    private void set(double min, double max){
        this.setMin(min);
        this.setMax(max);
    }

    public Interval clone() {
        return new Interval(this);
    }

    private Interval(Interval interval) {
        this(interval.getMin(), interval.getMax());
    }

    public Interval(double max) {
        this(0, max);
    }

    public Interval() {
        this(0);
    }

    public double getMin() {
        return this.min;
    }

    public void setMin(double min){
        this.min = min;
    }

    public double getMax() {
        return this.max;
    }

    public void setMax(double max){
        this.max = max;
    }

    public double length() {
        return this.getMax() - this.getMin();
    }

    public void setLength(double length) {
        double middlePoint = this.middlePoint();
        this.set(middlePoint - length / 2, middlePoint + length / 2);
    }
    
    // public double middlePoint() {
    //     return (this.min + this.max) / 2;
    // }

    public double middlePoint() {
        return this.getMin() + this.length() / 2;
    }

    public void setMiddlePoint(double middlePoint) {
        double halfLength = this.length() / 2;
        this.set(middlePoint - halfLength, middlePoint + halfLength);
    }

    public void scale(double scale) {
        double middelPoint = this.middlePoint();
        double halfLength = this.length() * scale / 2;
        this.set(middelPoint - halfLength, middelPoint + halfLength);
    }

    public Interval scaled(double scale) {
        Interval scaled = this.clone();
        scaled.scale(scale);
        return scaled;
    }

    public Interval opposite() {
        return new Interval(-this.getMax(), -this.getMin());
    }

    public boolean includes(double point) {
        return this.getMin() <= point && point <= this.getMax();
    }

    public boolean includes(Interval interval) {
        assert this != null;

        return this.includes(interval.getMin())
                && this.includes(interval.getMax());
    }

    public boolean isIntersected(Interval interval) {
        assert this != null;

        return this.includes(interval.getMin())
                || this.includes(interval.getMax())
                || interval.includes(this);
    }

    // public Interval intersection(Interval interval) {
    // assert this.isIntersected(intervalo);
    // Interval intersection = this.clone();
    // if (interval.getMin() > this.getMin()) {
    // intersection.setMin(interval.getMin());
    // }
    // if (interval.getMax() < this.getMax()) {
    // intersection.setMax(interval.getMax());
    // }
    // return intersection;
    // }

    public Interval intersection(Interval intervalo) {
        assert this.isIntersected(intervalo);

        if (this.includes(intervalo)) {
            return intervalo.clone();
        }
        if (intervalo.includes(this)) {
            return this.clone();
        }
        if (this.includes(intervalo.getMin())) {
            return new Interval(intervalo.getMin(), this.getMax());
        }
        return new Interval(this.getMin(), intervalo.getMax());
    }

    // public Interval union(Interval interval) {
    //     assert this.isIntersected(intervalo);

    //     Interval union = this.clone();
    //     if (interval.getMin() < this.getMin()) {
    //         union.setMin(interval.getMin());
    //     }
    //     if (interval.getMax() > this.getMax()) {
    //         union.setMax(interval.getMax());
    //     }
    //     return union;
    // }

    public Interval union(Interval intervalo) {
        assert this.isIntersected(intervalo);

        if (this.includes(intervalo)) {
            return this.clone();
        }
        if (intervalo.includes(this)) {
            return intervalo.clone();
        }
        if (this.includes(intervalo.getMin())) {
            return new Interval(this.getMin(), intervalo.getMax());
        }
        return new Interval(intervalo.getMin(), this.getMax());
    }

    public Interval shifted(double shiftment) {
        return new Interval(this.getMin() + shiftment, this.getMax() + shiftment);
    }

    public void shift(double shiftment) {
        this.setMin(this.getMin() + shiftment);
        this.setMax(this.getMax() + shiftment);
    }

    // public Interval[] split(int times) {
    //     assert times > 0;

    //     Interval[] intervals = new Interval[times];
    //     final double length = this.length() / times;
    //     double origin = this.getMin();
    //     for (int i = 0; i < intervals.length; i++) {
    //         intervals[i] = new Interval(origin, origin + length);
    //         origin += length;
    //     }
    //     return intervals;
    // }

    public Interval[] split(int times) {
        assert times > 0;
        
        Interval[] intervals = new Interval[times];
        final double length = this.length() / times;
        intervals[0] = new Interval(this.getMin(), this.getMin() + length);
        for (int i = 1; i < intervals.length; i++) {
            intervals[i] = intervals[i-1].shifted(length);
        }
        return intervals;
    }

    public void read() {
        Console console = new Console();
        boolean error;
        do {
            this.setMin(console.readFloat("Dame el mínimo del intervalo: "));
            this.setMax(console.readFloat("Dame el máximo del intervalo: "));
            error = !this.isValid();
            if (error) {
                console.writeln("El minimo no puede ser mayor que el maximo");
            }
        } while (error);
    }

    private boolean isValid(){
        return this.getMin() <= this.getMax();
    }

    public void writeln() {
        new Console().writeln(this.toString());
    }

    public String toString() {
        return "[" + this.getMin() + ", " + this.getMax() + "]";
    }

}

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        final int SIZE = 3;
        Interval[] intervals = new Interval[SIZE];
        for (int i = 0; i < intervals.length; i++) {
            intervals[i] = new Interval();
            intervals[i].read();
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

        union.setMin(0);
        union.writeln();
        union.setMax(10);
        union.writeln();
        union.setMiddlePoint(3);
        union.writeln();
        union.setLength(4);
        union.writeln();
        
        final int times = console.readInt("Dame el número de partes: ");
        intervals = union.split(times);
        for (Interval interval : intervals) {
            interval.writeln();
        }

    }

}
