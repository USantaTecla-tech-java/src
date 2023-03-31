package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.Game;

abstract class WithGameView  {

    protected Game game;

    WithGameView(Game game) {
        this.game = game;
    }
}
