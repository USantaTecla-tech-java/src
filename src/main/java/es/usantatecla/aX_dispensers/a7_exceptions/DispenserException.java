package es.usantatecla.aX_dispensers.a7_exceptions;

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
