package es.usantatecla.a5_units.a3_date.a3_enums;

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
    for (int i = 0; i < Month.values().length; i++) {
      if (new Date(Season.FIRST_DAY, Month.values()[i], year).before(date)) {
        position++;
      }
    }
    console.writeln("El " + date + " cae a "
        + new String[] { "primeros", "mediados", "ultimos" }[position % 3] + " "
        + new String[] { "primavera", "verano", "otoño", "invierno" }[season] + ".");
  }
}
