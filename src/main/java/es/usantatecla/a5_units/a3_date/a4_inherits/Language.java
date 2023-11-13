package es.usantatecla.a5_units.a3_date.a4_inherits;

enum Language {
  SPANISH{
      public String getText(int day, String month, int year) {
        return "el " + day + " de " + month + " de " + year;
    }
  },
  ENGLISH{
      public String getText(int day, String month, int year) {
        return month + " " + day + "th, " + year;
    }
  };

  public abstract String getText(int day, String month, int year);

  public static void main(String[] args){
    for(Language current : Language.values()){
      Console.instance().writeln(current.getText(23, "#mes/month#", 2020));
    }
  }
  
}
