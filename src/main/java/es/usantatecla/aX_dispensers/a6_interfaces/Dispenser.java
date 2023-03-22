package es.usantatecla.aX_dispensers.a6_interfaces;

interface Dispenser {

  void add(Interval interval);
  Interval remove();
  boolean isEmpty();
  Interval[] getElements();

}
