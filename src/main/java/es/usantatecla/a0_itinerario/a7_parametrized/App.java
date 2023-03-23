package es.usantatecla.a0_itinerario.a7_parametrized;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.FullDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers.BoundedQueue;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Console;

public class App {
  
  public static void main (String[] args) throws FullDispenserException, EmptyDispenserException{
    BoundedQueue<Double> b0 = new BoundedQueue<Double>(10);
    b0.add(0.0);
    //b0.add(0); // Error!!!
    //b0.add(new Fraction(0,2)); // Error!!!
    Console.getInstance().writeln(""+b0.remove());

    BoundedQueue<Double> b1 = new BoundedQueue(10);
    b1.add(1.1);
    //b1.add(1); // Error!!!
    //b1.add(new Fraction(1,2)); // Error!!!
    Console.getInstance().writeln(""+b1.remove());

    BoundedQueue b2 = new BoundedQueue<Double>(10);
    b2.add(2.2);
    //b2.add(2); // Warning!!! y Error!!!
    //b2.add(new Fraction(2,2)); // Warning!!! y Error!!!
    Console.getInstance().writeln(""+b2.remove());

    BoundedQueue b3 = new BoundedQueue(10); // Integer!!!
    //b3.add(3.3); // Warning!!! y Error!!!
    b3.add(3);
    //b3.add(new Fraction(3,2)); // Warning!!! y Error!!!
    Console.getInstance().writeln(""+b3.remove());

    //BoundedQueue<Integer>[] a0 = new BoundedQueue<Integer>[3]; // Error!!!
    BoundedQueue<Integer>[] a0 = new BoundedQueue[3];
    for(BoundedQueue<Integer> boundedQueue : a0){
      boundedQueue = new BoundedQueue<>(5);
    }
  }

}
