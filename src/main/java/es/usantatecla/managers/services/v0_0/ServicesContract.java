package es.usantatecla.managers.services.v0_0;

import es.usantatecla.utils.Console;

class ServicesContract {

	private final int year;
	private Interval[] hours;
	private static final Interval PREFFIX = new Interval(8.0, 12.0);
	private static final double PRECIO_PREFIJADO = 70.0;
	private static final double PRECIO_EXTRAORDINARIO = 90.0;

	public ServicesContract(int year) {
		this.year = year;
		hours = new Interval[Date.daysInYear(year)];
		for (int i = 0; i < hours.length; i++) {
			hours[i] = PREFFIX.copy();
		}
	}

	public void anular(Date date) {
		if (date.getYear() == year) {
			hours[date.daysElapsedYear()] = null;
		}
	}

	public void ampliar(Date date, double factor) {
		if (date.getYear() == year
				&& hours[date.daysElapsedYear()] != null) {
			hours[date.daysElapsedYear()].escale(factor);
		}
	}

	public void desplazar(Date date, double desplazamiento) {
		if (date.getYear() == year
				&& hours[date.daysElapsedYear()] != null) {
			hours[date.daysElapsedYear()].shift(desplazamiento);
		}
	}

	public void writeln() {
		Console console = new Console();
		console.writeln("Contrato de limpieza: " + year);
		Date date = new Date(1, Month.JANUARY, year);
		for (int i = 0; i < hours.length; i++) {
			console.write("(" + (i + 1) + ") " + date.toString() + " - ");
			if (hours[i] == null) {
				console.writeln("Anulado");
			} else {
				console.writeln(hours[i].toString());
			}
			date = date.next();
		}
	}

	public double getCost() {
		double cost = 0.0;
		for (int i = 0; i < hours.length; i++) {
			if (hours[i] != null) {
				double prefijado = 0.0;
				Interval interseccion = hours[i].intersection(PREFFIX);
				if (interseccion != null) {
					prefijado = interseccion.length();
					cost += prefijado * PRECIO_PREFIJADO;
				}
				cost += (hours[i].length() - prefijado)
						* PRECIO_EXTRAORDINARIO;
			}
		}
		return cost;
	}

	public static double cost(Interval intervalo) {
		double resultado = 0.0;
		double prefijado = 0.0;
		Interval interseccion = intervalo.intersection(PREFFIX);
		if (interseccion != null) {
			prefijado = interseccion.length();
			resultado += prefijado * PRECIO_PREFIJADO;
		}
		resultado += (intervalo.length() - prefijado) * PRECIO_EXTRAORDINARIO;
		return resultado;
	}

	public static void main(String[] args) {
		Console console = new Console();
		ServicesContract eui2015 = new ServicesContract(2015);
		eui2015.anular(new Date(25, Month.JANUARY, 2015));
		eui2015.ampliar(new Date(30, Month.APRIL, 2015), 2.0);
		eui2015.desplazar(new Date(28, Month.DECEMBER, 2015), 1.0);
		eui2015.writeln();
		console.writeln("Coste total del contrato: "
				+ eui2015.getCost() + " Euros");
		
		String horario = "8:00-15:00";
		Interval intervalo = new Interval(horario);
		console.writeln("Coste del horario "
				+ horario + ": " + ServicesContract.cost(intervalo));
		
		horario = "11:15-16:30";
		intervalo = new Interval(horario);
		console.writeln("Coste del horario "
				+ horario + ": " + ServicesContract.cost(intervalo));
	}
}
