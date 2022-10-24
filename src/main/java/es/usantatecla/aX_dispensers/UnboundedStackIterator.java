package es.usantatecla.aX_dispensers;

class UnboundedStackIterator extends UnboundedDispenserIterator {

	public UnboundedStackIterator(Node actual) {
		super(actual);
	}

	public Interval next() {
		Interval intervalo = current.getInterval();
		current = current.getNext();
		return intervalo;
	}
}
