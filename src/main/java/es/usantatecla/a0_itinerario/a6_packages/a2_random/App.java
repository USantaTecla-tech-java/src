package es.usantatecla.a0_itinerario.a6_packages.a2_random;

import java.util.Random;

class App {

  public static void main(String[] args) {
    final int min = 3;
    final int max = 7;
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      Console.instance().writeln(min + random.nextInt(max - min + 1));
    }
    random = new Random(System.currentTimeMillis());
    Console.instance().writeln(random.nextInt());
    Console.instance().writeln(random.nextDouble());
  }

}
