package es.usantatecla.aX_listas.a4_extends_protected_attibutes;

class Iterator {

	private Node current;

	public Iterator(Node current) {
		this.current = current;
	}

	public boolean hasNext() {
		return this.current != null;
	}

	public Interval next() {
		Interval interval = this.current.getInterval();
		this.current = this.current.getNext();
		return interval;
	}
	
}
