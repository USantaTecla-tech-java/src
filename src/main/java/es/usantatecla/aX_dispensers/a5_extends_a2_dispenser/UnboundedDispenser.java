package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

abstract class UnboundedDispenser extends Dispenser {

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
