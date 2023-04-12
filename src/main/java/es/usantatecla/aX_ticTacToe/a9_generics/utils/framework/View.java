package es.usantatecla.aX_ticTacToe.a9_generics.utils.framework;

public abstract class View<G extends Game> {

  protected G game;

  public View(G game){
    this.game = game;
  };

  public abstract void start();
  public abstract void play();
  public abstract boolean resume();

}
