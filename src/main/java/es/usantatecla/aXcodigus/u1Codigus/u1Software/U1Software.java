package es.usantatecla.aXcodigus.u1Codigus.u1Software;

import es.usantatecla.aXcodigus.RationaleLection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u1Foundations.u1Foundations;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.U2Quality;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u3Process.U3Process;

public class U1Software extends RationaleLection {

  public U1Software(Unit fatherUnit){
    super(fatherUnit);
    this.add(new u1Foundations(this.how));
    this.add(new U2Quality(this.how));
    this.add(new U3Process(this.how));
  }

}
