package es.usantatecla.aX_dispensers;

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

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		BoundedStack boudedStack = new BoundedStack(10);
		gestorIO.escribirLinea("-------");
		Iterator iterator = boudedStack.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			boudedStack.add(new Interval(-i, i));
		}
		gestorIO.escribirLinea("-------");
		iterator = boudedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			boudedStack.remove();
		}
		for (int i = 0; i < 3; i++) {
			boudedStack.add(new Interval(-100, 100));
		}
		gestorIO.escribirLinea("-------");
		iterator = boudedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}
	}
}
