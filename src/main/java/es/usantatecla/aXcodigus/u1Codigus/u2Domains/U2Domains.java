package es.usantatecla.aXcodigus.u1Codigus.u2Domains;

import es.usantatecla.aXcodigus.Domain;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u2Domains.u1Foundations.U1Foundations;
import es.usantatecla.aXcodigus.u1Codigus.u2Domains.u2Values.U2Values;
import es.usantatecla.aXcodigus.u1Codigus.u2Domains.u3Views.U3Views;
import es.usantatecla.aXcodigus.u1Codigus.u2Domains.u4Structures.U4Structures;
import es.usantatecla.aXcodigus.u1Codigus.u2Domains.u5Managers.U5Managers;
import es.usantatecla.aXcodigus.u1Codigus.u2Domains.u6Games.U6Games;

public class U2Domains extends Domain {
  
  public U2Domains(Unit fatherUnit){
    super(fatherUnit);
		this.add(new U1Foundations(this));
		this.add(new U2Values(this));
		this.add(new U3Views(this));
		this.add(new U4Structures(this));
		this.add(new U5Managers(this));
		this.add(new U6Games(this));
  }

}
