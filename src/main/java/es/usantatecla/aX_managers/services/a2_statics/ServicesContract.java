package es.usantatecla.aX_managers.services.a2_statics;

class ServicesContract {

	private String name;
	private final int year;
	private Interval[] intervals;
	private static final Interval PRESET_INTERVAL = new Interval(8.0, 12.0);
	private static final double PRESET_COST_PER_HOUR = 70.0;
	private static final double EXTRAORDINARY_COST_PER_HOUR = 90.0;

	public ServicesContract(String name, int year) {
		this.name = name;
		this.year = year;
		intervals = new Interval[Date.daysInYear(year)];
		for (int i = 0; i < intervals.length; i++) {
			intervals[i] = PRESET_INTERVAL.clone();
		}
	}

	public void cancel(Date date) {
		intervals[date.daysElapsedYear()] = null;
	}

	public void enlarge(Date date, double scale) {
		intervals[date.daysElapsedYear()].scale(scale);
	}

	public void shift(Date date, double shiftment) {
		intervals[date.daysElapsedYear()].shift(shiftment);
	}

	public void writeln() {
		Console.getInstance().writeln("Contrato de limpieza: " + name + "-" + year);
		Date date = new Date(1, Month.JANUARY, year);
		for (int i = 0; i < intervals.length; i++) {
			Console.getInstance().write("(" + (i + 1) + ") " + date + " - ");
			if (intervals[i] == null) {
				Console.getInstance().writeln("Anulado");
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
				Interval intersection = interval.intersection(ServicesContract.PRESET_INTERVAL);
				if (intersection != null) {
					presetHours = intersection.length();
					cost += presetHours * ServicesContract.PRESET_COST_PER_HOUR;
				}
				cost += (interval.length() - presetHours)
						* ServicesContract.EXTRAORDINARY_COST_PER_HOUR;
			}
		}
		return cost;
	}

}
