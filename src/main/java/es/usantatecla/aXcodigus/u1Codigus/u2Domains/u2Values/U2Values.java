package es.usantatecla.aXcodigus.u1Codigus.u2Domains.u2Values;

import es.usantatecla.aXcodigus.Domain;
import es.usantatecla.aXcodigus.Unit;

public class U2Values extends Domain {

  public U2Values(Unit fatherUnit){
    super(fatherUnit);
    this.add(new U1Interval(this));
    this.add(new U2Fraction(this));
    this.add(new U3Date(this));
    this.add(new U4Time(this));
    this.add(new U5Figure(this));
    this.add(new U6RGB(this));
    this.add(new U7Coordinate(this));
    this.add(new U8Rect(this));
  }
}
