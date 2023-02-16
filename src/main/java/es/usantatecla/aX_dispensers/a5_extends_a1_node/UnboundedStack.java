package es.usantatecla.aX_dispensers.a5_extends_a1_node;

class UnboundedStack {

	private Node entrance;

	protected UnboundedStack() {
		this.entrance = null;
	}

	public void add(Interval interval) {
		this.entrance = new Node(null, interval, this.entrance);
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}
	public Interval remove() {
		Interval interval = entrance.getInterval();
		entrance = entrance.getNext();
		return interval;
	}

	public UnboundedStackIterator getIterator() {
		return new UnboundedStackIterator(entrance);
	}

}
