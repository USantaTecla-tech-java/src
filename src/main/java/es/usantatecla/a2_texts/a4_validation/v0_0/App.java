package es.usantatecla.a2_texts.a4_validation.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    String input;
    do {
      input = console.readString("Qué piensas?: ");
      if (input == "") //{
        console.writeln("Error!!! Es imposible no pensar en algo! 8-o");
      //}
    } while(input == "");
    console.writeln("Ahora ya sé que piensas: "+input);
  }
}

