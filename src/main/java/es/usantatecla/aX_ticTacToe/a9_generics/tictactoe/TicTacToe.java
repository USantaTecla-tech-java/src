package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.Game;
import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.views.View;
import es.usantatecla.aX_ticTacToe.a9_generics.utils.framework.App;

class TicTacToe extends App<Game, View> {

    TicTacToe() {
        this.model = new Game();
        this.view = new View(this.model);
    }

    public static void main(String[] args) {
        new TicTacToe().play();
    }

}