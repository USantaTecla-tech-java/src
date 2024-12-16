package es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming;

import es.usantatecla.aXcodigus.RationaleLection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u1ImperativeProgramming.u1ImperativeProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u2StructuredProgramming.u2StructuredProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.U8Languages;

public class U1Programming extends RationaleLection {

  public U1Programming(Unit fatherUnit){
    super(fatherUnit);
    this.add(new u1ImperativeProgramming(this.how));
    this.add(new u2StructuredProgramming(this.how));
    this.add(new U8Languages(this.how));
  }

}

