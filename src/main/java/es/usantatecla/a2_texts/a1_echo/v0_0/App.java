package es.usantatecla.a2_texts.a1_echo.v0_0;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln(console.readString("Hay eco!!! Escribe algo: ")+"!!!");
    }
}
