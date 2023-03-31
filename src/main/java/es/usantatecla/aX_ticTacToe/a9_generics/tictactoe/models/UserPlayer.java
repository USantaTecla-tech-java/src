package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.types.Color;

public class UserPlayer extends Player {

    UserPlayer(Color color, Board board) {
        super(color, board);
    }

    @Override
    public void accept(PlayerVisitor playerVisitor) {
        playerVisitor.visit(this);
    }

}
