package es.usantatecla.aX_menu;

public abstract class Option {
    
    private String title;

    public Option(String title){
        this.title = title;
    }

    abstract void exec();

    String getTitle() {
        return this.title;
    }
    
}
