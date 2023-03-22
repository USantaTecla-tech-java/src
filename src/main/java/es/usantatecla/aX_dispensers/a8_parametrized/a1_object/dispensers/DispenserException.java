package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers;

public class DispenserException extends Exception {

  protected Dispenser dispenser;
	protected Object element;

	public DispenserException(String message, Dispenser dispenser,
			Object element) {
		super("El dispensador está lleno");
		this.dispenser = dispenser;
		this.element = element;
	}
	
}
