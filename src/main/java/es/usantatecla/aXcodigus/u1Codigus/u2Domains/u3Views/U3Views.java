package es.usantatecla.aXcodigus.u1Codigus.u2Domains.u3Views;

import es.usantatecla.aXcodigus.Domain;
import es.usantatecla.aXcodigus.Unit;

public class U3Views extends Domain {

  public U3Views(Unit fatherUnit){
    super(fatherUnit);
    this.add(new U1Console(this));
    this.add(new U2Field(this));
    this.add(new U3Form(this));
    this.add(new U4Menu(this));
    this.add(new U5Report(this));
    this.add(new U6Commands(this));
    // this.add(new u7Dispatcher(this));
  }

}