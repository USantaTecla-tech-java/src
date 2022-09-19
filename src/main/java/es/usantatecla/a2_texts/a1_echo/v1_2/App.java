package es.usantatecla.a2_texts.a1_echo.v1_2;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final String msg = console.readString("Hay triple eco!!! Escribe algo:");
    final int PROPAGATION = 3;
    String echo = "";
    for (int i = 0; i < PROPAGATION; i++) {
      for (int j = 0; j < PROPAGATION - i; j++) {
        echo += msg;
        if (j < PROPAGATION - i - 1) {
          echo += ", ";
        } else {
          echo += "!!!\n";
        }
      }
    }
    console.writeln(echo);
  }
}
