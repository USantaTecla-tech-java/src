package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.DispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Console;

public class FullDispenserException extends DispenserException {

	public FullDispenserException(Dispenser dispenser,
	Object element) {
		super("El dispensador está lleno", dispenser, element);
	}

	public void recover() {
		Console.getInstance().writeln("Reparando......");
		((BoundedDisepenser) this.dispenser).duplicate();
		try {
			this.dispenser.add(element);
		} catch (FullDispenserException ex) {}
	}
}
