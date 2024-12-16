package es.usantatecla.aXcodigus.u1Codigus.u1Software.u1Foundations;

import es.usantatecla.aXcodigus.RationaleLection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u1Foundations.u1Complexity.u1Complexity;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u1Foundations.u2Language.u2Language;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.u1Foundations.u3Model.u3Model;

public class u1Foundations extends RationaleLection {

  public u1Foundations(Unit fatherUnit){
    super(fatherUnit);
    this.add(new u1Complexity(this.how));
    this.add(new u2Language(this.how));
    this.add(new u3Model(this.how));
  }

}

