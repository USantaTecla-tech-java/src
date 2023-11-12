package es.usantatecla.a5_units.a4_planet.a2_arrays;

public class Planet {
//   MERCURY(3.303e+23, 2.4397e6),
//   VENUS(4.869e+24, 6.0518e6),
//   EARTH(5.976e+24, 6.37814e6),
//   MARS(6.421e+23, 3.3972e6),
//   JUPITER(1.9e+27, 7.1492e7),
//   SATURN(5.688e+26, 6.0268e7),
//   URANUS(8.686e+25, 2.5559e7),
//   NEPTUNE(1.024e+26, 2.4746e7);

//   private final double mass; // in kilograms
//   private final double radius; // in meters

//   Planet(double mass, double radius) {
//     this.mass = mass;
//     this.radius = radius;
//   }

//   public static final double G = 6.67300E-11;

//   double surfaceGravity() {
//     return G * mass / (radius * radius);
//   }

//   double surfaceWeight(double mass) {
//     return mass * surfaceGravity();
//   }

  public static void main(String[] args) {
    String[] planets = { 
      "MERCURY", 
      "VENUS", 
      "EARTH", 
      "MARS", 
      "JUPITER", 
      "SATURN", 
      "URANUS", 
      "NEPTUNE" };
    double[] masses = {
      3.303e+23, 
      4.869e+24, 
      5.976e+24, 
      6.421e+23, 
      1.9e+27, 
      5.688e+26, 
      8.686e+25, 
      1.024e+26 };
    double[] radii = { 
      2.4397e6, 
      6.0518e6, 
      6.37814e6, 
      3.3972e6, 
      7.1492e7, 
      6.0268e7, 
      2.5559e7, 
      2.4746e7 };

      // CAMBIAR A ARRAYS
    // double earthWeight = Console.instance().readDouble("Dame tu peso en kilogramos: ");
    // double mass = earthWeight / EARTH.surfaceGravity();
    // for (Planet planet : Planet.values()) {
    //   Console.instance().writeln(
    //       "Your weight on " + planet + " is " + planet.surfaceWeight(mass));
    // }
  }
}
