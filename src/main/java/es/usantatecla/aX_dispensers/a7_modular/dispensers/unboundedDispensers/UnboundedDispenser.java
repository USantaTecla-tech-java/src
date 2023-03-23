package es.usantatecla.aX_dispensers.a7_modular.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;
import es.usantatecla.aX_dispensers.a7_modular.utils.Node;

abstract class UnboundedDispenser implements Dispenser {

	protected Node entrance;

	protected UnboundedDispenser() {
		this.entrance = null;
	}

	public void add(Interval element) {
		assert element != null;

		this.entrance = new Node(null, element, this.entrance);
	}

	public Interval remove() throws EmptyDispenserException {
		if (this.entrance == null){
			throw new EmptyDispenserException(this);
		}
		return null;
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

}
