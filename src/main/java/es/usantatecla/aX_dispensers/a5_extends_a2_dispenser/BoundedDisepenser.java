package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

abstract class BoundedDisepenser extends Dispenser {

	protected Interval[] elements;
	protected int size;
	protected int next;

	protected BoundedDisepenser(int capacity) {
		assert capacity > 0;

		this.elements = new Interval[capacity];
		this.size = 0;
		this.next = 0;
	}

	public abstract Interval remove();

	public void add(Interval element) {
		assert element != null;
		assert !this.isFull();

		this.size++;
		this.elements[this.next] = element;
		this.next++;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == elements.length;
	}
}
