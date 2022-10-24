package es.usantatecla.aX_dispensers;

abstract class UnboundedDispenser implements Dispenser {

	protected Node entrance;

	protected UnboundedDispenser() {
		this.entrance = null;
	}

	public void add(Interval interval) {
		this.entrance = new Node(null, interval, this.entrance);
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}
}
