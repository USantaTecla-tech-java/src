package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

class UnboundedStack extends UnboundedDispenser {

	public Interval remove() {
		Interval interval = entrance.getInterval();
		entrance = entrance.getNext();
		return interval;
	}

	public Iterator getIterator() {
		return new UnboundedStackIterator(entrance);
	}

}
