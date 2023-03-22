package es.usantatecla.aX_dispensers.a5_extends_a1_node;

class BoundedStack {

	private Interval[] elements;
	private int next;

	public BoundedStack(int capacity) {
		assert capacity > 0;

		this.elements = new Interval[capacity];
		this.next = 0;
	}

	public void add(Interval element) {
		assert element != null;

		this.elements[this.next] = element;
		this.next++;
	}

	public boolean isEmpty() {
		return this.next == 0;
	}

	public boolean isFull() {
		return this.next == elements.length;
	}

	public Interval remove() {
		assert this.next > 0;

		this.next--;
		return elements[next];
	}

	public Interval[] getElements(){
		Interval[] elements = new Interval[this.next];
		for (int position = 0; position < this.next; position++) {
			elements[position] = this.elements[this.next - 1 - position];
		}
		return elements;
	}

}
