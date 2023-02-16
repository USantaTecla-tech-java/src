package es.usantatecla.aX_dispensers.a4_statics;

class UnboundedStackIterator {

	private Node current;

	public UnboundedStackIterator(Node current) {
		this.current = current;
	}

	public boolean hasNext() {
		return this.current != null;
	}

	public Interval next() {
		Interval intervalo = current.getInterval();
		current = current.getNext();
		return intervalo;
	}
}
