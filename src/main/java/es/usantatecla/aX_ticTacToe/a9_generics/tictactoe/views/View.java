package es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.views;

import es.usantatecla.aX_ticTacToe.a9_generics.tictactoe.models.Game;

public class View extends es.usantatecla.aX_ticTacToe.a9_generics.utils.framework.View<Game> {

    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View(Game game) {
        super(game);
        this.startView = new StartView(game);
        this.playView = new PlayView(game);
        this.resumeView = new ResumeView(game);
    }

    public void start() {
        this.startView.interact();
    }

    public void play() {
        this.playView.interact();
    }

    public boolean resume() {
        return this.resumeView.interact();
    }
}
