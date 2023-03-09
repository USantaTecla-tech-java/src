package es.usantatecla.a5_units.a3_date.a3_enums;

enum Season {
  SPRING(Month.MARCH),
  SUMMER(Month.JUNE),
  FALL(Month.SEPTEMBER),
  WINTER(Month.DECEMBER);

  public static final int FIRST_DAY = 21;
  private Month month;

  private Season(Month month){
    this.month = month;
  }

  public boolean after(Date date){
    return new Date(Season.FIRST_DAY, month, date.getYear()).after(date);
  }

}
