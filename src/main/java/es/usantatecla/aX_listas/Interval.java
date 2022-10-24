package es.usantatecla.aX_listas;

class Interval {

	private double min;
	private double max;

	public Interval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public Interval() {
		this(0, 0);
	}

	public Interval(Interval interval) {
		this(interval.min, interval.max);
	}

	protected double getMin() {
		return this.min;
	}

	protected double getMax() {
		return this.max;
	}

	public void set(Interval interval) {
		this.min = interval.min;
		this.max = interval.max;
	}

	public boolean equals(Interval interval) {
		return min == interval.min &&
			   max == interval.max;
	}

	public double length() {
		return this.max - this.min;
	}

	public double getMiddlePoint() {
		return (this.max + this.min) / 2;
	}

	public Interval copy() {
		return new Interval(this);
	}

	public Interval symetric() {
		return new Interval(-this.max, -this.min);
	}

	public void shift(double amount) {
		this.min += amount;
		this.max += amount;
	}

	public void scale(double factor) {
		double newLength = this.length() * factor;
		double middlePoint = this.getMiddlePoint();
		this.min = middlePoint - newLength / 2;
		this.max = middlePoint + newLength / 2;
	}

	public boolean includes(double value) {
		return this.min <= value && value <= this.max;
	}

	public boolean includes(Interval interval) {
		return this.includes(interval.min) &&
				this.includes(interval.max);
	}

	public Interval intersection(Interval interval) {
		if (this.includes(interval)) {
			return interval.copy();
		} else if (interval.includes(this)) {
			return this.copy();
		} else if (this.includes(interval.min)) {
			return new Interval(interval.min, this.max);
		} else if (this.includes(interval.max)) {
			return new Interval(this.min, interval.max);
		} else {
			return null;
		}
	}

	public Interval shifted(double amount) {
		Interval interval = this.copy();
		interval.shift(amount);
		return interval;
	}

	public void read() {
		GestorIO gestorIO = GestorIO.getGestorIO();
		do {
			this.min = gestorIO.readDouble("Introduce el minimo: ");
			this.max = gestorIO.readDouble("Introduce el maximo: ");
			if (this.min > this.max) {
				gestorIO.writeln(
						"El minimo no puede ser mayor que el maximo");
			}
		} while (this.min > this.max);
	}

	public String toString() {
		return "[" + this.min + ", " + this.max + "]";
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		Interval interval = new Interval();
		interval.read();
		gestorIO.writeln("Longitud: " + interval.length());
		gestorIO.writeln("Punto medio: " + interval.getMiddlePoint());
		gestorIO.writeln("Simetrico: " + interval.symetric());
		Interval copy = interval.copy();
		interval.shift(7.7);
		gestorIO.writeln("Desplazado 7.7: " + interval);
		gestorIO.writeln("Incluye 3.3? " + interval.includes(3.3));
		gestorIO.writeln("Incluye al original? " +
				interval.includes(copy));
	}
}
