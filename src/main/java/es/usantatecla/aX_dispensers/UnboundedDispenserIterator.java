package es.usantatecla.aX_dispensers;

abstract class UnboundedDispenserIterator implements Iterator {

	protected Node current;

	protected UnboundedDispenserIterator(Node current) {
		this.current = current;
	}

	public boolean hasNext() {
		return this.current != null;
	}

	public abstract Interval next();
}
