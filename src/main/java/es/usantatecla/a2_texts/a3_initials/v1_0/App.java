package es.usantatecla.a2_texts.a3_initials.v1_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int AMOUNT = 3;
    final String input = console.readString("Introduce 3 palabras separadas por varios espacios: ");
    String msg = "";
    int iBeginWord = 0;
    for (int j = 0; j < AMOUNT; j++) {
      while (input.charAt(iBeginWord) == ' ') {
        iBeginWord++;
      }
      int iEndWord = iBeginWord + 1;
      while (input.charAt(iEndWord) != ' ' && iEndWord < input.length()) {
        iEndWord++;
      }
      iEndWord--;
      for (int i = iBeginWord; i <= iEndWord; i++) {
        msg += input.charAt(i);
      }
      if (j != AMOUNT) {
        msg += ' ';
      }
      iBeginWord = iEndWord + 1;
    }
    console.writeln("." + msg + ".");
  }
}
