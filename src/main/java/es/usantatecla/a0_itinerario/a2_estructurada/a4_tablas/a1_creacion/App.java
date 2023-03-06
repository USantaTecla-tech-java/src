package es.usantatecla.a0_itinerario.a2_estructurada.a4_tablas.a1_creacion;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        for (int value : new int[] {}) {
            console.write(value); //
        }
        console.writeln();
        for (int value : new int[] { 1, 2, 3, 4, 5 }) {
            console.write(value + ", "); // 1, 2, 3, 4, 5,
        }
        console.writeln();
        for (String value : new String[] { "Java", "Javascript", "Scala" }) {
            console.write(value + ", "); // Javascript, Java, Scala
        }
        console.writeln();
        for (boolean value : new boolean[] { false, true }) {
            console.write(value + ", "); // false, true
        }
        console.writeln();
        boolean b = false;
        for (boolean x : new boolean[] { true, b, 5 + 6 > 5 - 6 }) {
            console.write(x + ", "); // true, false, true,
        }
        console.writeln();
        for (char[] vowels : new char[][] {
                { 'a', 'e', 'i', 'o', 'u' },
                { 'A', 'E', 'I', 'O', 'U' } }) {
            for (char vowel : vowels) {
                console.write(vowel + ", "); // a, e, i, o, u, A, E, I, O, U
            }
        }
        console.writeln();
        for (char[] row : new char[][] {
                { 'x', ' ', 'o' },
                { 'x', 'o', 'o' },
                { ' ', ' ', 'x' } }) {
            for (char token : row) {
                console.write(token + ", "); // x, ,o, x, o, o, , ,x
            }
        }
        console.writeln();
        for (int[][] tableData : new int[][][] {
                {
                        { 0, 0, 0 },
                        { 0, 0 },
                        { 0 } },
                {
                        {},
                        { 1, 2, 3, 4 } } }) {
            for (int[] row : tableData) {
                for (int value : row) {
                    console.write(value + ", "); // 0, 0, 0, 0, 0, 0, 1, 2, 3, 4
                }
            }
        }
        console.writeln();
        for (int value : new int[3 * 2]) {
            console.write(value + ", "); // 0, 0, 0, 0, 0, 0,
        }
        console.writeln();
        int length = 3;
        for (boolean[] row : new boolean[length - 1][2]) {
            for (boolean value : row) {
                console.write(value + ", "); // false, false, false, false,
            }
        }
        console.writeln();
        int[][] notIntsOnlyRows = new int[10][];
    }
}
