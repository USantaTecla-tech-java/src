package es.usantatecla.aXcodigus.u1Codigus.u2Domains.u5Managers;

import es.usantatecla.aXcodigus.Domain;
import es.usantatecla.aXcodigus.Unit;

public class U5Managers extends Domain {

  public U5Managers(Unit fatherUnit){
    super(fatherUnit);
    this.add(new U1Services(this));
    this.add(new U2Codigus(this));
    this.add(new U3Tennis(this));
    this.add(new U4Movies(this));
    this.add(new U5Supermarket(this));
    this.add(new U6Vending(this));
    this.add(new U7Countries(this));
    this.add(new U8Combat(this));
  }

}