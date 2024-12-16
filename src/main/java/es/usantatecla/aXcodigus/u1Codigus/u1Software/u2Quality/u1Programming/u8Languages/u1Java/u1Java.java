package es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java;

import es.usantatecla.aXcodigus.RationaleLection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u10ConcurrentProgramming.u10ConcurrentProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u1ImperativeProgramming.U1ImperativeProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u2StructuredProgramming.U2StructuredProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u3ObjectBasedProgramming.u3ObjectBasedProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u4ObjectOrientedProgramming.u4ObjectOrientedProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u5ModularProgramming.u5ModularProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u6ExceptionsProgramming.u6ExceptionsProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u7ParametrizedProgramming.u7ParametrizedProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u8ProcessOrientedProgramming.u8ProcessOrientedProgramming;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u9FunctionalProgramming.u9FunctionalProgramming;

public class u1Java extends RationaleLection {

  public u1Java(Unit fatherUnit){
    super(fatherUnit);
    this.add(new U1ImperativeProgramming(this.how));
    this.add(new U2StructuredProgramming(this.how));
    this.add(new u3ObjectBasedProgramming(this.how));
    this.add(new u4ObjectOrientedProgramming(this.how));
    this.add(new u5ModularProgramming(this.how));
    this.add(new u6ExceptionsProgramming(this.how));
    this.add(new u7ParametrizedProgramming(this.how));
    this.add(new u8ProcessOrientedProgramming(this.how));
    this.add(new u9FunctionalProgramming(this.how));
    this.add(new u10ConcurrentProgramming(this.how));
  }

}