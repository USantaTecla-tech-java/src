package es.usantatecla.nestedDocs;

// 1.4. Expresiones Lambda
// funciones anónimas, objetos de clases anónimas con un único método

interface IntervalConsumer<E extends Comparable<E>> {
  void accept(Interval<E> interval);
}

class X {
  public static void main(String arg[]){
    final double SHIFTMENT = 1;
    IntervalConsumer<Integer> function = (Interval<Integer> interval) -> Console.getInstance().writeln(interval.toString());
  
  }
}

// es/usantatecla/aX_menu/a8_anonymus anonimas en opciones pero no en main
// es/usantatecla/aX_menu/a9_lambda funciones en opciones! No en main!!!

// Ir a 1.4.1. FunctionalInterface

// default
// static
