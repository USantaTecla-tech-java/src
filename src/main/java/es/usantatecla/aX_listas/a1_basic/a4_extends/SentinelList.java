package es.usantatecla.aX_listas.a1_basic.a4_extends;

class SentinelList extends List {

	public boolean includes(Interval interval) {
		this.insertLast(interval);
		Node sentinel = this.getLast();
		Node current = this.getFirst();
		while (!current.equals(interval)) {
			current = current.getNext();
		}
		this.removeLast();
		return current != sentinel;
	}

}
