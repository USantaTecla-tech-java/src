package es.usantatecla.aXcodigus.u1Codigus.u2Domains.u1Foundations;

import es.usantatecla.aXcodigus.Domain;
import es.usantatecla.aXcodigus.Unit;

public class U1Foundations extends Domain {

  public U1Foundations(Unit fatherUnit) {
    super(fatherUnit);
    this.add(new U1Texts(this));
    this.add(new U2Numbers(this));
    this.add(new U3Logic(this));
    this.add(new U4Series(this));
    this.add(new U5Orders(this));
    this.add(new U6Interpreter(this));
  }
}
