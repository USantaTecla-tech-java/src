package es.usantatecla.aX_listas.a5_parametrized2;

public class Iterator<E extends Number> {

	private Node<E> current;

	public Iterator(List<E> list){
		this.current = list.getFirst();
	}

	public boolean hasNext(){
		return current != null;
	}

	public E next() {
		E elemento = current.getElement();
		current = current.next();
		return elemento;
	}
}
