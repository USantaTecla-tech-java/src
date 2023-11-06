package es.usantatecla.a5_units.a3_date.a6_packages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
  private String[] names;

  private Month(int days, String[] names) {
    this.days = days;
    this.names = names;
  }

  public int getDays() {
    return days;
  }

  public static Month getMonth(int month) {
    return Month.values()[month - 1];
  }

  public Month getNext() {
    return Month.values()[this._getNext()];
  }

  private int _getNext() {
    return (this.ordinal() + 1) % Month.values().length;
  }

  public Month getPrevious() {
    if (this == Month.JANUARY) {
      return Month.DECEMBER;
    }
    return Month.values()[this.ordinal() - 1];
  }

  public String getName(Language language) {
    return this.names[language.ordinal()];
  }

  public boolean is(LocalDateTime dateTime) {
    return this.getFirstDay(dateTime.getYear()).isAfter(dateTime)
        && this.getLastDay(dateTime.getYear()).isBefore(dateTime);
  }

  public LocalDateTime getFirstDay(int year) {
    return this.getDay(year, this.ordinal(), Season.FIRST_DAY);
  }

  private LocalDateTime getDay(int year, int month, int day) {
    return LocalDateTime.of(
        LocalDate.of(year, month + 1, day),
        LocalTime.of(0, 0));
  }

  public LocalDateTime getLastDay(int year) {
    return this.getDay(year, this._getNext(), Season.FIRST_DAY - 1);
  }

  public static void main(String[] args) {
    final int YEAR = 2020;
    String msg = "";
    for (Month current : Month.values()) {
      msg += "\n" + current.name() +
          current.getFirstDay(YEAR) + " - " + current.getLastDay(YEAR);
      msg += "\nHoy " + (current.is(LocalDateTime.now()) ? "SI" : "NO") + " cae";
    }
    Console.instance().writeln(msg);
  }

}