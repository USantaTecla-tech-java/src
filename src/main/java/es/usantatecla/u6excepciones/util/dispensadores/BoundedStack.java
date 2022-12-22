package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.GestorIO;
import es.usantatecla.u6excepciones.util.Interval;

class BoundedStack extends BoundedDisepenser {

	public BoundedStack(int size) {
		super(size);
	}

	public Interval remove() {
		this.length--;
		this.next--;
		return this.intervals[this.next];
	}

	public Iterator iterator() {
		return new BoundedStackIterator(this.intervals, this.length, this.next);
	}

	public void duplicate() {
		Interval[] intervals = new Interval[2 * this.intervals.length];
		for (int i = 0; i < length; i++) {
			intervals[i] = this.intervals[i];
		}
		this.intervals = intervals;
		this.next = this.length;
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		BoundedStack stack = new BoundedStack(10);
		gestorIO.escribirLinea("-------");
		Iterator iterator = stack.iterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			try {
				stack.add(new Interval(-i, i));
			} catch (FullDispenserException ex) {
				ex.recover();
			}
		}
		gestorIO.escribirLinea("-------");
		iterator = stack.iterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			stack.remove();
		}
		for (int i = 0; i < 3; i++) {
			try {
				stack.add(new Interval(-100, 100));
			} catch (FullDispenserException ex) {
				ex.recover();
			}
		}
		gestorIO.escribirLinea("-------");
		iterator = stack.iterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}
	}
}
