package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils;

public class Node {

	private Node previous;
	private Object element;
	private Node next;

	public Node(Node previous, Object element, Node next) {
		this.setPrevious(previous);
		this.element = element;
		this.setNext(next);
	}

	public Node getPrevious() {
		return this.previous;
	}

	public Object getElement() {
		return this.element;
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
	
}
