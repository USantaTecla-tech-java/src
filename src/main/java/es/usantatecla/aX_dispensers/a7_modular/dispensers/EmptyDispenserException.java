package es.usantatecla.aX_dispensers.a7_modular.dispensers;

public class EmptyDispenserException extends DispenserException {

  public EmptyDispenserException(Dispenser dispenser) {
    super("Dispensador vacío", dispenser, null);
  }
  
}
