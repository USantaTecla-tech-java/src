package es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers;

public class DispenserException extends Exception {

  protected Object dispenser;
	protected Object element;

	public DispenserException(String message, Object dispenser,
			Object element) {
		super("El dispensador está lleno");
		this.dispenser = dispenser;
		this.element = element;
	}
	
}
