package es.usantatecla.a5_units.a3_date.a6_packages;

import java.time.LocalDateTime;

enum Language {
  SPANISH,
  ENGLISH;

  public String getString(LocalDateTime dateTime) {
    switch (this) {
      case SPANISH:
        return dateTime.getDayOfMonth() + " de " + dateTime.getMonth() + " de " + dateTime.getYear();
      case ENGLISH:
        return dateTime.getMonth() + ", " + dateTime.getDayOfMonth() + "th " + dateTime.getYear();
      default:
        return "";
    }
  }
  
}
