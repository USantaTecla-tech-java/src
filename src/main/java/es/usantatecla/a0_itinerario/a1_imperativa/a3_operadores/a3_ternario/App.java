package es.usantatecla.a0_itinerario.a1_imperativa.a3_operadores.a3_ternario;

class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln(true ? "si / entonces / segundo / izquierda"
                : "no / en caso contrario / tercero / derecha "); // si / entonces / segundo / izquierda
        console.writeln(false ? -1 : +1); // 1
        console.writeln(-5 > 1 ? 1 / 1 : 1 / 0);
    }
}