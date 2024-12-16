package es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u2JavaScript;

import es.usantatecla.aXcodigus.RationaleLection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u2JavaScript.u1ImperativeProgramming.U1ImperativeProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u2JavaScript.u2StructuredProgramming.U2StructuredProgramming;

public class U2JavaScript extends RationaleLection {

  public U2JavaScript(Unit fatherUnit){
    super(fatherUnit);
    this.add(new U1ImperativeProgramming(this.how));
    this.add(new U2StructuredProgramming(this.how));
  }

}