package es.usantatecla.aX_dispensers.a1_classes_a1_operations;

class UnboundedStack {

	private Node entrance;

	UnboundedStack() {
		this.entrance = null;
	}

	public void add(Interval interval) {
		this.entrance = new Node(null, interval, this.entrance);
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

	public Interval remove() {
		Interval interval = entrance.getInterval();
		entrance = entrance.getNext();
		return interval;
	}

	public void writeln(String title) {
		Console console = new Console();
		console.writeln(title);
		Node node = this.entrance;
		int position = 0;
		while (node != null) {
			console.writeln((position + 1) + ": " + node.getInterval());
			node = node.getNext();
		}
	}

}
