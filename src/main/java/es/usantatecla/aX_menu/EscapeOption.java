package es.usantatecla.aX_menu;

public class EscapeOption extends Option{

    private boolean executed;

    public EscapeOption(String title){
        super(title);
        this.executed = false;
    }

    @Override
    public void exec() {
        this.executed = true;
    }  

    protected boolean isExecuted(){
        return this.executed;
    }
    
}
