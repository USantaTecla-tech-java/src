package es.usantatecla.aX_menu.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    
    private List<String> strings;

    public Model(){
        this.strings = new ArrayList<String>();
        this.strings.add("Ana");
        this.strings.add("Bea");
        this.strings.add("Cio");
    }

    public void add(String string){
        this.strings.add(string);
    }

    public void remove(int index){
        this.strings.remove(index);
    }

    public String get(int index){
        return this.strings.get(index);
    }

    public int size() {
        return this.strings.size();
    }

}
