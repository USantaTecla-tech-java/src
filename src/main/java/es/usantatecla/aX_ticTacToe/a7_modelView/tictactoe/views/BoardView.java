package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.models.Game;
import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Coordinate;
import es.usantatecla.aX_ticTacToe.a7_modelView.utils.views.Console;

class BoardView {

    void write(Game game) {
        Message.HORIZONTAL_LINE.writeln();
        for (int i = 0; i < Coordinate.DIMENSION; i++) {
            Message.VERTICAL_LINE.write();
            for (int j = 0; j < Coordinate.DIMENSION; j++) {
                new ColorView().write(game.getColor(new Coordinate(i, j)));
                Message.VERTICAL_LINE.write();
            }
            Console.getInstance().writeln();
        }
        Message.HORIZONTAL_LINE.writeln();
    }

}
