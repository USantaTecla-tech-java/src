package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

abstract class UnboundedDispenserIterator extends Iterator {

	protected Node current;

	protected UnboundedDispenserIterator(Node current) {
		this.current = current;
	}

	public boolean hasNext() {
		return this.current != null;
	}

	public abstract Interval next();
}

