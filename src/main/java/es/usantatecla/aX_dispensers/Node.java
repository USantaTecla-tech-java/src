package es.usantatecla.aX_dispensers;

class Node extends Interval {

	private Node previous;
	private Node next;

	public Node(Node previous, Interval interval, Node next) {
		super(interval);
		this.setPrevious(previous);
		this.setNext(next);
	}

	public Node getPrevious() {
		return this.previous;
	}

	public Node getNext() {
		return this.next;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
		if (this.previous != null) {
			this.previous.next = this;
		}
	}

	public void setNext(Node next) {
		this.next = next;
		if (this.next != null) {
			this.next.previous = this;
		}
	}

	public Interval getInterval() {
		return new Interval(this.getMinimo(), this.getMaximo());
	}
}
