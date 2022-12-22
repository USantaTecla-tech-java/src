package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

class Node extends Interval {

	private Node previous;
	private Node next;

	public Node(Node previous, Interval interval, Node next) {
		super(interval);
		this.setPrevious(previous);
		this.setNext(next);
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
		if (previous != null) {
			previous.next = this;
		}
	}

	public void setNext(Node next) {
		this.next = next;
		if (next != null) {
			next.previous = this;
		}
	}

	public Interval getInterval() {
		return new Interval(this.getMin(), this.getMax());
	}

	public Node getPrevious() {
		return previous;
	}

	public Node getNext() {
		return next;
	}

}
