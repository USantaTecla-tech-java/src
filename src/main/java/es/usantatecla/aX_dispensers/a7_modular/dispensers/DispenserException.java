package es.usantatecla.aX_dispensers.a7_modular.dispensers;

import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;

public class DispenserException extends Exception {

  protected Dispenser dispenser;
	protected Interval interval;

	public DispenserException(String message, Dispenser dispenser,
			Interval interval) {
		super("El dispensador está lleno");
		this.dispenser = dispenser;
		this.interval = interval;
	}
	
}
