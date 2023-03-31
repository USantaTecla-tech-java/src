package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.models;

import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Color;

public class UserPlayer extends Player {

    UserPlayer(Color color, Board board) {
        super(color, board);
    }

    @Override
    public void accept(PlayerVisitor playerVisitor) {
        playerVisitor.visit(this);
    }

}
