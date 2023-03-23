package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Node;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;

public abstract class UnboundedDispenser implements Dispenser {

	protected Node entrance;

	protected UnboundedDispenser() {
		this.entrance = null;
	}

	public void add(Object element) {
		this.entrance = new Node(null, element, this.entrance);
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

	public Object remove() throws EmptyDispenserException {
		if (this.entrance == null){
			throw new EmptyDispenserException(this);
		}
		return null;
	}
}
