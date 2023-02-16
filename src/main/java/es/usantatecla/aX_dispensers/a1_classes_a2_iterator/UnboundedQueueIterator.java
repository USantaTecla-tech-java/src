package es.usantatecla.aX_dispensers.a1_classes_a2_iterator;

class UnboundedQueueIterator {

	private Node current;

	UnboundedQueueIterator(Node current) {
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
