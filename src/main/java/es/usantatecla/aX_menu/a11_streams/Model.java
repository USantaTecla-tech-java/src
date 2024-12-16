package es.usantatecla.aX_menu.a11_streams;

import java.util.ArrayList;
import java.util.List;

class Model {

    private List<String> strings;

    public Model() {
        this.strings = new ArrayList<String>();        
    }

    public void add(String string) {
        this.strings.add(string);
    }

    public void remove(int index) {
        assert 0 <= index && index < this.strings.size();

        this.strings.remove(index);
    }

    public String get(int index) {
        assert 0 <= index && index < this.strings.size();

        return this.strings.get(index);
    }

    public int size() {
        return this.strings.size();
    }

    public boolean find(String string){
        for(int i=0; i<this.strings.size(); i++){
            if (this.strings.get(i).equals(string)){
                return true;
            }
        }
        return false;
    }

}
