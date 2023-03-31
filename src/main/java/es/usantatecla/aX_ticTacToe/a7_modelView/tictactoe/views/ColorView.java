package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Color;
import es.usantatecla.aX_ticTacToe.a7_modelView.utils.views.Console;

class ColorView {

    void write(Color color) {
		String string = color.name();
		if (color.isNull()) {
			string = " ";
		}
		Console.getInstance().write(string);
	}
}
