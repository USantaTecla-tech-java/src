package es.usantatecla.a5_units.a3_date.a6_packages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

enum Season {
  SPRING(new String[]{"Primavera", "Spring"}, Month.MARCH),
  SUMMER(new String[]{"Verano", "Summer"}, Month.JUNE),
  FALL(new String[]{"Otoño", "Fall"}, Month.SEPTEMBER),
  WINTER(new String[]{"Invierno", "Winter"}, Month.DECEMBER);

  public static final int FIRST_DAY = 21;
  private Month firstMonth;
  private String[] msgs;

  private Season(String[] msgs, Month firstMonth){
    this.msgs = msgs;
    this.firstMonth = firstMonth;
  }

  public boolean is(LocalDateTime dateTime){
    return this.getFirstDay(dateTime.getYear()).isAfter(dateTime)
      && this.getLastDay(dateTime.getYear()).isBefore(dateTime);
  }

  public LocalDateTime getFirstDay(int year){
    return this.getDay(year, this.getFirstMonth(), Season.FIRST_DAY);
  }

  private LocalDateTime getDay(int year, int month, int day){
    return LocalDateTime.of(
      LocalDate.of(year, month, day),
      LocalTime.of(0,0));
  }

  public LocalDateTime getLastDay(int year){
    return this.getDay(year, this.getLastMonth(), Season.FIRST_DAY-1);
  }

  public int getFirstMonth() {
    return this.firstMonth.ordinal();
  }

  public int getLastMonth() {
    return (this.firstMonth.ordinal() + 3)% Month.values().length;
  }

}
