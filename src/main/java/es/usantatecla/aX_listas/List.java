package es.usantatecla.aX_listas;

class List {

	private Node first;
	private Node last;

	public List() {
		this.first = null;
		this.last = null;
	}

	protected Node getFirst() {
		return this.first;
	}

	protected Node getLast() {
		return this.last;
	}

	protected void setFirst(Node first) {
		this.first = first;
	}

	protected void setEnd(Node last) {
		this.last = last;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public void insertFirst(Interval interval) {
		this.first = new Node(null, interval, this.first);
		if (this.last == null) {
			this.last = this.first;
		}
	}

	public void insertLast(Interval interval) {
		this.last = new Node(this.last, interval, null);
		if (this.first == null) {
			this.first = this.last;
		}
	}

	public Interval removeFirst() {
		Interval intervalo = this.first.getInterval();
		this.first = this.first.getNext();
		if (this.first == null) {
			this.last = null;
		} else {
			this.first.setPrevious(null);
		}
		return intervalo;
	}

	public Interval removeLast() {
		Interval interval = this.last.getInterval();
		this.last = this.last.getPrevious();
		if (this.last == null) {
			this.first = null;
		} else {
			this.last.setNext(null);
		}
		return interval;
	}

	public boolean includes(Interval interval) {
		if (this.isEmpty()) {
			return false;
		} else {
			Node current = this.first;
			while (current.getNext() != null &&
					!current.getInterval().equals(interval)) {
				current = current.getNext();
			}
			return current.getInterval().equals(interval);
		}
	}

	public Iterator getIterator() {
		return new Iterator(this.first);
	}

	private void writeln() {
		Iterator iterador = this.getIterator();
		int posicion = 1;
		while (iterador.hasNext()) {
			GestorIO.getGestorIO().writeln(posicion + ": " +
					iterador.next().toString());
			posicion++;
		}
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		List list = new List();
		gestorIO.writeln ("Contenido inicial de la lista:");
		list.writeln();
		gestorIO.writeln("Esta: " + list.includes(new Interval(-7, 7)));

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				list.insertFirst(new Interval(-i, i));
			} else {
				list.insertLast(new Interval(-i, i));
			}
		}
		gestorIO.writeln("-------");
		gestorIO.writeln("Contenido de la lista despues de inserciones");
		list.writeln();
		gestorIO.writeln("Esta: " + list.includes(new Interval(-7, 7)));
		for (int i = 0; i < 3; i++) {
			list.removeFirst();
			list.removeLast();
		}
		gestorIO.writeln("-------");
		gestorIO.writeln("Contenido después de eliminaciones");
		list.writeln();
		gestorIO.writeln("Esta: " + list.includes(new Interval(-7, 7)));
	}
}
