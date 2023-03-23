package es.usantatecla.aX_dispensers.a7_exceptions;

class EmptyDispenserException extends DispenserException {

  public EmptyDispenserException(Dispenser dispenser) {
    super("Dispensador vacío", dispenser, null);
  }
  
}
