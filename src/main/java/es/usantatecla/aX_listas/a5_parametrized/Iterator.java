package es.usantatecla.aX_listas.a5_parametrized;

public class Iterator<E extends Number> {

	private Node<E> current;

	public Iterator(List<E> list){
		this.current = list.getFirst();
	}

	public boolean hasNext(){
		return current != null;
	}

	public E next() {
		E element = current.getElement();
		current = current.next();
		return element;
	}
}
