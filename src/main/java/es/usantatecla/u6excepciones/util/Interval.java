package es.usantatecla.u6excepciones.util;

public class Interval {

	private Integer min;
	private Integer max;

	public Interval(Integer min, Integer max) {
		this.min = min;
		this.max = max;
	}

	public Interval(Interval interval) {
		this(interval.getMin(), interval.getMax());
	}

	public boolean includes(Integer value) {
		return min.compareTo(value) <= 0 &&
			max.compareTo(value) >= 0;
	}

	public boolean includes(Interval interval) {
		return this.includes(interval.getMin()) &&
			   this.includes(interval.getMax());
	}

	public Interval copy() {
		return new Interval(min, max);
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}

