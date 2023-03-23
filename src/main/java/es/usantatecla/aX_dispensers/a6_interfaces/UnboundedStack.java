package es.usantatecla.aX_dispensers.a6_interfaces;

class UnboundedStack extends UnboundedDispenser {

	public UnboundedStack() {
		super();
	}

	public Interval remove() {
		assert !this.isEmpty();

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
