package es.usantatecla.aX_managers.schools.serializationCustomized;

class Node {

	private Object element;
	private Node next;

	public Node(Object element) {
		this.element = element;
		this.next = null;
	}

	public Object getElement() {
		return element;
	}

	public void setNext(Node nodo) {
		this.next = nodo;
	}

	public boolean contains(Object elemento) {
		return this.element == elemento;
	}

	public Node next() {
		return next;
	}
}
