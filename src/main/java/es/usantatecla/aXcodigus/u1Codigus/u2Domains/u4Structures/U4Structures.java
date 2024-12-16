package es.usantatecla.aXcodigus.u1Codigus.u2Domains.u4Structures;

import es.usantatecla.aXcodigus.Domain;
import es.usantatecla.aXcodigus.Unit;

public class U4Structures extends Domain {

  public U4Structures(Unit fatherUnit){
    super(fatherUnit);
    this.add(new U1List(this));
    this.add(new U2Dispenser(this));
    this.add(new U3Set(this));  
    this.add(new U4Map(this));
    this.add(new U5Tree(this));
    this.add(new U6Graph(this));  
  }

}