package es.usantatecla.aX_dispensers.a6_interfaces;

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
