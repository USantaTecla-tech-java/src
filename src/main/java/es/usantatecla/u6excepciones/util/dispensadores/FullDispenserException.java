package es.usantatecla.u6excepciones.util.dispensadores;

import es.usantatecla.u6excepciones.util.GestorIO;
import es.usantatecla.u6excepciones.util.Interval;

class FullDispenserException extends Exception {

	private BoundedDisepenser dispenser;
	private Interval interval;

	public FullDispenserException(BoundedDisepenser dispenser,
			Interval interval) {
		super("El dispensador está lleno");
		this.dispenser = dispenser;
		this.interval = interval;
	}

	public void recover() {
		GestorIO.getGestorIO().escribirLinea("Reparando......");
		dispenser.duplicate();
		try {
			dispenser.add(interval);
		} catch (FullDispenserException ex) {}
	}
}
