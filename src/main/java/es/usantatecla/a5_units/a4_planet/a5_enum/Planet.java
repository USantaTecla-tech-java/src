package es.usantatecla.a5_units.a4_planet.a5_enum;

public enum Planet {
  MERCURY("Mercurio", 3.303e+23, 2.4397e6),
  VENUS("Venus",4.869e+24, 6.0518e6),
  EARTH("Tierra",5.976e+24, 6.37814e6),
  MARS("Marte",6.421e+23, 3.3972e6),
  JUPITER("Júpiter",1.9e+27, 7.1492e7),
  SATURN("Saturno",5.688e+26, 6.0268e7),
  URANUS("Urano",8.686e+25, 2.5559e7),
  NEPTUNE("Neptuno", 1.024e+26, 2.4746e7);
  
  private final String name;
  private final double mass; // in kilograms
  private final double radius; // in meters

  Planet(String name, double mass, double radius) {
    this.name = name;
    this.mass = mass;
    this.radius = radius;
  }

  public static final double G = 6.67300E-11;

  public boolean is(String name){
    return this.name.toLowerCase().equals(name.trim().toLowerCase());
  }

  double surfaceGravity() {
    return G * mass / (radius * radius);
  }

  double surfaceWeight(double mass) {
    return mass * surfaceGravity();
  }

  Planet next() {
    assert this.ordinal() < Planet.values().length - 1;

    return Planet.values()[this.ordinal() + 1];
  }

  Planet previous() {
    assert this.ordinal() > 0;

    return Planet.values()[this.ordinal() - 1];
  }

  public String toString() {
    return this.name + " con " + this.mass + "kg de masa y " 
      + this.radius + "m de radio.";
  }

  public static Planet instance(String name) {
    for(Planet planet : Planet.values()){
      if (planet.is(name)){
        return planet;
      }
    }
    return null;
  }

}
