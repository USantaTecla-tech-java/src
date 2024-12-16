package es.usantatecla.aX_report.a3_lambda;

import java.util.Random;
import java.util.function.Predicate;

import es.usantatecla.aX_dispensers.a7_modular.utils.Console;

class Report<E> {

  private E[] elements;
  private Predicate<E> predicate;
  
  public Report(E[] elements, Predicate<E> predicate){
    this.elements = elements;
    this.predicate = predicate;
  }
  
  public void writeln() {
    int lines = 0;
    Console.getInstance().writeln("Cabecera");
    Console.getInstance().writeln("========");
    for(E element : this.elements){
      if (predicate.test(element)){
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

    new Report<Integer>(numbers, (Integer element) -> {
        return element.intValue()>0;
      }).writeln();
    new Report<Integer>(numbers, (Integer element) -> {
        return element.intValue()<0;
      }).writeln();
  }
  
  }
  
  
