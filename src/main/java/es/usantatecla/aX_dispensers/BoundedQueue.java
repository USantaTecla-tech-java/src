package es.usantatecla.aX_dispensers;

class BoundedQueue extends BoundedDisepenser {

	private int first;

	public BoundedQueue(int size) {
		super(size);
		this.first = 0;
	}

	public void add(Interval interval) {
		super.add(interval);
		if (this.next == this.intervals.length) {
			this.next = 0;
		}
	}

	public Interval remove() {
		this.size--;
		Interval interval = this.intervals[this.first];
		this.first = (this.first + 1) % this.intervals.length;
		return interval;
	}

	public Iterator getIterator() {
		return new BoundedQueueIterator(this.intervals, this.size, this.first);
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		BoundedQueue boundedQueue = new BoundedQueue(10);
		gestorIO.escribirLinea("-------");
		Iterator iterator = boundedQueue.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			boundedQueue.add(new Interval(-i, i));
		}
		gestorIO.escribirLinea("-------");
		iterator = boundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			boundedQueue.remove();
		}
		for (int i = 0; i < 3; i++) {
			boundedQueue.add(new Interval(-100, 100));
		}
		gestorIO.escribirLinea("-------");
		iterator = boundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}
	}
}
