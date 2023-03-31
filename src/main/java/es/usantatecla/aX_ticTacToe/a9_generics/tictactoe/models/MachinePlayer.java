package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.types.Color;
import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.types.Coordinate;

public class MachinePlayer extends Player {

	MachinePlayer(Color color, Board board) {
		super(color, board);
	}

	public Coordinate getRandomCoordinate(){
		Coordinate coordinate = new Coordinate();
		coordinate.random();
		return coordinate;
	}

	@Override
	public void accept(PlayerVisitor playerVisitor) {
		playerVisitor.visit(this);
	}

}
