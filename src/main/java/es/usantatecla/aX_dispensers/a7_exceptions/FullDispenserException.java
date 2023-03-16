package es.usantatecla.aX_dispensers.a7_exceptions;

class FullDispenserException extends DispenserException {

	public FullDispenserException(Dispenser dispenser,
			Interval interval) {
		super("El dispensador está lleno", dispenser, interval);
	}

	public void recover() {
		Console.getInstance().writeln("Reparando......");
		((BoundedDispenser) this.dispenser).duplicate();
		try {
			this.dispenser.add(interval);
		} catch (FullDispenserException ex) {}
	}
}
