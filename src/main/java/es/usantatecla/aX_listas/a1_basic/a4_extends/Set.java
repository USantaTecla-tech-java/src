package es.usantatecla.aX_listas.a1_basic.a4_extends;

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
		
		Node currentThis = this.getFirst();
		while (currentThis != null) {
			union.insertFirst(currentThis);
		}
		Node currentSet = set.getFirst();
		while (currentSet != null) {
			union.insertFirst(currentSet);
		}
		return union;
	}

	public Set intersection(Set set) {
		Set intersection = new Set();
		Node currentThis = this.getFirst();
		while (currentThis != null && set.includes(currentThis)) {
			intersection.insertFirst(currentThis);
		}
		return intersection;
	}

}
