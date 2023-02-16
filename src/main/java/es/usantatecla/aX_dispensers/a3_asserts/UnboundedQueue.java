package es.usantatecla.aX_dispensers.a3_asserts;

class UnboundedQueue {

	private Node exit;
	protected Node entrance;

	protected UnboundedQueue() {
		this.entrance = null;
		this.exit = null;
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

	public void add(Interval interval) {
		boolean empty = this.isEmpty();
		this.entrance = new Node(null, interval, this.entrance);
		if (empty) {
			this.exit = this.entrance;
		}
	}

	public Interval remove() {
		Interval interval = exit.getInterval();
		if (this.exit.getPrevious() == null) {
			this.entrance = null;
			this.exit = null;
		} else {
			this.exit = exit.getPrevious();
			this.exit.setNext(null);
		}
		return interval;
	}

	public UnboundedQueueIterator getIterator() {
		return new UnboundedQueueIterator(exit);
	}

}
