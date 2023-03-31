package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Coordinate;
import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Error;
import es.usantatecla.aX_ticTacToe.a7_modelView.utils.models.ConcreteCoordinate;
import es.usantatecla.aX_ticTacToe.a7_modelView.utils.models.SquareBoundedCoordinate;
import es.usantatecla.aX_ticTacToe.a7_modelView.utils.views.SquareBoundedCoordinateView;

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
