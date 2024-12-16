package es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u3ObjectBasedProgramming.u1InstanceMembers;

import es.usantatecla.aXcodigus.Lection;
import es.usantatecla.aXcodigus.Unit;

public class U1InstanceMembers extends Lection {

  public U1InstanceMembers(Unit fatherUnit) {
    super(fatherUnit);
    this.add(new U1PublicClassView(this));
    this.add(new U2PublicObjectView(this));
    this.add(new U3PrivateClassView(this));
    this.add(new u4PrivateObjectView(this));
  }
  
}
