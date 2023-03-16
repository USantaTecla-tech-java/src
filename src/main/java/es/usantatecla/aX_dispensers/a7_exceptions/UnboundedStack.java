package es.usantatecla.aX_dispensers.a7_exceptions;

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
