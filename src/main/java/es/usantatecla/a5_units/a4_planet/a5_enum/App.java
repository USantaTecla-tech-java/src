package es.usantatecla.a5_units.a4_planet.a5_enum;

public class App {
  
  public static void main(String[] args) {
    double earthWeight = Console.instance().readDouble("Dame tu peso en kilogramos: ");
    double mass = earthWeight / Planet.EARTH.surfaceGravity();
    for (Planet planet : Planet.values()) {
      Console.instance().writeln(
          "Tu peso en " + planet + " es " + planet.surfaceWeight(mass));
    }
    String name = Console.instance()
      .readString("Dame el nombre de un planeta: ")
      .trim().toUpperCase();
    Console.instance().writeln(Planet.instance(name).toString());
  }

}
