package es.usantatecla.a5_units.a3_date.a2_statics;

class Format {

	public static final Format SPANISH = new Format();
	public static final Format ENGLISH = new Format();

	String toString(Date date) {
		if (this == Format.SPANISH) {
				return date.getDay() + " de " +
						date.getMonth().getName(this) + " de " +
						date.getYear();
		} 
		if (this == Format.ENGLISH){
			return date.getMonth().getName(this) + ", " +
			date.getDay() + "th " +
			date.getYear();
		}
		return null;
	}

  public int ordinal() {
    return 0;
  }
}
