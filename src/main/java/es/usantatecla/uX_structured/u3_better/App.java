package es.usantatecla.uX_structured.u3_better;

public class App {

    public static void main(String[] args) {
        Console.instance().writeln(
            App.indexOf(31, new int[] { 31, 4, 5, 73, 15, 7, 3 }) + "\n" +
            App.indexOf(3, new int[] { 31, 4, 5, 73, 15, 7, 3 }) + "\n" +
            App.indexOf(73, new int[] { 31, 4, 5, 73, 15, 7, 3 }) + "\n" +
            App.indexOf(666, new int[] { 31, 4, 5, 73, 15, 7, 3 }));
    }

    private static int indexOf(int key, int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
