package es.usantatecla.u6excepciones.schools.serializationCustomized;

import es.usantatecla.u6excepciones.util.GestorIO;

public class List {

	private Node first = null;
	private Node last = null;
	private int length = 0;

	public boolean isEmpty() {
		return this.first == null;
	}

	public Object get(int position) {
		Node node = this.first;
		for (int i = 0; i < position; i++) {
			node = node.next();
		}
		return node.getElement();
	}

	public void add(Object element) {
		Node node = new Node(element);
		if (this.last == null) {
			this.first = node;

		} else {
			this.last.setNext(node);
		}
		this.last = node;
		this.length++;
	}

	public void remove(Object element) {
		Node previous = null;
		Node actual = this.first;
		while (!actual.contains(element)) {
			previous = actual;
			actual = actual.next();
		}
		if (previous == null) {
			this.first = actual.next();
		} else {
			previous.setNext(actual.next());
		}
		if (actual == this.last) {
			this.last = previous;
		}
		this.length--;
	}

	public Iterator iterador() {
		return new Iterator(this);
	}

	public List clone() {
		List list = new List();
		if (!this.isEmpty()) {
			Iterator iterator = this.iterador();
			while (iterator.hasNext()) {
				list.add(iterator.next());
			}
		}
		return list;
	}

	public void clear() {
		this.first = null;
		this.last = null;
	}

	public Node getFirst() {
		return this.first;
	}

	public int size() {
		return this.length;
	}

	public static void main(String[] args) {
		Integer firstItem = Integer.valueOf(1);
		Integer secondItem = Integer.valueOf(2);
		Integer thirdItem = Integer.valueOf(3);
		List list = new List();
		Iterator iterator = list.iterador();
		GestorIO.getGestorIO().escribirLinea("----------------------------");
		int position = 1;
		while (iterator.hasNext()) {
			GestorIO.getGestorIO().escribirLinea(position + ": " +
					(Integer) iterator.next());
			position++;
		}
		list.add(firstItem);
		iterator = list.iterador();
		GestorIO.getGestorIO().escribirLinea("----------------------------");
		position = 1;
		while (iterator.hasNext()) {
			GestorIO.getGestorIO().escribirLinea(position + ": " +
					(Integer) iterator.next());
			position++;
		}
		list.add(secondItem);
		iterator = list.iterador();
		GestorIO.getGestorIO().escribirLinea("----------------------------");
		position = 1;
		while (iterator.hasNext()) {
			GestorIO.getGestorIO().escribirLinea(position + ": " +
					(Integer) iterator.next());
			position++;
		}
		list.add(thirdItem);
		iterator = list.iterador();
		GestorIO.getGestorIO().escribirLinea("----------------------------");
		position = 1;
		while (iterator.hasNext()) {
			GestorIO.getGestorIO().escribirLinea(position + ": " +
					(Integer) iterator.next());
			position++;
		}
		list.remove(secondItem);
		iterator = list.iterador();
		GestorIO.getGestorIO().escribirLinea("----------------------------");
		position = 1;
		while (iterator.hasNext()) {
			GestorIO.getGestorIO().escribirLinea(position + ": " +
					(Integer) iterator.next());
			position++;
		}
		list.remove(firstItem);
		iterator = list.iterador();
		GestorIO.getGestorIO().escribirLinea("----------------------------");
		position = 1;
		while (iterator.hasNext()) {
			GestorIO.getGestorIO().escribirLinea(position + ": " +
					(Integer) iterator.next());
			position++;
		}
		list.remove(thirdItem);
		iterator = list.iterador();
		GestorIO.getGestorIO().escribirLinea("----------------------------");
		position = 1;
		while (iterator.hasNext()) {
			GestorIO.getGestorIO().escribirLinea(position + ": " +
					(Integer) iterator.next());
			position++;
		}
	}
}