package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.GestorIO;
import es.usantatecla.u6excepciones.util.Interval;

class BoundedQueue extends BoundedDisepenser {

	private int first;

	public BoundedQueue(int size) {
		super(size);
		first = 0;
	}

	public void add(Interval interval) throws FullDispenserException {
		super.add(interval);
		if (this.next == this.intervals.length) {
			this.next = 0;
		}
	}

	public Interval remove() {
		this.length--;
		Interval interval = this.intervals[first];
		first = (this.first + 1) % this.intervals.length;
		return interval;
	}

	public BoundedQueueIterator iterator() {
		return new BoundedQueueIterator(this.intervals, this.length, this.first);
	}

	public void duplicate() {
		Interval[] intervals = new Interval[2 * this.intervals.length];
		int i = this.first;
		for (int j = 0; j < this.length; j++) {
			intervals[j] = this.intervals[i];
			i = (i + 1) % intervals.length;
		}
		this.intervals = intervals;
		this.first = 0;
		this.next = this.length;
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		BoundedQueue queue = new BoundedQueue(10);
		gestorIO.escribirLinea("-------");
		Iterator iterator = queue.iterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			try {
				queue.add(new Interval(-i, i));
			} catch (FullDispenserException ex) {
				ex.recover();
			}
		}
		gestorIO.escribirLinea("-------");
		iterator = queue.iterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			queue.remove();
		}
		for (int i = 0; i < 3; i++) {
			try {
				queue.add(new Interval(-100, 100));
			} catch (FullDispenserException ex) {
				ex.recover();
			}
		}
		gestorIO.escribirLinea("-------");
		iterator = queue.iterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}
	}
}
