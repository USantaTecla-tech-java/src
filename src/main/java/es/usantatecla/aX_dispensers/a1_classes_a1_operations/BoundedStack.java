package es.usantatecla.aX_dispensers.a1_classes_a1_operations;

class BoundedStack {

	private Interval[] intervals;
	private int next;

	public BoundedStack(int capacity) {
		this.intervals = new Interval[capacity];
		this.next = 0;
	}

	public void add(Interval interval) {
		this.intervals[this.next] = interval;
		this.next++;
	}

	public boolean isEmpty() {
		return this.next == 0;
	}

	public boolean isFull() {
		return this.next == intervals.length;
	}

	public Interval remove() {
		this.next--;
		return intervals[next];
	}

	public void writeln(String title) {
		Console console = new Console();
		console.writeln(title);
		for (int position = 0; position < this.next; position++) {
			console.writeln((position + 1) + ": " + this.intervals[this.next - 1 - position]);
		}
	}

}
