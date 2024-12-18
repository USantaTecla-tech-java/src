package es.usantatecla.aX_menu.a6_inner;

public class App {

  static class PopulatedModel extends Model {

    public PopulatedModel() {
      super();
      for (String string : new String[] { "Ana", "Beatriz", "Carmen" }) {
        this.add(string);
      }
    }
  }

  public static void main(String[] args) {
    new ModelIterativeMenu(new PopulatedModel()).interact();
  }

}
