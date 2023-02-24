package es.usantatecla.a5_units.a3_date.a3_enums;

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