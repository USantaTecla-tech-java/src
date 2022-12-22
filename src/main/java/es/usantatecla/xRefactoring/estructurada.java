package es.usantatecla.xRefactoring;

public class estructurada {

    public void m() {
        int[] values = { 1, 4, 5, 73, 5, 7, 3 };
        int key = 9;
        boolean end = false;
        int i = 0;
        while (!end) {
            if (values[i] == key) {
                System.out.println("encontrado");
                end = true;
            } else {
                i++;
                if (i == values.length) {
                    end = true;
                }
            }
        }
    }

    public void m2() {
        int[] values = { 1, 4, 5, 73, 5, 7, 3 };
        int key = 9;
        int i = 0;
        while (i < values.length - 1 && values[i] != key) {
            i++;
        }
        if (values[i] == key) {
            System.out.println("encontrado");
        }

    }
}
