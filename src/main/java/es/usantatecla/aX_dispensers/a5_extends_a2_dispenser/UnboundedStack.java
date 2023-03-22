package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

class UnboundedStack extends UnboundedDispenser {

	UnboundedStack() {
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
