package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers;

public interface Dispenser<E> {

	void add(E element) throws FullDispenserException;
	E remove() throws EmptyDispenserException;
	boolean isEmpty();
	E[] getElements();
	
}
