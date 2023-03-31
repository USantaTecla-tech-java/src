package es.usantatecla.aX_ticTacToe.a9_generics.utils.views;

import es.usantatecla.aX_ticTacToe.a9_generics.utils.models.ConcreteCoordinate;

public class ConcreteCoordinateView {

    public ConcreteCoordinate read(String title) {
        Console console = Console.getInstance();
        console.writeln(title);
        int row = console.readInt(ConcreteCoordinate.ROW) - 1;
        int column = console.readInt(ConcreteCoordinate.COLUMN) - 1;
        return new ConcreteCoordinate(row, column);
    }

}
