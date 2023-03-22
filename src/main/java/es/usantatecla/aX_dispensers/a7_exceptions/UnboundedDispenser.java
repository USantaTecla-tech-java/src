package es.usantatecla.aX_dispensers.a7_exceptions;

abstract class UnboundedDispenser implements Dispenser {

	protected Node entrance;

	protected UnboundedDispenser() {
		this.entrance = null;
	}

	public void add(Interval element) {
		assert element != null;

		this.entrance = new Node(null, element, this.entrance);
	}

	public Interval remove() throws EmptyDispenserException {
		if (this.entrance == null){
			throw new EmptyDispenserException(this);
		}
		return null;
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

}
