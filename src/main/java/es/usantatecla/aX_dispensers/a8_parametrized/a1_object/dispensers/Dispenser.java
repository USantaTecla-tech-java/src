package es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers.FullDispenserException;

public interface Dispenser {

  void add(Object element) throws FullDispenserException;
  Object remove() throws EmptyDispenserException;
  boolean isEmpty();
  Object[] getElements();

}
