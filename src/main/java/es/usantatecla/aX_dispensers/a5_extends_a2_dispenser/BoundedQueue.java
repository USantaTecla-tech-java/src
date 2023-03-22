package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

class BoundedQueue extends BoundedDisepenser {

	private int first;

	public BoundedQueue(int capacity) {
		super(capacity);
		this.first = 0;
	}

	public void add(Interval element) {
		super.add(element);
		if (this.next == this.elements.length) {
			this.next = 0;
		}
	}

	public Interval remove() {
		assert this.size > 0;
		
		this.size--;
		Interval element = this.elements[this.first];
		this.first = (this.first + 1) % this.elements.length;
		return element;
	}

	public Interval[] getElements() {
		Interval[] elements = new Interval[this.size];
		for(int position= 0; position < this.size; position++){
			elements[position] = this.elements[(position + this.first)  % this.elements.length];
		}
		return elements;
	}

}
