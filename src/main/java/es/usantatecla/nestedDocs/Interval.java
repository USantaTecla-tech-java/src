package es.usantatecla.nestedDocs;

public class Interval<E extends Comparable<E>> {

    private final E min;
    private final E max;

    public Interval(E min, E max) {
        assert min.compareTo(max) < 0;

        this.min = min;
        this.max = max;
    }

    public Interval(Interval<E> interval) {
        this(interval.min, interval.max);
    }

    public boolean includes(E point) {
        return this.min.compareTo(point) < 0 && point.compareTo(this.max) < 0;
    }

    public boolean includes(Interval<E> interval) {
        assert interval != null;

        return this.includes(interval.min)
                && this.includes(interval.max);
    }

    public boolean isIntersected(Interval<E> interval) {
        assert this != null;

        return this.includes(interval.min)
                || this.includes(interval.max)
                || interval.includes(this);
    }
    
    public Interval<E> intersection(Interval<E> interval) {
        assert this.isIntersected(interval);

        if (this.includes(interval)) {
            return new Interval<E>(interval.min, interval.max);
        }
        if (interval.includes(this)) {
            return new Interval<E>(this.min, this.max);
        }
        if (this.includes(interval.min)) {
            return new Interval<E>(interval.min, this.max);
        }
        return new Interval<E>(this.min, interval.max);
    }
    
    public Interval<E> union(Interval<E> interval) {
        assert this.isIntersected(interval);

        if (this.includes(interval)) {
            return new Interval<E>(this.min, this.max);
        }
        if (interval.includes(this)) {
            return new Interval<E>(interval.min, interval.max);
        }
        if (this.includes(interval.min)) {
            return new Interval<E>(this.min, interval.max);
        }
        return new Interval<E>(interval.min, this.max);
    }

    public Interval<E> leftOver(Interval<E> interval){
        return new Interval<E>(this.min, interval.min);
    }

    public Interval<E> rightOver(Interval<E> interval){
        return new Interval<E>(interval.max, this.max);
    }

    public String toString() {
        return "[" + this.min + ", " + this.max + "]";
    }

}
