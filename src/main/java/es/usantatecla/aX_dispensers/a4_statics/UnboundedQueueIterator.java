package es.usantatecla.aX_dispensers.a4_statics;

class UnboundedQueueIterator {

	private Node current;

	protected UnboundedQueueIterator(Node current) {
		this.current = current;
	}

	public boolean hasNext() {
		return this.current != null;
	}

	public Interval next() {
		Interval interval = this.current.getInterval();
		this.current = this.current.getPrevious();
		return interval;
	}
}
