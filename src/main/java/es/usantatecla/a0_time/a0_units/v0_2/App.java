package es.usantatecla.a0_time.a0_units.v0_2;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
    Console console = new Console();

    final int YEARS_PER_MILLENIA = 1000;
    final int CENTURIES_PER_MILLENIA = 10;
    final int DECADE_PER_CENTURIE = 10;
    final int MONTHS_PER_YEAR = 12;
    final int WEEKS_PER_YEAR = 52;
    final int DAYS_PER_YEAR = 365;
    final int HOURS_PER_DAY = 24;
    final int MINUTES_PER_HOUR = 60;
    final int SECONDS_PER_MINUTE = 60;

    final int years = console.readInt("¿Qué años tienes? ");
		final int millennia = years / YEARS_PER_MILLENIA;
		final int centuries = millennia * CENTURIES_PER_MILLENIA;
		final int decades = centuries * DECADE_PER_CENTURIE;
		final int months = years * MONTHS_PER_YEAR;
		final int weeks = years * WEEKS_PER_YEAR;
		final int days = years * DAYS_PER_YEAR;
		final int hours = days * HOURS_PER_DAY;
		final int minutes = hours * MINUTES_PER_HOUR;
		final int seconds = minutes * SECONDS_PER_MINUTE;
		console.writeln("Aproximadamente has vivido: "+
			millennia+" milenios"+
			centuries+" siglos"+
			decades+" decadas"+
			years+" años"+
			months+" meses"+
			weeks+" semanas"+
			days+" días"+
			hours+" horas"+
			minutes+" minutos"+
			seconds+" segundos");
    }
}


