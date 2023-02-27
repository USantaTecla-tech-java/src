package es.usantatecla.aX_listas.a0_classes;

class List {

	private Node first;
	private Node last;

	public List() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public void insertFirst(Interval interval) {
		this.first = new Node(interval, this.first);
		if (this.last == null) {
			this.last = this.first;
		}
	}

	public void insertLast(Interval interval) {
		this.last = new Node(this.last, interval);
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
		if (this.isEmpty())
			return false;
		Node current = this.first;
		while (current.getNext() != null &&
				!current.getInterval().equals(interval)) {
			current = current.getNext();
		}
		return current.getInterval().equals(interval);
	}

	public Iterator getIterator() {
		return new Iterator(this.first);
	}

	public void writeln() {
		Iterator iterador = this.getIterator();
		int posicion = 1;
		while (iterador.hasNext()) {
			Console.getInstance().writeln(posicion + ": " +
					iterador.next().toString());
			posicion++;
		}
	}

}
