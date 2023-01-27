package es.usantatecla.a5_units.a1_interval.classes;

import es.usantatecla.utils.Console;

class Interval {

    private float min;
    private float max;

    public Interval(float min, float max) {
        this.min = min;
        this.max = max;
    }

    public Interval(float max) {
        this(0, max);
    }

    public Interval() {
        this(0);
    }

    public Interval clone(){
        return new Interval(this);
    }

    private Interval(Interval interval) {
        this(interval.min, interval.max);
    }

    public float length() {
        return this.max - this.min;
    }

    public float midpoint() {
        return (-this.min + this.max) / 2;
    }

    public boolean includes(float point) {
        return this.min <= point && point <= this.max;
    }

    public boolean includes(Interval interval) {
        return this.includes(interval.min) 
            && this.includes(interval.max);
    }

    public boolean isIntersected(Interval interval) {
        return this.includes(interval.min) 
            || this.includes(interval.max) 
            || interval.includes(this);
    }

    public Interval intersection(Interval interval){
        Interval intersection = this.clone();
        if (interval.min > this.min){
            intersection.min = interval.min;
        }
        if (interval.max < this.max){
            intersection.max = interval.max;
        }
        return intersection;
    }

    public Interval union(Interval interval){
        Interval union = this.clone();
        if (interval.min < this.min){
            union.min = interval.min;
        }
        if (interval.max > this.max){
            union.max = interval.max;
        }
        return union;
    }

    public Interval shifted(float shiftment) {
        return new Interval(this.min + shiftment, this.max + shiftment);
    }

    public Interval opposite() {
        return new Interval(-this.max, -this.min);
    }

    public Interval[] split(int times){
        Interval[] intervals = new Interval[times];
        final float length = this.length() / times;
        float origin = this.min;
        for(int i=0; i<intervals.length; i++){
            intervals[i] = new Interval(origin, origin + length);
            origin += length;
        }
        return intervals;
    }

    public void read() {
        Console console = new Console();
        this.min = console.readFloat("Dame el mínimo del intervalo: ");
        this.max = console.readFloat("Dame el máximo del intervalo: ");
    }

    public void writeln() {
        new Console().writeln(this.toString());
    }

    public String toString() {
        return "[" + this.min + ", " + this.max + "]";
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
        console.writeln("Intersection: " + intersection);

        Interval interval = new Interval();
        interval.read();
        final int times = console.readInt("Dame el número de partes: ");
        intervals = interval.split(times);
        for(Interval part : intervals){
            part.writeln();
        }

    }
}
