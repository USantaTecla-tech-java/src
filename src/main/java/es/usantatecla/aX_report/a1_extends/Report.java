package es.usantatecla.aX_report.a1_extends;

import java.util.Random;
import es.usantatecla.aX_dispensers.a7_modular.utils.Console;

interface Checker<E> {
  boolean isChecked(E element);
}

class PositiveChecker implements Checker<Integer> {
  public boolean isChecked(Integer element) {
    return element.intValue() > 0;
  }

}

class NegativeChecker implements Checker<Integer> {
  public boolean isChecked(Integer element) {
    return element.intValue() < 0;
  }

}

class Report<E> {

  private E[] elements;
  private Checker<E> checker;

  public Report(E[] elements, Checker<E> checker) {
    this.elements = elements;
    this.checker = checker;
  }

  public void writeln() {
    String string = "\nCabecera\n========";
    int lines = 0;
    for (E element : this.elements) {
      if (checker.isChecked(element)) {
        string +=  "\n!!!" + element + "!!!";
        lines++;
        if (lines > 0 && lines % 5 == 0) {
          string += "\n pág. " + (lines / 5);
        }
      }
    }
    if (lines % 5 != 0) {
      string += "\n pág. " + (lines / 5 + 1);
    }
    Console.getInstance().writeln(string);
  }

  public static void main(String[] args) {
    Integer[] numbers = new Integer[20];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i - new Random().nextInt(5);
    }

    new Report<Integer>(numbers, new PositiveChecker()).writeln();
    new Report<Integer>(numbers, new NegativeChecker()).writeln();

  }

}
