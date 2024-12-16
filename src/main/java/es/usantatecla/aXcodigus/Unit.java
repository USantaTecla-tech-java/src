package es.usantatecla.aXcodigus;

import java.util.ArrayList;

public class Unit {

  private static int idSeed = 1;
  private int id;
  private Unit fatherUnit;
  protected final ArrayList<Unit> childUnits;

  public Unit(Unit fatherUnit, Unit... childUnits) {
    this.id = Unit.idSeed++;
    this.fatherUnit = fatherUnit;
    this.childUnits = new ArrayList<Unit>();
    for (Unit childUnit : childUnits) {
      this.childUnits.add(childUnit);
    }
  }

  public String getName() {
    return this.getClass().getSimpleName().substring(2);
  }

  public String getPathName() {
    if (this.fatherUnit == null) {
      return this.getName();
    }
    return this.fatherUnit.getPathName() + "." + this.getName();
  }

  public Unit getUnitByNames(String... names) {
    assert names.length != 0;
    int[] indexes = new int[names.length];
    boolean ok = true;
    for (int i = 0; i < names.length; i++) {
      indexes[i] = this.getPathName().indexOf(names[i]);
      ok = ok && indexes[i] != -1;
      if (i>0){
        ok = ok && indexes[i-1] < indexes[i];
      }
    }
    if (ok){
      return this;
    }
    for(Unit childUnit : this.childUnits){
      Unit unit = childUnit.getUnitByNames(names);
      if (unit != null){
        return unit;
      }
    }
    return null;
  }

  public String getCode() {
    return this.fatherUnit.getCode() + this.getClass().getSimpleName().substring(1, 2);
  }

  public Unit get(String code) {
    if (this.getCode().equals(code)) {
      return this;
    }
    for (Unit unit : this.childUnits) {
      if (unit.get(code) != null) {
        return unit.get(code);
      }
    }
    return null;
  }

  public void add(Unit childUnit) {
    this.childUnits.add(childUnit);
  }

  @Override
  public String toString() {
    String string = this.getCode() + " - " + this.getName()
        + "(" + this.id + ") " + this.getPathName() + "\n";
    for (Unit childUnit : this.childUnits) {
      string += childUnit.toString();
    }
    return string;
  }

  public static int count() {
    return Unit.idSeed;
  }

}
