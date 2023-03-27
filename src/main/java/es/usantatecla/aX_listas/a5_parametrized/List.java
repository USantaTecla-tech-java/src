package es.usantatecla.aX_listas.a5_parametrized;

public class List<E extends Number> {

	private Node<E> first = null;
	private Node<E> last = null;
	private int size = 0;

	Node<E> getFirst() {
		return this.first;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public E get(int position) {
		Node<E> node = first;
		for (int i = 0; i < position; i++) {
			node = node.next();
		}
		return node.getElement();
	}

	public void add(E element) {
		Node<E> newNode = new Node<E>(element);
		if (this.last == null) {
			this.first = newNode;

		} else {
			this.last.setNext(newNode);
		}
		this.last = newNode;
		this.size++;
	}

	public void remove(E element) {
		Node<E> previous = null;
		Node<E> current = this.first;
		while (!current.contains(element)) {
			previous = current;
			current = current.next();
		}
		if (previous == null) {
			this.first = current.next();
		} else {
			previous.setNext(current.next());
		}
		if (current == this.last) {
			this.last = previous;
		}
		this.size--;
	}

	public Iterator<E> iterator() {
		return new Iterator<E>(this);
	}

	public List<E> clone() {
		List<E> list = new List<E>();
		if (!this.isEmpty()) {
			Iterator<E> iterator = this.iterator();
			while (iterator.hasNext()) {
				list.add(iterator.next());
			}
		}
		return list;
	}

	public void clear() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public String toString() {
		String string = "{";
		Iterator<E> iterator = this.iterator();
		if (iterator.hasNext()) {
			string += iterator.next();
		}
		while (iterator.hasNext()) {
			string += "; " + iterator.next();
		}
		return string + "}";
	}

	public double sum(List<Number> list) {
		double sum = 0.0;
		Iterator<E> iteratorThis = this.iterator();
		while (iteratorThis.hasNext()) {
			E element = iteratorThis.next();
			sum += element.doubleValue();
		}
		Iterator<Number> iteradorList = list.iterator();
		while (iteradorList.hasNext()) {
			Number number = iteradorList.next();
			sum += number.doubleValue();
		}
		return sum;
	}

}
