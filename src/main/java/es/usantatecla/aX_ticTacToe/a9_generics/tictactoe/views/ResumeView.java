package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.Game;
import es.usantatecla.aX_ticTacToe.a9_generics.utils.views.YesNoDialog;

class ResumeView extends WithGameView {

    ResumeView(Game game) {
		super(game);
	}

	boolean interact() {
		YesNoDialog isResumed = new YesNoDialog();
		isResumed.read(Message.RESUME.toString());
		if (isResumed.isAffirmative()){
			this.game.reset();
		}
		return isResumed.isAffirmative();
	}

}
