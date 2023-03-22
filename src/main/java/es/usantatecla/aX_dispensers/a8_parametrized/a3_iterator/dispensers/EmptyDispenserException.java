package es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers;

public class EmptyDispenserException extends DispenserException {

  public EmptyDispenserException(Object dispenser) {
    super("Dispensador vacío", dispenser, null);
  }
  
}
