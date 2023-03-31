package es.usantatecla.aX_listas.a5_parametrized;

public class App {
  public static void main(String[] args) {
    List<Integer> integerList = new List<Integer>();
    integerList.add(Integer.valueOf(1));
    integerList.add(Integer.valueOf(2));
    integerList.add(Integer.valueOf(3));

    List<Double> doubleList = new List<Double>();
    doubleList.add(Double.valueOf(1.1));
    doubleList.add(Double.valueOf(2.2));
    doubleList.add(Double.valueOf(3.3));

    // System.out.println("La suma de los elementos de " +
    //     integerList + " y " + doubleList + " es " +
    //     integerList.sum(doubleList));
    // System.out.println("La suma de los elementos de " +
    //     doubleList + " y " + integerList + " es " +
    //     doubleList.sum(integerList));
    // System.out.println("Son iguales = " +
    //     (integerList.sum(doubleList) == doubleList.sum(integerList)));

    explanation();
  }

private static void explanation() {
    List<Double> doubleList = new List<Double>();
    // List<Number> numberList = doubleList; // !!!ERROR
    // numberList.add(Integer.valueOf(3));
    Double value = doubleList.get(0);
}

  
}
