package es.usantatecla.aXcodigus.u1Codigus.u1Software.u3Process;

import es.usantatecla.aXcodigus.RationaleLection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u3Process.u1RUP.U1RUP;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u3Process.u2Agile.U2Agile;

public class U3Process extends RationaleLection {

  public U3Process(Unit fatherUnit){
    super(fatherUnit);
    this.add(new U1RUP(this.how));
    this.add(new U2Agile(this.how));
  }

}

