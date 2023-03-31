package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.models.Game;

abstract class WithGameView {

    protected Game game;

    WithGameView(Game game) {
        this.game = game;
    }
}
