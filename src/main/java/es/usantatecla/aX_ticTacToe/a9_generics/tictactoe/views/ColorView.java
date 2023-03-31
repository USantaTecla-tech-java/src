package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.types.Color;
import es.usantatecla.aX_ticTacToe.a9_generics.utils.views.Console;

class ColorView {

    void write(Color color) {
		String string = color.name();
		if (color.isNull()) {
			string = " ";
		}
		Console.getInstance().write(string);
	}
}
