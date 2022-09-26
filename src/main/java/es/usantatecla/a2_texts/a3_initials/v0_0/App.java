package es.usantatecla.a2_texts.a3_initials.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    String input = console.readString("Introduce 3 palabras separadas por varios espacios: ");
    int iBeginFirstWord = 0;
    while (input.charAt(iBeginFirstWord) == ' ') {
      iBeginFirstWord++;
    }
    
    int iEndFirstWord = iBeginFirstWord + 1;
    while (input.charAt(iEndFirstWord) != ' ' && iEndFirstWord < input.length()) {
      iEndFirstWord++;
    }
    iEndFirstWord--;
    String msg = "";
    for (int i = iBeginFirstWord; i <= iEndFirstWord; i++) {
      msg += input.charAt(i);
    }

    int iBeginSecondWord = iEndFirstWord + 1;
    while (input.charAt(iBeginSecondWord) == ' ') {
      iBeginSecondWord++;
    }
    int iEndSecondtWord = iBeginSecondWord + 1;
    while (input.charAt(iEndSecondtWord) != ' ' && iEndSecondtWord < input.length()) {
      iEndSecondtWord++;
    }
    iEndSecondtWord--;
    msg += " ";
    for (int i = iBeginSecondWord; i <= iEndSecondtWord; i++) {
      msg += input.charAt(i);
    }

    int iBeginThirdWord = iEndSecondtWord + 1;
    while (input.charAt(iBeginThirdWord) == ' ') {
      iBeginThirdWord++;
    }
    int iEndThirdWord = iBeginThirdWord + 1;
    while (input.charAt(iEndThirdWord) != ' ' && iEndThirdWord < input.length()) {
      iEndThirdWord++;
    }
    iEndThirdWord--;
    msg += " ";
    for (int i = iBeginThirdWord; i <= iEndThirdWord; i++) // {
      msg += input.charAt(i);
    // }
    console.writeln("." + msg + ".");
  }
}
