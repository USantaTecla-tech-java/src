package es.usantatecla.aX_dispensers.a7_modular.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;
import es.usantatecla.aX_dispensers.a7_modular.utils.Node;

public class UnboundedStack extends UnboundedDispenser {

	public UnboundedStack() {
		super();
	}

	public Interval remove() throws EmptyDispenserException {
		super.remove();

		Interval element = entrance.getElement();
		entrance = entrance.getNext();
		return element;
	}

	public Interval[] getElements() {
		int size = 0;
		Node node = this.entrance;
		while (node != null) {
			size++;
			node = node.getNext();
		}
		Interval[] elements = new Interval[size];
		node = this.entrance;
		for(int position = 0; position < size; position++){
			elements[position] = node.getElement();
 			node = node.getNext();
		}
		return elements;
	}

}
