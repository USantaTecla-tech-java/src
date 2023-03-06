package es.usantatecla.aX_listas.a4_extends_protected_attibutes;

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

}
