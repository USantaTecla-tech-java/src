package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Iterator;

public class UnboundedStack extends UnboundedDispenser {

	public Object remove() {
		Object element = entrance.getElement();
		entrance = entrance.getNext();
		return element;
	}

	public Iterator getIterator() {
		return new UnboundedStackIterator(entrance);
	}

}
