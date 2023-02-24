package es.usantatecla.a5_units.a3_date.a3_enums;

enum Language {
  SPANISH,
  ENGLISH;

  public String getString(int day, Month month, int year) {
    switch (this) {
      case SPANISH:
        return day + " de " + month.getString(this) + " de " + year;
      case ENGLISH:
        return month.getString(this) + ", " + day + "th " + year;
      default:
        return "";
    }
  }
  
}
