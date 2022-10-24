package es.usantatecla.aX_listas;

class SentinelList extends List {

	public boolean includes(Interval interval) {
		this.insertLast(interval);
		Node sentinel = this.getLast();
		Node current = this.getFirst();
		while (!current.getInterval().equals(interval)) {
			current = current.getNext();
		}
		this.removeLast();
		return current != sentinel;
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		SentinelList sentinelList = new SentinelList();
		gestorIO.writeln("-------");
		Iterator iterator = sentinelList.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.writeln(position + ": " + iterator.next());
			position++;
		}
		gestorIO.writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sentinelList.insertFirst(new Interval(-i, i));
			} else {
				sentinelList.insertLast(new Interval(-i, i));
			}
		}
		gestorIO.writeln("-------");
		iterator = sentinelList.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.writeln(position + ": " + iterator.next());
			position++;
		}
		gestorIO.writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));

		for (int i = 0; i < 3; i++) {
			sentinelList.removeFirst();
			sentinelList.removeLast();
		}
		gestorIO.writeln("-------");
		iterator = sentinelList.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.writeln(position + ": " + iterator.next());
			position++;
		}
		gestorIO.writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));

		for (int i = 0; i < 2; i++) {
			sentinelList.removeFirst();
			sentinelList.removeLast();
		}
		gestorIO.writeln("-------");
		iterator = sentinelList.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.writeln(position + ": " + iterator.next());
			position++;
		}
		gestorIO.writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));
	}
}
