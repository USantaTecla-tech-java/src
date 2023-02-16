package es.usantatecla.a5_units.a3_date.a3_enums;

import es.usantatecla.utils.Console;

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

enum Month {

  JANUARY(31, new String[] { "Enero", "January" }),
  FEBRUARY(28, new String[] { "Febrero", "February" }),
  MARCH(31, new String[] { "Marzo", "March" }),
  APRIL(30, new String[] { "Abril", "April" }),
  MAY(31, new String[] { "Mayo", "May" }),
  JUNE(30, new String[] { "Junio", "June" }),
  JULY(31, new String[] { "Julio", "July" }),
  AUGUST(31, new String[] { "Agosto", "August" }),
  SEPTEMBER(30, new String[] { "Septiembre", "September" }),
  OCTOBER(31, new String[] { "Octubre", "October" }),
  NOVEMBER(30, new String[] { "Noviembre", "November" }),
  DECEMBER(31, new String[] { "Diciembre", "December" });

  private int days;
  private String[] strings;

  private Month(int days, String[] strings) {
    this.days = days;
    this.strings = strings;
  }

  public int getDays() {
    return days;
  }

  public static Month getMonth(int month) {
    return Month.values()[month - 1];
  }

  public String getString(Language language) {
    return this.strings[language.ordinal()];
  }

  public Month getNext() {
    return Month.values()[(this.ordinal() + 1) % Month.values().length];
  }

  public Month getPrevious() {
    if (this == Month.JANUARY) {
      return Month.DECEMBER;
    } 
    return Month.values()[this.ordinal() - 1];
  }

}

class Date {

  private int day;
  private Month month;
  private int year;;
  public static /* final */ int DAYS_PER_YEAR;
  static {
    for (Month month : Month.values()) {
      DAYS_PER_YEAR += month.getDays();
    }
  }

  public Date(int day, Month month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date(Date date) {
    this(date.day, date.month, date.year);
  }

  public Date() {
    this(1, Month.JANUARY, 1900);
  }

  public Date clone() {
    return new Date(this);
  }

  public boolean equals(Date date) {
    return this.day == date.day
        && this.month == date.month
        && this.year == date.year;
  }

  public boolean after(Date date) {
    if (this.year == date.year) {
      if (this.month == date.month) {
        return this.day > date.day;
      }
      return this.month.ordinal() > date.month.ordinal();
    }
    return this.year > date.year;
  }

  public boolean before(Date date) {
    return !this.equals(date) && date.after(this);
  }

  public Date next() {
    if (day < Month.values()[this.month.ordinal()].getDays()) {
      return new Date(day + 1, month, year);
    }
    if (month.ordinal() != Month.values().length) {
      return new Date(1, month.getNext(), year);
    }
    return new Date(1, Month.JANUARY, year + 1);
  }

  public Date next(int days) {
    Date date = this.clone();
    for (int i = 0; i < days; i++) {
      date = date.next();
    }
    return date;
  }

  public int daysElapsedYear() {
    int days = 0;
    for (int i = 0; i < this.month.ordinal(); i++) {
      days += Month.values()[i].getDays();
    }
    return days + this.day - 1;
  }

  public int getDay() {
    return this.day;
  }

  public Month getMonth() {
    return this.month;
  }

  public int getYear() {
    return this.year;
  }

  public String toString() {
    return this.day + "/" + this.month + "/" + this.year;
  }

}

class App {

  public static void main(String[] args) {
    Console console = new Console();
    int day = console.readInt("Dame el día:");
    int month = console.readInt("Dame el mes: ") - 1;
    int year = console.readInt("Dame el año: ");
    Date date = new Date(day, Month.values()[month], year);

    final Date[] firstSeasons = new Date[] {
        new Date(21, Month.MARCH, year),
        new Date(21, Month.JUNE, year),
        new Date(21, Month.SEPTEMBER, year),
        new Date(21, Month.DECEMBER, year) };
    int season = 3;
    for (int i = 0; i < firstSeasons.length; i++) {
      if (firstSeasons[i].before(date) || firstSeasons[i].equals(date)) {
        season = i;
      }
    }
    int position = 0;
    for (int i = 0; i < 12; i++) {
      if (new Date(21, Month.values()[i], year).before(date)) {
        position++;
      }
    }
    console.writeln("El " + date + " cae a "
        + new String[] { "primeros", "mediados", "ultimos" }[position % 3] + " "
        + new String[] { "primavera", "verano", "otoño", "invierno" }[season] + ".");
  }
}
