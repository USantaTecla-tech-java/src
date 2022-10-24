package es.usantatecla.aX_dispensers;

class UnboundedStack extends UnboundedDispenser {

	public Interval remove() {
		Interval interval = entrance.getInterval();
		entrance = entrance.getNext();
		return interval;
	}

	public Iterator getIterator() {
		return new UnboundedStackIterator(entrance);
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		UnboundedStack unboundedStack = new UnboundedStack();
		gestorIO.escribirLinea("-------");
		Iterator iterator = unboundedStack.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			unboundedStack.add(new Interval(-i, i));
		}
		gestorIO.escribirLinea("-------");
		iterator = unboundedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			unboundedStack.remove();
		}
		for (int i = 0; i < 3; i++) {
			unboundedStack.add(new Interval(-100, 100));
		}

		gestorIO.escribirLinea("-------");
		iterator = unboundedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 8; i++) {
			unboundedStack.remove();
		}
		gestorIO.escribirLinea("-------");
		iterator = unboundedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}
	}
}
