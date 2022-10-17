package es.usantatecla.aX_menu;

import java.util.ArrayList;
import java.util.List;

public class Model {
    
    private List<String> strings;

    public Model(){
        this.strings = new ArrayList<String>();
    }

    public void add(String string){
        this.strings.add(string);
    }

    public void remove(String string){
        this.strings.remove(string);
    }

}
