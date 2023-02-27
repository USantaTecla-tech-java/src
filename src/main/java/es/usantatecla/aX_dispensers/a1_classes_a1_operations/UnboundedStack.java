package es.usantatecla.aX_dispensers.a1_classes_a1_operations;

class UnboundedStack {

	private Node entrance;

	UnboundedStack() {
		this.entrance = null;
	}

	public void add(Interval interval) {
		assert interval != null;

		this.entrance = new Node(interval, this.entrance);
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

	public Interval remove() {
		assert !this.isEmpty();

		Interval interval = entrance.getInterval();
		entrance = entrance.getNext();
		return interval;
	}

	public void writeln(String title) {
		assert title != null;

		Console console = new Console();
		console.writeln(title);
		Node current = this.entrance;
		int position = 0;
		while (current != null) {
			console.writeln((position + 1) + ": " + current.getInterval());
			current = current.getNext();
		}
	}

}
