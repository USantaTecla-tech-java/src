package es.usantatecla.a0_itinerario.a1_imperativa.a1_tipos.a2_string.a2_concatenacion;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    console.writeln("Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
        "Donec rhoncus sollicitudin enim vitae tempor.\n" +
        "Nullam dui lorem, vulputate varius sapien ac, malesuada dictum metus.\n" +
        "...");
    console.writeln("1" + "2" + "3" + "..."); // 123...
    console.writeln(535 + " * " + 723 + " = " + 535 * 723 + "."); // 535 * 723 = 386805.
  }
}
