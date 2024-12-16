package es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality;

import es.usantatecla.aXcodigus.RationaleLection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.U1Programming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u2Design.U2Design;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u3Test.U3Test;

public class U2Quality extends RationaleLection {

  public U2Quality(Unit fatherUnit){
    super(fatherUnit);
    this.add(new U1Programming(this.how));
    this.add(new U2Design(this.how));
    this.add(new U3Test(this.how));
  }

}

