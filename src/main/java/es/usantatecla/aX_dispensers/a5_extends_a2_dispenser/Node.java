package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

class Node extends Interval {

	private Node previous;
	private Node next;

	public Node(Node previous, Interval element, Node next) {
		super(element);
		
		this.setPrevious(previous);
		this.setNext(next);
	}

	public Node(Interval element, Node next) {
		this(null, element, next);
	}

	public Node(Node previous, Interval element) {
		this(previous, element, null);
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

	public Interval getElement() {
		return this;
	}

}
