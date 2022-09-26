package es.usantatecla.a0_time.a3_sumTimes.v0_0;

import es.usantatecla.utils.Console;

public class App {

  public static void main(String[] args) {
    Console console = new Console();
    final int hours = console.readInt("Dime la hora actual [0-23]: ");
    final int minutes = console.readInt("Dime los minutos actuales [0-59]: ");
    final int neededHours = console.readInt("Dime cuantas horas necesitas [0-23]: ");
    final int neededMinutes = console.readInt("Dime los minutos necesitas [0-59]: ");
    int afterHours = hours + neededHours;
    int afterMinutes = minutes + neededMinutes;
    final int MINUTES_PER_HOUR = 60;
    if (afterMinutes >= MINUTES_PER_HOUR) {
      afterMinutes -= MINUTES_PER_HOUR;
      afterHours++;
    }
    console.writeln("Serán las " + afterHours + ":" + afterMinutes);
  }

}
