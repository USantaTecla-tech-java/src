package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.Interval;

abstract class UnboundedDispenser implements Dispenser {

	protected Node node;

	protected UnboundedDispenser() {
		this.node = null;
	}

	public void add(Interval interval) {
		this.node = new Node(null, interval, this.node);
	}

	public boolean isEmpty() {
		return this.node == null;
	}
}
