package es.usantatecla.a5_units.a3_date.a4_inherits;

class App {

  public static void main(String[] args) {
    trace(1, Month.JANUARY);
    trace(1, Month.FEBRUARY);
    trace(20, Month.MARCH);
    trace(21, Month.MARCH);
    trace(5, Month.MAY);
    trace(20, Month.JUNE);
    trace(21, Month.JUNE);
    trace(5, Month.AUGUST);
    trace(20, Month.SEPTEMBER);
    trace(21, Month.SEPTEMBER);
    trace(5, Month.NOVEMBER);
    trace(20, Month.DECEMBER);
    trace(21, Month.DECEMBER);
    trace(5, Month.FEBRUARY);
    trace(20, Month.MARCH);
    trace(31, Month.DECEMBER);
  }

  private static void trace(int day, Month month) {
    Console.instance().writeln(
      App.getText(new Date(day, month, (int) (Math.random() * 2020))));
  }

  private static String getText(Date date) {
    int position = 0;
    // for (Month current : Month.values()) {
    //   Date firstDay = Date.of(Season.FIRST_DAY, current, date.getYear());
    //   if (firstDay.isBefore(date) || firstDay.isEqual(date)) {
    //     position++;
    //   }
    // }
    return "El " + date.getText(Language.SPANISH) + " cae a "
          + new String[] { "primeros", "mediados", "finales" }[position % 3] 
          + " de " + Season.of(date).getName(Language.SPANISH) + ".";

  }

}
