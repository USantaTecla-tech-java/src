package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils;

public class Node<E> {

	private Node<E> previous;
	private E element;
	private Node<E> next;

	public Node(Node<E> previous, E element, Node<E> next) {
		this.setPrevious(previous);
		this.element = element;
		this.setNext(next);
	}

	public Node<E> getPrevious() {
		return this.previous;
	}

	public E getElement() {
		return this.element;
	}

	public Node<E> getNext() {
		return this.next;
	}

	public void setPrevious(Node<E> previous) {
		this.previous = previous;
		if (this.previous != null) {
			this.previous.next = this;
		}
	}

	public void setNext(Node<E> next) {
		this.next = next;
		if (this.next != null) {
			this.next.previous = this;
		}
	}
	
}
