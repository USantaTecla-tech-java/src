package es.usantatecla.aX_listas;

class Set extends List {

	public void insertFirst(Interval interval) {
		if (!this.includes(interval)) {
			super.insertFirst(interval);
		}
	}

	public void insertLast(Interval interval) {
		if (!this.includes(interval)) {
			super.insertLast(interval);
		}
	}

	public Set union(Set set) {
		Set union = new Set();
		Iterator iterator = this.getIterator();
		while (iterator.hasNext()) {
			union.insertFirst(iterator.next());
		}
		iterator = set.getIterator();
		while (iterator.hasNext()) {
			union.insertFirst(iterator.next());
		}
		return union;
	}

	public Set intersection(Set set) {
		Set intersection = new Set();
		Iterator iterator = this.getIterator();
		while (iterator.hasNext()) {
			Interval interval = iterator.next();
			if (set.includes(interval)) {
				intersection.insertFirst(interval);
			}
		}
		return intersection;
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		Set set = new Set();
		gestorIO.writeln("-------");
		Iterator iterator = set.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.writeln(position + ": " + iterator.next());
			position++;
		}
		gestorIO.writeln("Esta: " + set.includes(new Interval(-7, 7)));

		for (int i = 0; i < 10; i++) {
			set.insertLast(new Interval(-7, 7));
		}

		gestorIO.writeln("-------");
		iterator = set.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.writeln(position + ": " + iterator.next());
			position++;
		}
		gestorIO.writeln("Esta: " + set.includes(new Interval(-7, 7)));

		set.removeFirst();
		gestorIO.writeln("-------");
		iterator = set.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.writeln(position + ": " + iterator.next());
			position++;
		}
		gestorIO.writeln("Esta: " + set.includes(new Interval(-7, 7)));
	}
}
