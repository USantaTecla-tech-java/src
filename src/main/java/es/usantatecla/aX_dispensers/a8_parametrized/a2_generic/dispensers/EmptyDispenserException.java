package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers;

public class EmptyDispenserException extends DispenserException {

  public EmptyDispenserException(Object dispenser) {
    super("Dispensador vacío", dispenser, null);
  }
  
}
