package es.usantatecla.a0_time.a0_units.v0_0;

import es.usantatecla.utils.Console;

public class App {

	public static void main(String[] args) {
		Console console = new Console();
		int years = console.readInt("¿Qué años tienes? ");
		int millennia = years / 1000;
		int centuries = millennia * 10;
		int decades = centuries * 10;
		int months = years * 12;
		int weeks = years * 52;
		int days = years * 365;
		int hours = days * 24;
		int minutes = hours * 60;
		int seconds = minutes * 60;
		console.writeln("Aproximadamente has vivido: " +
				millennia + " milenios" +
				centuries + " siglos" +
				decades + " decadas" +
				years + " años" +
				months + " meses" +
				weeks + " semanas" +
				days + " días" +
				hours + " horas" +
				minutes + " minutos" +
				seconds + " segundos");
	}
	
}
