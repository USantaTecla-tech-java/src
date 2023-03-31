package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.Game;
import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.MachinePlayer;
import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.PlayerVisitor;
import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.UserPlayer;

class PlayView extends WithGameView implements PlayerVisitor {

    PlayView(Game game) {
        super(game);
    }

    void interact() {
        do {
            this.game.getActivePlayer().accept(this);
            this.game.next();
            new BoardView().write(this.game);
        } while (!this.game.isTicTacToe());
        Message.PLAYER_WIN.writeln(this.game.getActiveColor().name());
    }

    @Override
    public void visit(UserPlayer userPlayer) {
        new UserPlayerView(userPlayer).interact();
    }

    @Override
    public void visit(MachinePlayer machinePlayer) {
        new MachinePlayerView(machinePlayer).interact();
    }
    
}