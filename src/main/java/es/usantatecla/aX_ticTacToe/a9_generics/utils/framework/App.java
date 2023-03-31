package es.usantatecla.aX_ticTacToe.a9_generics.utils.framework;

public class App<M extends Game, V extends View<M>> {

    protected M model;
    protected V view;

    protected void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }

}