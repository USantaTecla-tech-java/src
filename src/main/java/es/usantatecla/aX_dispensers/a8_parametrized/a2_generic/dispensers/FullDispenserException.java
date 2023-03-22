package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Console;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers.BoundedDispenser;

public class FullDispenserException extends DispenserException {

	public FullDispenserException(Object dispenser,
			Object element) {
		super("El dispensador está lleno", dispenser, element);
	}

	public void recover() {
		Console.getInstance().writeln("Reparando......");
		((BoundedDispenser) this.dispenser).duplicate();
		try {
			((BoundedDispenser) this.dispenser).add(this.element);
		} catch (FullDispenserException ex) {}
	}
	
}
