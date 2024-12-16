package es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages;

import es.usantatecla.aXcodigus.RationaleLection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u1Java;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u2JavaScript.U2JavaScript;

public class U8Languages extends RationaleLection {

  public U8Languages(Unit fatherUnit){
    super(fatherUnit);
    this.add(new u1Java(this.how));
    this.add(new U2JavaScript(this.how));
  }

}
