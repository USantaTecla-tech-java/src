package es.usantatecla.aXcodigus;

import java.util.ArrayList;
import java.util.List;

public class Domain extends Unit {

  public List<Lection> lections;
  
  public Domain(Unit fatherUnit, Unit... childUnits){
    super(fatherUnit, childUnits);
    this.lections = new ArrayList<Lection>();
  }

  public void addApplication(Lection lection){
    this.lections.add(lection);
  }
    
  public Domain getDomain(String domainCode) {
    return (Domain) this.get(domainCode);
  }

}
