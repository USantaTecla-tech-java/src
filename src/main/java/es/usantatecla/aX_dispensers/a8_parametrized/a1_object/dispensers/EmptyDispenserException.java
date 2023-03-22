package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers;

public class EmptyDispenserException extends DispenserException {

  public EmptyDispenserException(Dispenser dispenser) {
    super("Dispensador vacío", dispenser, null);
  }
  
}
