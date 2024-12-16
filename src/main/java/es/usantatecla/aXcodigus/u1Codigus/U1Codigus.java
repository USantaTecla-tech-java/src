package es.usantatecla.aXcodigus.u1Codigus;

import es.usantatecla.aXcodigus.Console;
import es.usantatecla.aXcodigus.Lection;
import es.usantatecla.aXcodigus.RationaleLection;
import es.usantatecla.aXcodigus.Unit;
import es.usantatecla.aXcodigus.u1Codigus.u1Software.U1Software;
import es.usantatecla.aXcodigus.u1Codigus.u2Domains.U2Domains;

public class U1Codigus extends RationaleLection {

  private static U1Codigus instance = new U1Codigus();

  public static U1Codigus instance() {
    return U1Codigus.instance;
  }
  
  public U1Codigus() {
    super(null);
    this.add(new U1Software(this.how));
    this.add(new U2Domains(this.how));
  }

  public String getCode() {
    return "1";
  }

  public static void main(String[] args) {
    Console console = new Console();
    Lection Software = (Lection) U1Codigus.instance().getUnitByNames("Software");
    Software.addApplications();
    
    console.writeln(U1Codigus.instance().toString());
    console.writeln("--- count: "+ Unit.count() + "\n");
  }

}
