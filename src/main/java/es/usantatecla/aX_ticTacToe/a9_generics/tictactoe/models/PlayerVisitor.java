package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models;

public interface PlayerVisitor {

    void visit(UserPlayer userPlayer);
    void visit(MachinePlayer machinePlayer);

}
