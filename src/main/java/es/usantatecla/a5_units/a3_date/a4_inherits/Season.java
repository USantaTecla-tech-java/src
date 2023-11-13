package es.usantatecla.a5_units.a3_date.a4_inherits;

enum Season {
  SPRING(Month.MARCH, new String[] { "primavera", "spring" }),
  SUMMER(Month.JUNE, new String[] { "verano", "summer" }),
  FALL(Month.SEPTEMBER, new String[] { "otoño", "fall" }),
  WINTER(Month.DECEMBER, new String[] { "invierno", "winter" });

  public static final int FIRST_DAY = 21;
  private Month firstMonth;
  private String[] names;

  private Season(Month firstMonth, String[] names) {
    assert firstMonth != null;
    assert names != null && names.length == Language.values().length;

    this.firstMonth = firstMonth;
    this.names = names;
  }

  public static Season of(Date date) {
    if (date.isBefore(
        Date.of(Season.FIRST_DAY, Season.SPRING.firstMonth, date.getYear()))) {
      return Season.WINTER;
    }
    for (int i = 1; i < Season.values().length; i++) {
      Date firstDateSeason = 
        Date.of(Season.FIRST_DAY, Season.values()[i].firstMonth, date.getYear());
      if (firstDateSeason.isAfter(date)) {
        return Season.values()[i - 1];
      }
    }
    return Season.WINTER;
  }

  public String getName(Language language) {
    return this.names[language.ordinal()];
  }

  public static void main(String[] args) {
    for (Date date : new Date[] {
        Date.of(1, Month.JANUARY, 2020),
        Date.of(20, Month.MARCH, 2020),
        Date.of(21, Month.MARCH, 2020),
        Date.of(21, Month.APRIL, 2020),
        Date.of(17, Month.JUNE, 2020),
        Date.of(21, Month.JUNE, 2020),
        Date.of(21, Month.AUGUST, 2020),
        Date.of(21, Month.SEPTEMBER, 2020),
        Date.of(20, Month.DECEMBER, 2020),
        Date.of(21, Month.DECEMBER, 2020),
        Date.of(31, Month.DECEMBER, 2020)
    }) {
      Console.instance().writeln(date.getText(Language.SPANISH) +
          " contenida en " + Season.of(date).getName(Language.SPANISH));
    }
  }

}
