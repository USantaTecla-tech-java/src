package es.usantatecla.a0_itinerario.a2_estructurada.a4_tablas.a3_acceso;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln(new int[]{1,2,3,4,5}[0]); // 1
        int[] array = new int[]{1,2,3,4,5};
        console.writeln(array[0]); // 1
        console.writeln(array[4]); // 5
        // console.writeln(array[5]); // ERROR!!!
        
        console.writeln(new String[][]{{"a", "b", "c" },{"x", "y", "z" } }[0][0]); // a
        console.writeln(new String[][]{{"a", "b", "c" },{"x", "y", "z" } }[1]); // x - y - z
        
        for(int i = 0; i < new int[]{1,2,3}.length; i++){
            console.write("${[1,2,3][i]}, "); // 1,2,3
        }
        console.writeln();
        for(int item : new int[]{1,2,3}){
            console.write(item+", "); // 1, 2, 3
        }
        console.writeln();
        
    }
}


