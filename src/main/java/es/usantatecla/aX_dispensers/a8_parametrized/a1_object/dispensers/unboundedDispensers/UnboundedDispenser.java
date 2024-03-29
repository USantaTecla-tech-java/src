package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Node;

abstract class UnboundedDispenser implements Dispenser {

	protected Node entrance;

	protected UnboundedDispenser() {
		this.entrance = null;
	}

	public void add(Object element) {
		assert element != null;

		this.entrance = new Node(null, element, this.entrance);
	}

	public Object remove() throws EmptyDispenserException {
		if (this.entrance == null){
			throw new EmptyDispenserException(this);
		}
		return null;
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

}
