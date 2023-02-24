package es.usantatecla.a5_units.a3_date.a2_statics;

class App {

  public static void main(String[] args) {
    Console console = new Console();
    int day = console.readInt("Dame el día:");
    int month = console.readInt("Dame el mes: ");
    int year = console.readInt("Dame el año: ");
    Date date = new Date(day, month, year);

    final Date[] firstSeasons = new Date[] {
        new Date(21, 3, year),
        new Date(21, 6, year),
        new Date(21, 9, year),
        new Date(21, 12, year) };
    int season = 3;
    for (int i = 0; i < firstSeasons.length; i++) {
      if (firstSeasons[i].before(date) || firstSeasons[i].equals(date)) {
        season = i;
      }
    }
    int position = 0;
    for (int i = 0; i < 12; i++) {
      if (new Date(21, i + 1, year).before(date)) {
        position++;
      }
    }
    console.writeln("El " + date + " cae a "
        + new String[] { "primeros", "mediados", "ultimos" }[position % 3] + " "
        + new String[] { "primavera", "verano", "otoño", "invierno" }[season] + ".");
  }
}
