package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.models;

import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Color;
import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Coordinate;

public class Game {

    private Board board;
    private Turn turn;

    public Game() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    public void reset() {
        this.board.reset();
        this.turn.reset();
    }

    public void next() {
        this.turn.next();
    }

    public void setUsers(int numberUsers) {
        this.turn.setUsers(numberUsers);
    }

    public Color getActiveColor() {
        return this.turn.getActiveColor();
    }

    public boolean isTicTacToe() {
        return this.board.isTicTacToe(this.turn.getActiveColor());
    }

    public Color getColor(Coordinate coordinate) {
        return this.board.getColor(coordinate);
    }

    public Player getActivePlayer() {
        return this.turn.getActivePlayer();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (board == null) {
            if (other.board != null)
                return false;
        } else if (!board.equals(other.board))
            return false;
        if (turn == null) {
            if (other.turn != null)
                return false;
        } else if (!turn.equals(other.turn))
            return false;
        return true;
    }

}