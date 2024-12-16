package es.usantatecla.aX_report.a2_anonymus;

import java.util.Random;
import es.usantatecla.aX_dispensers.a7_modular.utils.Console;

interface Checker<E> {
  boolean isChecked(E element);
}

class Report<E> {

  private E[] elements;
  private Checker<E> checker;
  
  public Report(E[] elements, Checker<E> checker){
    this.elements = elements;
    this.checker = checker;
  }
  
  public void writeln() {
    int lines = 0;
    Console.getInstance().writeln("Cabecera");
    Console.getInstance().writeln("========");
    for(E element : this.elements){
      if (checker.isChecked(element)){
        Console.getInstance().writeln("!!!" + element + "!!!");
        lines++;
        if (lines > 0 && lines % 5 == 0){
          Console.getInstance().writeln("pág. " + (lines / 5));
        }
      }
    }
    if (lines % 5 != 0){
      Console.getInstance().writeln("pág. " + (lines / 5 + 1));
    }
  }

  public static void main(String[] args){
    Integer[] numbers = new Integer[20];
    for(int i=0; i<numbers.length; i++){
      numbers[i] = i-new Random().nextInt(5);
    }

    new Report<Integer>(numbers, new Checker<Integer>() {
      public boolean isChecked(Integer element){
        return element.intValue()>0;
      }
    }).writeln();
    new Report<Integer>(numbers, new Checker<Integer>() {
      public boolean isChecked(Integer element){
        return element.intValue()<0;
      }
    }).writeln();

  }
  
  }
  
  
