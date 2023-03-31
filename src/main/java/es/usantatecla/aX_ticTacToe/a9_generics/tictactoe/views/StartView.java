package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.Game;
import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.Turn;
import es.usantatecla.aX_ticTacToe.a9_generics.utils.views.BoundedIntDialog;

class StartView extends WithGameView {

	StartView(Game game) {
		super(game);
	}

	void interact() {
		Message.TITLE.writeln();
		BoundedIntDialog dialog = new BoundedIntDialog(0, Turn.NUMBER_PLAYERS);
		this.game.setUsers(dialog.read(Message.NUMBER_PLAYERS.toString()));
		new BoardView().write(this.game);
	}

}
