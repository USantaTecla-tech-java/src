package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

class BoundedStack extends BoundedDisepenser {

	public BoundedStack(int capacity) {
		super(capacity);
	}

	public Interval remove() {
		this.size--;
		this.next--;
		return this.elements[next];
	}

	public Interval[] getElements(){
		Interval[] elements = new Interval[this.next];
		for (int position = 0; position < this.next; position++) {
			elements[position] = this.elements[this.next - 1 - position];
		}
		return elements;
	}

}
