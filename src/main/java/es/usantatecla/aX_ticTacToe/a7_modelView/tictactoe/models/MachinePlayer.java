package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.models;

import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Color;
import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Coordinate;

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
