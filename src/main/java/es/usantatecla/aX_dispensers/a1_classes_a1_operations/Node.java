package es.usantatecla.aX_dispensers.a1_classes_a1_operations;

class Node {

	private Node previous;
	private Interval interval;
	private Node next;

	public Node(Node previous, Interval interval, Node next) {
		this.setPrevious(previous);
		this.interval = interval;
		this.setNext(next);
	}

	public Node(Interval interval, Node next) {
		this(null, interval, next);
	}

	public Node(Node previous, Interval interval) {
		this(previous, interval, null);
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
		return new Interval(this.interval);
	}

}
