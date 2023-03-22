package es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.utils.Node;
import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.EmptyDispenserException;

public abstract class UnboundedDispenser<E> implements Dispenser<E> {

	protected Node<E> entrance;

	protected UnboundedDispenser() {
		this.entrance = null;
	}

	public void add(E element) {
		this.entrance = new Node<E>(null, element, this.entrance);
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

	public E remove() throws EmptyDispenserException {
		if (this.entrance == null){
			throw new EmptyDispenserException(this);
		}
		return null;
	}
}
