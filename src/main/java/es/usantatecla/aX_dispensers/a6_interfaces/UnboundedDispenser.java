package es.usantatecla.aX_dispensers.a6_interfaces;

abstract class UnboundedDispenser implements Dispenser {

	protected Node entrance;

	protected UnboundedDispenser() {
		this.entrance = null;
	}

	public void add(Interval element) {
		assert element != null;

		this.entrance = new Node(null, element, this.entrance);
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

}
