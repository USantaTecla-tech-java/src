package es.usantatecla.a5_units.a3_date.a2_statics;

class Month {

	public static final Month JANUARY = new Month(31, new String[] {"Enero", "January"});
	public static final Month FEBRUARY = new Month(28, new String[] {"Febrero", "February"});
	public static final Month MARCH = new Month(31, new String[] {"Marzo", "March"});
	public static final Month APRIL = new Month(30, new String[] {"Abril", "April"});
	public static final Month MAY = new Month(31, new String[] {"Mayo", "May"});
	public static final Month JUNE = new Month(30, new String[] {"Junio", "June"});
	public static final Month JULY = new Month(31, new String[] {"Julio", "July"});
	public static final Month AUGUST = new Month(31, new String[] {"Agosto", "August"});
	public static final Month SEPTEMBER = new Month(30, new String[] {"Septiembre", "September"});
	public static final Month OCTOBER = new Month(31, new String[] {"Octubre", "October"});
	public static final Month NOVEMBER = new Month(30, new String[] {"Noviembre", "November"});
	public static final Month DECEMBER = new Month(31, new String[] {"Diciembre", "December"});

	private int days;
	private String[] names;

	private Month(int days, String[] names) {
		this.days = days;
		this.names = names;
	}

	public int getDays() {
		return days;
	}

	public static Month getMonth(int month) {
		return Month.values()[month - 1];
	}

	public static Month[] values() {
		return new Month[]{
			Month.JANUARY,
			Month.FEBRUARY,
			Month.MARCH,
			Month.APRIL,
			Month.MAY,
			Month.JUNE,
			Month.JULY,
			Month.AUGUST,
			Month.SEPTEMBER,
			Month.OCTOBER,
			Month.NOVEMBER,
			Month.DECEMBER
		};
	}

	public String getName(Format format) {
		return names[format.ordinal()];
	}

	public int ordinal(){
		for(int i=0; i< Month.values().length; i++){
			if (Month.values()[i] == this){
				return i;
			}
		}
		return -1;
	}

	public Month getNext() {
		return Month.values()[(this.ordinal() + 1) % Month.values().length];
	}

	public Month getPrevious() {
		if (this == Month.JANUARY) {
			return Month.DECEMBER;
		} else {
			return Month.values()[this.ordinal() - 1];
		}
	}
}
