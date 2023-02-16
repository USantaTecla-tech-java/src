package es.usantatecla.aX_dispensers.a1_classes_a1_operations;

class BoundedStack {

	private Interval[] intervals;
	private int size;
	private int next;

	public BoundedStack(int capacity) {
		this.intervals = new Interval[capacity];
		this.size = 0;
		this.next = 0;
	}

	public void add(Interval interval) {
		this.size++;
		this.intervals[this.next] = interval;
		this.next++;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == intervals.length;
	}

	public Interval remove() {
		this.size--;
		this.next--;
		return intervals[next];
	}

	public void writeln(String title) {
		Console console = new Console();
		console.writeln(title);
		for (int position = 0; position < this.size; position++) {
			console.writeln((position + 1) + ": " + this.intervals[this.size - 1 - position]);
		}
	}

}
