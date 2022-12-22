package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.GestorIO;
import es.usantatecla.u6excepciones.util.Interval;

class UnboundedStack extends UnboundedDispenser {

	public Interval remove() {
		Interval interval = node.getInterval();
		node = node.getNext();
		return interval;
	}

	public Iterator iterator() {
		return new UnboundedStackIterator(node);
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		UnboundedStack stack = new UnboundedStack();
		gestorIO.escribirLinea("-------");
		Iterator iterator = stack.iterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			stack.add(new Interval(-i, i));
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
			stack.add(new Interval(-100, 100));
		}

		gestorIO.escribirLinea("-------");
		iterator = stack.iterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 8; i++) {
			stack.remove();
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
