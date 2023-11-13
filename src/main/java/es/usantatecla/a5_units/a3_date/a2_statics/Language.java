package es.usantatecla.a5_units.a3_date.a2_statics;

class Language {

  public static final Language SPANISH = new Language();
  public static final Language ENGLISH = new Language();

  public static Language[] values() {
    return new Language[] { Language.SPANISH, Language.ENGLISH };
  }  
  
  public int ordinal() {
    for(int i=0; i< Month.values().length; i++){
      if (Language.values()[i] == this){
        return i;
      }
    }
    assert false;
    return -1;
  }

  public String getText(int day, String month, int year) {
    if (this == Language.SPANISH) {
      return "el " + day + " de " + month + " de " + year;
    }
    return month + " " + day + "th, " + year;
  }

  public static void main(String[] args) {
    for (Language current : Language.values()) {
      Console.instance().writeln(current.getText(23, "#mes/month#", 2020));
    }
  }

}
