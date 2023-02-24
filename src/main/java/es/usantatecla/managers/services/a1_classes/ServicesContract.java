package es.usantatecla.managers.services.a1_classes;

class ServicesContract {

	private String name;
	private final int year;
	private Interval[] intervals;
	private final Interval PRESET_INTERVAL = new Interval(8.0, 12.0);
	private final double PRESET_COST_PER_HOUR = 70.0;
	private final double EXTRAORDINARY_COST_PER_HOUR = 90.0;

	public ServicesContract(String name, int year) {
		this.name = name;
		this.year = year;
		this.intervals = new Interval[new Date(1, 1, year).DAYS_PER_YEAR];
		for (int i = 0; i < intervals.length; i++) {
			this.intervals[i] = this.PRESET_INTERVAL.clone();
		}
	}

	public void cancel(Date date) {
		this.intervals[date.daysElapsedYear()] = null;
	}

	public void enlarge(Date date, double scale) {
		this.intervals[date.daysElapsedYear()].scale(scale);
	}

	public void shift(Date date, double shiftment) {
		this.intervals[date.daysElapsedYear()].shift(shiftment);
	}

	public void writeln() {
		Console.getInstance().writeln("Contrato de limpieza: " + name + "-" + year);
		Date date = new Date(1, 1, year);
		for (int i = 0; i < intervals.length; i++) {
			Console.getInstance().write("(" + (i + 1) + "º) " + date + " - ");
			if (intervals[i] == null) {
				Console.getInstance().writeln("Cancelado");
			} else {
				Console.getInstance().writeln(intervals[i].toString());
			}
			date = date.next();
		}
	}

	public double getCost() {
		double cost = 0.0;
		for (Interval interval : this.intervals) {
			if (interval != null) {
				double presetHours = 0.0;
				Interval intersection = interval.intersection(PRESET_INTERVAL);
				if (intersection != null) {
					presetHours = intersection.length();
					cost += presetHours * PRESET_COST_PER_HOUR;
				}
				cost += (interval.length() - presetHours)
						* EXTRAORDINARY_COST_PER_HOUR;
			}
		}
		return cost;
	}

	public static void main(String[] args) {
		final int YEAR = 2022;
		ServicesContract servicesContract = new ServicesContract("USantaTecla", YEAR);

		servicesContract.writeln();
		double cost = servicesContract.getCost();
		Console.getInstance().writeln("Coste anual del contrato: " + cost);

		servicesContract.cancel(new Date(25, 12, YEAR));
		servicesContract.writeln();
		cost = servicesContract.getCost();
		Console.getInstance().writeln("Coste anual del contrato: " + cost);

		servicesContract.enlarge(new Date(24, 12, YEAR), 2.0);
		servicesContract.writeln();
		cost = servicesContract.getCost();
		Console.getInstance().writeln("Coste anual del contrato: " + cost);

		servicesContract.shift(new Date(26, 12, YEAR), 1.0);
		servicesContract.writeln();
		cost = servicesContract.getCost();
		Console.getInstance().writeln("Coste anual del contrato: " + cost);
	}

}
