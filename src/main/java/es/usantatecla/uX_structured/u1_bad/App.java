package es.usantatecla.uX_structured.u1_bad;

public class App {

    public static void main(String[] args) {
        Console.instance().writeln(
            App.indexOf(31, new int[] { 31, 4, 5, 73, 15, 7, 3 }) + "\n" +
            App.indexOf(3, new int[] { 31, 4, 5, 73, 15, 7, 3 }) + "\n" +
            App.indexOf(73, new int[] { 31, 4, 5, 73, 15, 7, 3 }) + "\n" +
            App.indexOf(666, new int[] { 31, 4, 5, 73, 15, 7, 3 }));
    }

    private static int indexOf(int key, int[] values) {
        boolean found = false;
        int i = 0;
        while (!found) {
            if (values[i] == key) {
                return i;
            } else {
                i++;
                if (i == values.length) {
                    return -1;
                }
            }
        }
        return -1;
    }

}