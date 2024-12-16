package es.usantatecla.aXcodigus;

import java.util.ArrayList;
import java.util.List;

import es.usantatecla.aXcodigus.u1Codigus.U1Codigus;

public abstract class Lection extends Unit {

  private List<Domain> applications;

  public Lection(Unit fatherUnit, Lection... childLections) {
    super(fatherUnit, childLections);
    this.applications = new ArrayList<Domain>();
  }

  private List<Lection> getLections(){
    List<Lection> lections = new ArrayList<Lection>();
    for(Unit unit : this.childUnits){
      lections.add((Lection) unit);
    }
    return lections;
  }

  public void addApplications() {
    this.addOwnerApplications();
    for(Lection lection : this.getLections()){
      lection.addApplications();
    }
  }

  protected void addOwnerApplications(){
  }

  protected void addApplication(String... names) {
    Domain domain = (Domain) U1Codigus.instance().getUnitByNames(names);
    this.applications.add(domain);
    domain.addApplication(this);
  }

}
