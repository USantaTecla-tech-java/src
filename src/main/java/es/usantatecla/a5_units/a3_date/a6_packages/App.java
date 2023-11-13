package es.usantatecla.a5_units.a3_date.a6_packages;

import java.time.LocalDateTime;

class App {

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    Season season = null; 
    for (Season current: Season.values()) {
      if (current.is(now)) {
        season = current;
      }
    }
    Month month = null;
    for (Month current : Month.values()) {
      if (current.is(now)) {
        month = current;
      }
    }
    Console.instance().writeln("El " + now + " cae a "
        + new String[] { "primeros", "mediados", "ultimos" }[month.ordinal() % 3] + " "
        + new String[] { "primavera", "verano", "otoño", "invierno" }[season.ordinal()] + ".");
  }

  

}
