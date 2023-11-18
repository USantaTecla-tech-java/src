package es.usantatecla.uX_structured.u2_good;

public class App {

    public static void main(String[] args) {
        Console.instance().writeln(
                App.find(31, new int[] { 31, 4, 5, 73, 15, 7, 3 }) + "\n" +
                App.find(3, new int[] { 31, 4, 5, 73, 15, 7, 3 }) + "\n" +
                App.find(73, new int[] { 31, 4, 5, 73, 15, 7, 3 }) + "\n" +
                App.find(666, new int[] { 31, 4, 5, 73, 15, 7, 3 }));
    }

    private static int find(int key, int[] values) {
        int i = 0;
        while (i < values.length - 1 && values[i] != key) {
            i++;
        }
        if (values[i] == key) {
            return i;
        }
        return -1;
    }
}
