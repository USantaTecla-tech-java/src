package es.usantatecla.aX_dispensers.a6_interfaces;

class BoundedStack extends BoundedDisepenser {

	public BoundedStack(int tamaño) {
		super(tamaño);
	}

	public Interval remove() {
		size--;
		next--;
		return intervals[next];
	}

	public Iterator getIterator() {
		return new BoundedStackIterator(intervals, size, next);
	}
	
}