package es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u3ObjectBasedProgramming;

import es.usantatecla.aXcodigus.Lection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u3ObjectBasedProgramming.u1InstanceMembers.U1InstanceMembers;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u3ObjectBasedProgramming.u2StaticMembers.u2StaticMembers;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u3ObjectBasedProgramming.u3InnerClass.u3InnerClass;

public class u3ObjectBasedProgramming extends Lection {

  public u3ObjectBasedProgramming(Unit fatherUnit) {
    super(fatherUnit);
    this.add(new U1InstanceMembers(this));
    this.add(new u2StaticMembers(this));
    this.add(new u3InnerClass(this));
  }

}
