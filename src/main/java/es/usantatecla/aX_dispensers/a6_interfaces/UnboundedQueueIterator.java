package es.usantatecla.aX_dispensers.a6_interfaces;

class UnboundedQueueIterator extends UnboundedDispenserIterator {

	public UnboundedQueueIterator(Node current) {
		super(current);
	}

	public Interval next() {
		Interval interval = this.current.getInterval();
		this.current = this.current.getPrevious();
		return interval;
	}
}
