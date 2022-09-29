package es.usantatecla.a0_itinerario.a2_estructurada.a4_tablas.a1_creacion;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln(new int[] {}); //
        console.writeln(new int[] { 1, 2, 3, 4, 5 }); // 1 2 3 4 5
        for (String x : new String[] { "Java", "Javascript", "Scala" }) {
            console.write(x + ", ");
        }
        console.writeln(); // Javascript, Java, Scala
        console.writeln(new String[] { "Java", "Javascript", "Scala" }); // Javascript Java Scala
        for (boolean value : new boolean[] { false, true }) {
            console.write(value + ", ");
        }
        console.writeln(); // false, true
        boolean b = false;
        for (boolean x : new boolean[] { true, b, 5 + 6 > 5 - 6 }) {
            console.write(x + ", ");
        }
        console.writeln(); // true, false, true,

        for (char[] vowels : new char[][] {
                { 'a', 'e', 'i', 'o', 'u' },
                { 'A', 'E', 'I', 'O', 'U' } }) {
            for (char vowel : vowels) {
                console.write(vowel + ", ");
            }
            console.writeln();
        }
        // a, e, i, o, u,
        // A, E, I, O, U

        for (char[] row : new char[][] {
                { 'x', ' ', 'o' },
                { 'x', 'o', 'o' },
                { ' ', ' ', 'x' } }) {
            for (char token : row) {
                console.write(token + ", ");
            }
            console.writeln();
        }
        console.writeln(); // x, ,o
        // x,o,o,
        // , ,x

        for (int[][] tableData : new int[][][] {
                {
                        { 0, 0, 0 },
                        { 0, 0 },
                        { 0 } },
                {
                        {},
                        { 1, 2, 3, 4 } } }) {
            for (int[] rowData : tableData) {
                for (int value : rowData) {
                    console.write(value + ", ");
                }
            }
        }
        console.writeln(); // 0,0,0,0,0,0,1,2,3,4
        
        console.writeln(new int[3 * 2]); // 0 0 0 0 0 0
        int length = 3;
        for(boolean[] row : new boolean[length][2]){
            console.writeln(row); 
        }
        // false false
        // false false
        // false false
        
    }
}
