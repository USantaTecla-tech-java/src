package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.MachinePlayer;
import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.types.Coordinate;

class MachinePlayerView extends PlayerView {

    MachinePlayerView(MachinePlayer machinePlayer) {
        super(machinePlayer);
    }

    @Override
    protected Coordinate getCoordinate(Message message) {
        return ((MachinePlayer) this.player).getRandomCoordinate();
    }
    
}
