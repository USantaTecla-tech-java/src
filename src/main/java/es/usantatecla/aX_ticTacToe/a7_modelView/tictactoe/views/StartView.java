package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.models.Game;
import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.models.Turn;
import es.usantatecla.aX_ticTacToe.a7_modelView.utils.views.BoundedIntDialog;

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
