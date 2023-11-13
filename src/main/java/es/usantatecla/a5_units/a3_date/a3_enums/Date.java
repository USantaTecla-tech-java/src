package es.usantatecla.a5_units.a3_date.a3_enums;

class Date {

  private int day;
  private Month month;
  private int year;;
  private static /* final */ int DAYS_YEAR;
  static {
    for (Month month : Month.values()) {
      DAYS_YEAR += month.getMaxLength();
    }
  }

  public static Date of(int day, Month month, int year) {
    return new Date(day, month, year);
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

  public String getText(Language language) {
    return language.getText(
        this.day, this.month.getName(language), this.year);
  }

  public boolean isEqual(Date date) {
    return this.day == date.day
        && this.month == date.month
        && this.year == date.year;
  }

  public boolean isBefore(Date date) {
    if (this.year < date.year) {
      return true;
    }
    if (this.year == date.year) {
      if (this.month.isBefore(date.month)) {
        return true;
      }
      if (this.month.isEqual(date.month)) {
        return this.day < date.day;
      }
    }
    return false;
  }

  public boolean isAfter(Date date) {
    return date.isBefore(this) && !date.equals(this);
  }

  public boolean isBetween(Date firstDate, Date lastDate) {
      return (firstDate.isBefore(this) || firstDate.isEqual(this))
          && (this.isBefore(lastDate) || this.isEqual(lastDate));
  }

  public Date plusDay() {
    if (this.day < this.month.getMaxLength(this.getYear())) {
      return new Date(this.day + 1, this.month, this.year);
    }
    if (this.month.ordinal() != Month.values().length) {
      return new Date(1, this.month.plusMonth(), this.year);
    }
    return new Date(1, Month.JANUARY, this.year + 1);
  }

  public Date plusDays(int days) {
    Date date = this.clone();
    for (int i = 0; i < days; i++) {
      date = date.plusDay();
    }
    return date;
  }

  public int getDaysYear() {
    int days = 0;
    for (int i = 0; i < this.month.ordinal(); i++) {
      days += Month.values()[i].getMaxLength();
    }
    return days + this.day - 1;
  }

  public double getEleapsedPercent() {
    return this.getDaysYear()
        / Date.DAYS_YEAR + (Date.isLeap(this.year) ? 1 : 0);
  }

  public static boolean isLeap(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public boolean isLeap() {
    return Date.isLeap(this.year);
  }

  public int getDayMonth() {
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

  public static void main(String[] args) {
    trace(Date.of(17, Month.JUNE, 2018), Date.of(21, Month.MARCH, 2018));
    
    trace(Date.of(17, Month.JUNE, 2018), Date.of(17, Month.JUNE, 2020));
    trace(Date.of(17, Month.JUNE, 2018), Date.of(17, Month.AUGUST, 2018));
    trace(Date.of(17, Month.JUNE, 2018), Date.of(23, Month.JUNE, 2018));
    trace(Date.of(17, Month.JUNE, 2018), Date.of(17, Month.JUNE, 2018));
    trace(Date.of(17, Month.JUNE, 2018), Date.of(3, Month.JUNE, 2018));
    trace(Date.of(17, Month.JUNE, 2018), Date.of(17, Month.MARCH, 2018));
    trace(Date.of(17, Month.JUNE, 2018), Date.of(17, Month.JUNE, 2017));

  }

  private static void trace(Date left, Date right) {
    Language language = Language.SPANISH;
    Console.instance().writeln(
        left.getText(language) + " < " + right.getText(language) +
            " = " + left.isBefore(right) + "\n" +
            left.getText(language) + " = " + right.getText(language) +
            " = " + left.isEqual(right) + "\n" +
            left.getText(language) + " > " + right.getText(language) +
            " = " + left.isAfter(right) + "\n");
  }

}
