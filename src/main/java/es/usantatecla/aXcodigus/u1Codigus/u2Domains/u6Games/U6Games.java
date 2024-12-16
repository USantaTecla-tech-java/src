package es.usantatecla.aXcodigus.u1Codigus.u2Domains.u6Games;

import es.usantatecla.aXcodigus.Domain;
import es.usantatecla.aXcodigus.Unit;

public class U6Games extends Domain {

  public U6Games(Unit fatherUnit){
    super(fatherUnit);
    this.add(new U1TicTacToe(this));
    this.add(new U2Connect4(this));
    this.add(new U3Mastermind(this));
    this.add(new U4Klondike(this));
    this.add(new U5Poker(this));
    this.add(new U6Draughts(this));
    this.add(new U7Chess(this));
  }

}