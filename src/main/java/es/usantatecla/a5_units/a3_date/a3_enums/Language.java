package es.usantatecla.a5_units.a3_date.a3_enums;

enum Language {
  SPANISH,
  ENGLISH;

  public String getText(int day, String month, int year) {
    switch (this) {
      case SPANISH:
        return "el " + day + " de " + month + " de " + year;
      case ENGLISH:
        return month + " " + day + "th, " + year;
      default:
        return "";
    }
  }

  public static void main(String[] args){
    for(Language current : Language.values()){
      Console.instance().writeln(current.getText(23, "#mes/month#", 2020));
    }
  }
  
}
