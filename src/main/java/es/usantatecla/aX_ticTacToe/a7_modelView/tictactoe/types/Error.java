package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types;

public enum Error {

	NOT_EMPTY,
	NOT_OWNER,
	SAME_COORDINATES,
	WRONG_COORDINATES,
	NULL;

	public boolean isNull() {
		return this == Error.NULL;
	}

}
