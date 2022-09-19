package es.usantatecla.a0_itinerario.a1_imperativa.a1_tipos.a2_string.a1_valores;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln("cadena de caracteres con comillas dobles"); // cadena de caracteres con comillas dobles
        console.writeln("cadena de caracteres con comillas dobles 'con comillas simples' dentro"); // cadena de caracteres con comillas dobles 'con comillas simples' dentro
        console.writeln("cadena de caracteres\ncon salto de línea y \ttabulador"); // cadena de caracteres
        // con salto de línea y    tabulador
        console.writeln("Qué \"incomodo\" usar comillas con 'escape'!!!"); // Qué "comodo" usar comillas con normalidad sin 'escaparlas'!!!
        console.writeln(""); //  
        console.writeln("1"); // 1
        console.writeln("123"); // 123
        console.writeln("TRUE."); // TRUE.
        console.writeln("false"); // false
        
        console.writeln("Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n"+
        "Donec rhoncus sollicitudin enim vitae tempor.\n"+
        "Nullam dui lorem, vulputate varius sapien ac, malesuada dictum metus.\n"+
        "...");
    }

}
