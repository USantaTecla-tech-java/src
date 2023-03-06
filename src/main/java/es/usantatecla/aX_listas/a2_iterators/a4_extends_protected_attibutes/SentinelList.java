package es.usantatecla.aX_listas.a2_iterators.a4_extends_protected_attibutes;

class SentinelList extends List {

	public boolean includes(Interval interval) {
		this.insertLast(interval);
		Node sentinel = this.last;
		Node current = this.first; 
		while (!current.getInterval().equals(interval)) {
			current = current.getNext();
		}
		this.removeLast();
		return current != sentinel;
	}

}
