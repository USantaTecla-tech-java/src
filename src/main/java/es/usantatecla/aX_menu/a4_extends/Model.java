package es.usantatecla.aX_menu.a4_extends;

import java.util.ArrayList;
import java.util.List;

class Model {

    private List<String> strings;

    public Model() {
        this.strings = new ArrayList<String>();
        for (String string : new String[] { "Ana", "Bea", "Cio" })
            this.strings.add(string);
    }

    public void add(String string) {
        this.strings.add(string);
    }

    public void remove(int index) {
        this.strings.remove(index);
    }

    public String get(int index) {
        return this.strings.get(index);
    }

    public int size() {
        return this.strings.size();
    }

}
