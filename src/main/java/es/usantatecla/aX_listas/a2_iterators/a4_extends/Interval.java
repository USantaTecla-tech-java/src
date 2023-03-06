package es.usantatecla.aX_listas.a2_iterators.a4_extends;

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

	public double getMin() {
		return this.min;
	}

	public double getMax() {
		return this.max;
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
		return new Interval(
			this.getMin()+ amount, 
			this.getMax() + amount);
	}

	public void read() {
		do {
			this.min = Console.getInstance().readDouble("Introduce el minimo: ");
			this.max = Console.getInstance().readDouble("Introduce el maximo: ");
			if (this.min > this.max) {
				Console.getInstance().writeln(
						"El minimo no puede ser mayor que el maximo");
			}
		} while (this.min > this.max);
	}

	public String toString() {
		return "[" + this.min + ", " + this.max + "]";
	}

}
