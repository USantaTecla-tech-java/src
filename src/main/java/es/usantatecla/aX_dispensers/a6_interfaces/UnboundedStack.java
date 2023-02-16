package es.usantatecla.aX_dispensers.a6_interfaces;

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
