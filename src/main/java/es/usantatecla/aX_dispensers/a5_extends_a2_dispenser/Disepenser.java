package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

abstract class Dispenser {

	public abstract void add(Interval interval);
  public abstract Interval remove();
  public abstract boolean isEmpty();
  public abstract Iterator getIterator();
  
}
