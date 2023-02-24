package es.usantatecla.a2_texts.a1_echo.v0_1;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        String msg = console.readString("Hay eco!!! Escribe algo: ");
        console.writeln(msg+"!!!");
    }
}

