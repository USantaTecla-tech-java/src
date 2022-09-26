package es.usantatecla.a2_texts.a5_vowels.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    String input = console.readString("¿Dame un mensaje terminado en '.'?: ");
    int characters = 0;
    while (input.charAt(characters) != '.') // {
      characters++;
    // }
    console.writeln(
        "Tu mensaje '" + input + "' tiene " + characters + " caracteres significativos, sin contar el punto final!");
  }
}
