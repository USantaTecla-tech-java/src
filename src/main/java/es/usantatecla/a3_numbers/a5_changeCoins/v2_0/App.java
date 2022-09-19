package es.usantatecla.a3_numbers.a5_changeCoins.v2_0;

import es.usantatecla.utils.Console;

public class App {

  static final int[] COINS = new int[] { 11, 5, 1 };

  public static void main(String[] args) {
    Console console = new Console();
    int amount = console.readInt("Dame la cantidad de céntimos: ");
    int[] coins = getChangedCoins(amount, "  ");
    String msg = "";
    for (int i = 0; i < COINS.length; i++) {
      msg += coins[i] > 0 ? coins[i] + " moneda(s) de " + COINS[i] + "\n" : "";
    }
    console.writeln(msg);
  }

  static int[] getChangedCoins(int value, String tab) {
    if (value < 5) {
      return new int[] { 0, 0, value };
    }
    if (value == 5) {
      return new int[] { 0, 1, 0 };
    }
    if (value < 11) {
      return new int[] { 0, 1, value - 5 };
    }
    if (value == 11) {
      return new int[] { 1, 0, 0 };
    }
    int[] changedCoins = new int[] {};
    // for (int i = 0; i < COINS.length; i++) {
    //   changedCoins[i] = getChangedCoins(value - COINS[i], tab + "  ");
    // }
    // int positionMin = 0;
    // for (int i = 1; i < COINS.length; i++) {
    //   if (sum(changedCoins[i]) < sum(changedCoins[positionMin])) {
    //     positionMin = i;
    //   }
    // }
    // changedCoins[positionMin][positionMin]++;
    return changedCoins;
  }

  static int sum(int[] numbers){
    int acc = 0;
    for (int number : numbers) {
      acc += number;
    }
    return acc;
  }

}
