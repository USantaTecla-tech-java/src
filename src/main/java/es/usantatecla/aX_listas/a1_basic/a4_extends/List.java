package es.usantatecla.aX_listas.a1_basic.a4_extends;

class List {

	private Node first;
	private Node last;

	public List() {
		this.first = null;
		this.last = null;
	}

	public Node getFirst() {
		return this.first;
	}

	public Node getLast() {
		return this.last;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public void insertFirst(Interval interval) {
		this.first = new Node(null, interval, this.first);
		if (this.last == null) {
			this.last = this.first;
		}
	}

	public void insertLast(Interval interval) {
		this.last = new Node(this.last, interval, null);
		if (this.first == null) {
			this.first = this.last;
		}
	}

	public Interval removeFirst() {
		Interval interval = this.first;
		this.first = this.first.getNext();
		if (this.first == null) {
			this.last = null;
		} else {
			this.first.setPrevious(null);
		}
		return interval;
	}

	public Interval removeLast() {
		Interval interval = this.last;
		this.last = this.last.getPrevious();
		if (this.last == null) {
			this.first = null;
		} else {
			this.last.setNext(null);
		}
		return interval;
	}

	public boolean includes(Interval interval) {
		if (this.isEmpty())
			return false;
		Node current = this.first;
		while (current.getNext() != null &&
				!current.equals(interval)) {
			current = current.getNext();
		}
		return current.equals(interval);
	}
	
	public void writeln() {
		if (this.isEmpty()){
			Console.getInstance().writeln("Lista vacía");
		}
		Node current = this.first;
		while (current!= null) {
			current.writeln();
			current = current.getNext();
		}
	}

}
