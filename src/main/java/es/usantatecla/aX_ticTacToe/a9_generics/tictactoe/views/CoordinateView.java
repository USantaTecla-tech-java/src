package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.types.Coordinate;
import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.types.Error;
import es.usantatecla.aX_ticTacToe.a9_generics.utils.models.ConcreteCoordinate;
import es.usantatecla.aX_ticTacToe.a9_generics.utils.models.SquareBoundedCoordinate;
import es.usantatecla.aX_ticTacToe.a9_generics.utils.views.SquareBoundedCoordinateView;

class CoordinateView extends SquareBoundedCoordinateView {

    @Override
    public SquareBoundedCoordinate createCoordinate(ConcreteCoordinate concreteCoordinate) {
        return new Coordinate(concreteCoordinate);
    }

    @Override
    public String getErrorMessage() {
        return ErrorView.MESSAGES[Error.WRONG_COORDINATES.ordinal()];
    }

}
