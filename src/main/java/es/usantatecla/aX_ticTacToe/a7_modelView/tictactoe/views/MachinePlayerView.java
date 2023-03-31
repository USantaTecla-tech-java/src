package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.models.MachinePlayer;
import es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.types.Coordinate;

class MachinePlayerView extends PlayerView {

    MachinePlayerView(MachinePlayer machinePlayer) {
        super(machinePlayer);
    }

    @Override
    protected Coordinate getCoordinate(Message message) {
        return ((MachinePlayer) this.player).getRandomCoordinate();
    }
    
}
