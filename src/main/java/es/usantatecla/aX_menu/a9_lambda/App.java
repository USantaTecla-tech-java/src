package es.usantatecla.aX_menu.a9_lambda;

public class App {

  public static void main(String[] args) {

    class PopulatedModel extends Model {

      public PopulatedModel(){
        super();
        for (String string : new String[] { "Ana", "Beatriz", "Carmen" }) {
          this.add(string);
      }
      }
    }

    new ModelIterativeMenu(new PopulatedModel()).interact();
  }
  
}