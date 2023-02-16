package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

class BoundedStack extends BoundedDisepenser {

	public BoundedStack(int capacity) {
		super(capacity);
	}

	public Interval remove() {
		assert !this.isEmpty();
		
		size--;
		next--;
		return intervals[next];
	}

	public Iterator getIterator() {
		return new BoundedStackIterator(intervals, size, next);
	}

}
