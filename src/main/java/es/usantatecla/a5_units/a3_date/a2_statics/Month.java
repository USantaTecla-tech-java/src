package es.usantatecla.a5_units.a3_date.a2_statics;

class Month {

  public static final Month JANUARY = new Month(31, new String[] { "enero", "january" });
  public static final Month FEBRUARY = new Month(28, new String[] { "febrero", "february" });
  public static final Month MARCH = new Month(31, new String[] { "marzo", "march" });
  public static final Month APRIL = new Month(30, new String[] { "abril", "april" });
  public static final Month MAY = new Month(31, new String[] { "mayo", "may" });
  public static final Month JUNE = new Month(30, new String[] { "junio", "june" });
  public static final Month JULY = new Month(31, new String[] { "julio", "july" });
  public static final Month AUGUST = new Month(31, new String[] { "agosto", "august" });
  public static final Month SEPTEMBER = new Month(30, new String[] { "septiembre", "september" });
  public static final Month OCTOBER = new Month(31, new String[] { "octubre", "october" });
  public static final Month NOVEMBER = new Month(30, new String[] { "noviembre", "november" });
  public static final Month DECEMBER = new Month(31, new String[] { "diciembre", "december" });

  public static Month[] values(){
    return new Month[]{Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.MAY,
      Month.JUNE, Month.JULY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER,
      Month.NOVEMBER, Month.DECEMBER};
  }

  public int ordinal() {
    for(int i=0; i< Month.values().length; i++){
      if (Month.values()[i] == this){
        return i;
      }
    }
    assert false;
    return -1;
  }

  private int maxLength;
  private String[] names;

  private Month(int maxLength, String[] names) {
    assert 28 <= maxLength && maxLength <= 31;
    assert names != null && names.length == Language.values().length;

    this.maxLength = maxLength;
    this.names = names;
  }

  public static Month of(int month) {
    assert 0 <= month && month <= Month.values().length;

    return Month.values()[month - 1];
  }

  public boolean isEqual(Month month) {
    return this.ordinal() == month.ordinal();
  }

  public boolean isBefore(Month month) {
    return this.ordinal() < month.ordinal();
  }

  public boolean isAfter(Month month) {
    return month.isBefore(this) && !month.isEqual(this);
  }
  
  public Month plusMonth() {
    return Month.values()[(this.ordinal() + 1) % Month.values().length];
  }

  public Month plusMonths(int months) {
    Month month = this;
    for(int i=0; i<months; i++){
      month = month.plusMonth();
    }
    return month;
  }

  public Month minusMonth() {
    if (this == Month.JANUARY) {
      return Month.DECEMBER;
    } 
    return Month.values()[this.ordinal() - 1];
  }

  public Month minusMonths(int months) {
    Month month = this;
    for(int i=0; i<months; i++){
      month = month.minusMonth();
    }
    return month;
  }

  public String getName(Language language) {
    return this.names[language.ordinal()];
  }
  
  public int getMaxLength() {
    return maxLength;
  }

  public int getMaxLength(int year) {
    int maxLength = this.getMaxLength();
    if (Date.isLeap(year)){
      maxLength++;
    }
    return maxLength;
  }

  public static void main(String[] args){
    final int YEAR = (int) (Math.random() * 2020);
    final String[] BEGIN_PREFFIX = new String[]{"Empieza", "Begin"}; 
    final String[] END_PREFFIX = new String[]{"Termina", "End"};
    for(Month current : Month.values()){
      String msg = "";
      for(Language language : Language.values()){
          msg += Month.of(current.ordinal()+1).getName(language) + "\n";
          msg += BEGIN_PREFFIX[language.ordinal()] + ": " +  
            Date.of(1, current, YEAR).getText(language) + "\n";
          msg += END_PREFFIX[language.ordinal()] + ": " +  
          Date.of(current.getMaxLength(YEAR), current, YEAR).getText(language) + "\n";
        }
        msg += "Longitud: " + current.getMaxLength() + "\n";
        msg += "Siguiente: " + current.plusMonth().getName(Language.SPANISH) + "\n";
        msg += "Siguiente 3: " + current.plusMonths(3).getName(Language.SPANISH) + "\n";
        msg += "Anterior: " + current.minusMonth().getName(Language.SPANISH) + "\n";
        msg += "Anterior 3: " + current.minusMonths(3).getName(Language.SPANISH) + "\n";
        msg += "Anterior a junio: " + current.isBefore(Month.JUNE) + "\n";
        msg += "Igual a junio: " + current.isEqual(Month.JUNE) + "\n";
        msg += "Posterior a junio: " + current.isAfter(Month.JUNE) + "\n";
        Console.instance().writeln(msg);
    }
  }

}