package es.usantatecla.aX_ticTacToe.a7_modelView.utils.models;

public interface Coordinate {
  
  static Coordinate NULL = NullCoordinate.getInstance();
  boolean isNull();
  Direction getDirection(Coordinate coordinate);
  boolean inHorizontal(Coordinate coordinate);
  boolean inVertical(Coordinate coordinate);
  boolean inMainDiagonal();

}
