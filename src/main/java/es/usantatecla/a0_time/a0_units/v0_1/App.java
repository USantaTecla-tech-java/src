package es.usantatecla.a0_time.a0_units.v0_1;

import es.usantatecla.utils.Console;

public class App {

    public static void main(String[] args) {
    Console console = new Console();
    final int years = console.readInt("¿Qué años tienes? ");
		final int millennia = years / 1000;
		final int centuries = millennia * 10;
		final int decades = centuries * 10;
		final int months = years * 12;
		final int weeks = years * 52;
		final int days = years * 365;
		final int hours = days * 24;
		final int minutes = hours * 60;
		final int seconds = minutes * 60;
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


