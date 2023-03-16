package es.usantatecla.a5_units.a1_interval.a5_exceptions;

class Interval {

    private static final double ORIGIN = 0;
    private final double min;
    private final double max;

    public Interval(double min, double max) {
        assert min <= max;

        this.min = min;
        this.max = max;
    }

    public Interval(double max) {
        this(Interval.ORIGIN, max);
    }

    public Interval() {
        this(Interval.ORIGIN);
    }

    public Interval clone() {
        return new Interval(this);
    }

    public Interval(Interval interval) {
        //assert interval != null;

        this(interval.min, interval.max);
    }

    public double length() {
        return this.max - this.min;
    }

    public double middlePoint() {
        return this.min + this.length() / 2;
    }

    public Interval scaled(double scale) {
        assert scale > 0;
        
        final double newMiddelPoint = this.middlePoint();
        final double newHalfLength = this.length() * scale / 2;
        return new Interval(newMiddelPoint - newHalfLength, newMiddelPoint + newHalfLength);
    }

    public Interval opposite() {
        return new Interval(-this.max, -this.min);
    }

    public boolean includes(double point) {
        return this.min <= point && point <= this.max;
    }

    public boolean includes(Interval interval) {
        assert interval != null;

        return this.includes(interval.min)
                && this.includes(interval.max);
    }

    public boolean isIntersected(Interval interval) {
        assert this != null;

        return this.includes(interval.min)
                || this.includes(interval.max)
                || interval.includes(this);
    }
    
    public Interval intersection(Interval interval) {
        assert this.isIntersected(interval);

        if (this.includes(interval)) {
            return interval.clone();
        }
        if (interval.includes(this)) {
            return this.clone();
        }
        if (this.includes(interval.min)) {
            return new Interval(interval.min, this.max);
        }
        return new Interval(this.min, interval.max);
    }
    
    public Interval union(Interval intervalo) {
        assert this.isIntersected(intervalo);

        if (this.includes(intervalo)) {
            return this.clone();
        }
        if (intervalo.includes(this)) {
            return intervalo.clone();
        }
        if (this.includes(intervalo.min)) {
            return new Interval(this.min, intervalo.max);
        }
        return new Interval(intervalo.min, this.max);
    }

    public Interval shifted(double shiftment) {
        return new Interval(this.min + shiftment, this.max + shiftment);
    }

    public Interval[] split(int times) {
        assert times > 0;

        Interval[] intervals = new Interval[times];
        final double length = this.length() / times;
        intervals[0] = new Interval(this.min, this.min + length);
        for (int i = 1; i < intervals.length; i++) {
            intervals[i] = intervals[i - 1].shifted(length);
        }
        return intervals;
    }

    public void writeln() {
        new Console().writeln(this.toString());
    }

    public String toString() {
        return "[" + this.min + ", " + this.max + "]";
    }

    public static Interval read() {
        Console console = new Console();
        boolean ok;
        double min;
        double max;
        do {
            min = console.readDouble("Dame el mínimo del intervalo: ");
            max = console.readDouble("Dame el máximo del intervalo: ");
            ok = min <= max;
            if (!ok) {
                console.writeln("El minimo no puede ser mayor que el maximo");
            }
        } while (!ok);
        return new Interval(min, max);
    }

}
