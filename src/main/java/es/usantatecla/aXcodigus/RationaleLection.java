package es.usantatecla.aXcodigus;

import es.usantatecla.aXcodigus.u1Codigus.U1Codigus;

public class RationaleLection extends Lection {

  protected Unit how;

  public RationaleLection(Unit fatherUnit) {
    super(fatherUnit);
    assert fatherUnit instanceof Lection || fatherUnit == U1Codigus.instance();
    
    super.add(new u1Why(this));
    super.add(new u2What(this));
    super.add(new u3WhatFor(this));
    this.how = new u4How(this);
    super.add(this.how);
  }

  public void add(Unit grandchildUnit) {
    this.how.add(grandchildUnit);
  }

}
