package es.usantatecla.managers.services.v0_0;

import es.usantatecla.utils.Console;

class ServicesContract {

	private final int year;
	private Interval[] timetable;
	private static final Interval PRESET_INTERVAL = new Interval(8.0, 12.0);
	private static final double PRESET_COST_PER_HOUR = 70.0;
	private static final double EXTRAORDINARY_COST_PER_HOUR = 90.0;

	public ServicesContract(int year) {
		this.year = year;
		timetable = new Interval[Date.daysInYear(year)];
		for (int i = 0; i < timetable.length; i++) {
			timetable[i] = PRESET_INTERVAL.copy();
		}
	}

	public void cancel(Date date) {
		assert date.getYear() == year;

		timetable[date.daysElapsedYear()] = null;
	}

	public void enlarge(Date date, double factor) {
		assert date.getYear() == year;
		assert timetable[date.daysElapsedYear()] != null;

		timetable[date.daysElapsedYear()].escale(factor);
	}

	public void desplazar(Date date, double desplazamiento) {
		assert date.getYear() == year;
		assert timetable[date.daysElapsedYear()] != null;

		timetable[date.daysElapsedYear()].shift(desplazamiento);
	}

	public void writeln() {
		Console console = new Console();
		console.writeln("Contrato de limpieza: " + year);
		Date date = new Date(1, Month.JANUARY, year);
		for (int i = 0; i < timetable.length; i++) {
			console.write("(" + (i + 1) + ") " + date.toString() + " - ");
			if (timetable[i] == null) {
				console.writeln("Anulado");
			} else {
				console.writeln(timetable[i].toString());
			}
			date = date.next();
		}
	}

	public double getCost() {
		double cost = 0.0;
		for (int i = 0; i < timetable.length; i++) {
			cost += this.cost(timetable[i]);
		}
		return cost;
	}

	public double cost(Interval interval) {
		if (interval == null) {
			return 0.0;
		}
		double cost = 0.0;
		double presetHours = 0.0;
		Interval intersection = interval.intersection(PRESET_INTERVAL);
		if (intersection != null) {
			presetHours = intersection.length();
			cost += presetHours * PRESET_COST_PER_HOUR;
		}
		cost += (interval.length() - presetHours)
				* EXTRAORDINARY_COST_PER_HOUR;
		return cost;
	}

	public static void main(String[] args) {
		Console console = new Console();
		ServicesContract etsisi = new ServicesContract(2015);
		
		etsisi.writeln();
		double cost = etsisi.getCost();
		console.writeln("Coste anual del contrato: " + cost + " €");
		console.writeln(cost == 102200 ? "" : "ERROR!!!!");

		etsisi.cancel(new Date(25, Month.JANUARY, 2015));
		etsisi.writeln();
		cost = etsisi.getCost();
		console.writeln("Coste anual del contrato: " + cost + " €");
		console.writeln(cost == 101920 ? "" : "ERROR!!!!");
		
		etsisi.enlarge(new Date(30, Month.APRIL, 2015), 2.0);
		etsisi.writeln();
		cost = etsisi.getCost();
		console.writeln("Coste anual del contrato: " + cost + " €");
		console.writeln(cost == 102280 ? "" : "ERROR!!!!");

		etsisi.desplazar(new Date(28, Month.DECEMBER, 2015), 1.0);
		etsisi.writeln();
		cost = etsisi.getCost();
		console.writeln("Coste anual del contrato: " + cost + " €");
		console.writeln(cost == 102300 ? "" : "ERROR!!!!");
	}
}
