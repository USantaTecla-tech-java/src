package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

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
