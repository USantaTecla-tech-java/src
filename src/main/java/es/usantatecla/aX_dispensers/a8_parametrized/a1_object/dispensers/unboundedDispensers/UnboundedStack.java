package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Interval;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Node;

public class UnboundedStack extends UnboundedDispenser {

	public UnboundedStack() {
		super();
	}

	public Object remove() throws EmptyDispenserException {
		super.remove();

		Object element = entrance.getElement();
		entrance = entrance.getNext();
		return element;
	}

	public Object[] getElements() {
		int size = 0;
		Node node = this.entrance;
		while (node != null) {
			size++;
			node = node.getNext();
		}
		Object[] elements = new Interval[size];
		node = this.entrance;
		for(int position = 0; position < size; position++){
			elements[position] = node.getElement();
 			node = node.getNext();
		}
		return elements;
	}

}
