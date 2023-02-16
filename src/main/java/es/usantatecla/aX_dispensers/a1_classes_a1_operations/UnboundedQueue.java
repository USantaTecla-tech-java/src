package es.usantatecla.aX_dispensers.a1_classes_a1_operations;

class UnboundedQueue {

	private Node entrance;
	private Node exit;

	UnboundedQueue() {
		this.entrance = null;
		this.exit = null;
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

	public void add(Interval interval) {
		boolean empty = this.isEmpty();
		this.entrance = new Node(null, interval, this.entrance);
		if (empty) {
			this.exit = this.entrance;
		}
	}

	public Interval remove() {
		Interval interval = exit.getInterval();
		if (this.exit.getPrevious() == null) {
			this.entrance = null;
			this.exit = null;
		} else {
			this.exit = exit.getPrevious();
			this.exit.setNext(null);
		}
		return interval;
	}

	public void writeln(String title) {
		Console console = new Console();
		console.writeln(title);
		Node node = this.exit;
		int position = 0;
		while (node != null) {
			console.writeln((position + 1) + ": " + node.getInterval());
			node = node.getPrevious();
		}
	}

}
