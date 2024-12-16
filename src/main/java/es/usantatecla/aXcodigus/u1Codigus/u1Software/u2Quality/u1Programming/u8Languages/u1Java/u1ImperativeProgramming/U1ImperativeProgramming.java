package es.usantatecla.aXcodigus.u1Codigus.u1Software.u2Quality.u1Programming.u8Languages.u1Java.u1ImperativeProgramming;

import es.usantatecla.aXcodigus.Lection;
import es.usantatecla.aXcodigus.Unit;

public class U1ImperativeProgramming extends Lection {

  public U1ImperativeProgramming(Unit fatherUnit) {
    super(fatherUnit);
  }

  @Override
  protected void addOwnerApplications() {
    this.addApplication("Foundations", "Texts");
    this.addApplication("Foundations", "Numbers");
    this.addApplication("Foundations", "Logic");
    this.addApplication("Foundations", "Series"); 
    this.addApplication("Foundations", "Orders"); 
    this.addApplication("Foundations", "Interpreter");
    this.addApplication("Values", "Interval");
    this.addApplication("Values", "Fraction");
    this.addApplication("Values", "Date");
    this.addApplication("Values", "Time");
    this.addApplication("Values", "Figure");
    this.addApplication("Values", "RGB");
    this.addApplication("Values", "Coordinate");
    this.addApplication("Values", "Rect");
    this.addApplication("Managers", "Services");
    this.addApplication("Managers", "Learning");
    this.addApplication("Managers", "Tennis");
    this.addApplication("Managers", "Movies");
    this.addApplication("Managers", "Supermarket");
    this.addApplication("Managers", "Vending");
    this.addApplication("Managers", "Countries");
    this.addApplication("Managers", "Combat");
    this.addApplication("Games", "TicTacToe");
    this.addApplication("Games", "Connect4");
    this.addApplication("Games", "Mastermind");
    this.addApplication("Games", "Klondike");
    this.addApplication("Games", "Poker");
    this.addApplication("Games", "Draughts");
    this.addApplication("Games", "Chess");
  }
  
}
