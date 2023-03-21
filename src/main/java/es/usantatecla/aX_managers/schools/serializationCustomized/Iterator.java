package es.usantatecla.aX_managers.schools.serializationCustomized;

public class Iterator {

	private Node actual;

	public Iterator(List list){
		this.actual = list.getFirst();
	}

	public boolean hasNext(){
		return actual != null;
	}

	public Object next() {
		Object elemento = actual.getElement();
		actual = actual.next();
		return elemento;
	}
}
