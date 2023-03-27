package es.usantatecla.aX_listas.a5_parametrized;

class Node<E> {

	private E element;
	private Node<E> next;

	public Node(E element) {
		this.element = element;
		this.next = null;
	}

	public E getElement() {
		return element;
	}

	public void setNext(Node<E> node) {
		this.next = node;
	}

	public boolean contains(E element) {
		return this.element == element;
	}

	public Node<E> next() {
		return next;
	}
}
