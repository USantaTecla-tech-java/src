package es.usantatecla.a5_units.a3_date.a3_enums;

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
