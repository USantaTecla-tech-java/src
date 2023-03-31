package es.usantatecla.aX_ticTacToe.a7_modelView.tictactoe.models;

public interface PlayerVisitor {

    void visit(UserPlayer userPlayer);
    void visit(MachinePlayer machinePlayer);

}
