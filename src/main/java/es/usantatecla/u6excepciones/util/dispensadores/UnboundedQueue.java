package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.GestorIO;
import es.usantatecla.u6excepciones.util.Interval;

class UnboundedQueue extends UnboundedDispenser {

	private Node out;

	public UnboundedQueue() {
		this.out = null;
	}

	public void add(Interval intervalo) {
		boolean isEmpty = this.isEmpty();
		super.add(intervalo);
		if (isEmpty) {
			this.out = node;
		}
	}

	public Interval remove() {
		Interval intervalo = this.out.getInterval();
		if (this.out.getPrevious() == null) {
			this.node = null;
			this.out = null;
		} else {
			this.out = this.out.getPrevious();
			this.out.setNext(null);
		}
		return intervalo;
	}

	public Iterator iterator() {
		return new UnboundedQueueIterator(out);
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		UnboundedQueue queue = new UnboundedQueue();
		gestorIO.escribirLinea("-------");
		Iterator iterator = queue.iterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			queue.add(new Interval(-i, i));
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
			queue.add(new Interval(-100, 100));
		}
		gestorIO.escribirLinea("-------");
		iterator = queue.iterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 8; i++) {
			queue.remove();
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
