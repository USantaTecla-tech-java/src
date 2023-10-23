package es.usantatecla.aX_listas.a2_iterators;

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

}
