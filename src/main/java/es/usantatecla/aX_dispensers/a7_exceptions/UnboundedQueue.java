package es.usantatecla.aX_dispensers.a7_exceptions;
class UnboundedQueue extends UnboundedDispenser {

	private Node exit;

	public UnboundedQueue() {
		this.exit = null;
	}

	public void add(Interval interval) {
		boolean empty = this.isEmpty();
		super.add(interval);
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

	public Iterator getIterator() {
		return new UnboundedQueueIterator(exit);
	}

}
