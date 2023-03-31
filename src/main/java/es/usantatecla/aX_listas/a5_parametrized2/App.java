package es.usantatecla.aX_listas.a5_parametrized2;

public class App {
    public static void main(String[] args) {
        List<Integer> integerList = new List<Integer>();
        integerList.add(Integer.valueOf(1));
        integerList.add(Integer.valueOf(2));
        integerList.add(Integer.valueOf(3));

        List<Double> doubleList = new List<Double>();
        doubleList.add(Double.valueOf(0.5));
        doubleList.add(Double.valueOf(2.7));
        doubleList.add(Double.valueOf(3.1));

        List<Fraction> fractionList = new List<Fraction>();
        fractionList.add(new Fraction(1, 2));
        fractionList.add(new Fraction(1, 3));
        fractionList.add(new Fraction(2, 3));

        Console.getInstance().writeln("La suma de los elementos de " +
                integerList + " y " + doubleList + " es " +
                integerList.sum(doubleList));
        Console.getInstance().writeln("La suma de los elementos de " +
                doubleList + " y " + integerList + " es " +
                doubleList.sum(integerList));
        Console.getInstance().writeln("Son iguales = " +
                (integerList.sum(doubleList) == doubleList.sum(integerList)));
        
        List<Number> numberList = new List<Number>();
        numberList.addAll(integerList);
        numberList.addAll(doubleList);
        Console.getInstance().writeln("La lista resultado de unir " +
                integerList + " y " + doubleList + " es " + numberList);

        Console.getInstance().writeln("!!!! " + numberList.sum(fractionList));
        Console.getInstance().writeln("La lista resultado de unir " +
                numberList + " y " + fractionList + " es ");
        numberList.addAll(fractionList);
        Console.getInstance().writeln(""+numberList);
        // explanation();
    }

    private static void explanation() {
        List<Double> doubleList = new List<Double>();
        // List<Number> numberList = doubleList; // !!!ERROR
        // numberList.add(Integer.valueOf(3));
        Double value = doubleList.get(0);

        // Se podria omitir extends Number
        List<? extends Number> numberList = doubleList; 
        // numberList.add(new Double(3)); // !!!ERROR
        // Number numero = new Double(3);
        // numberList.add(numero); // !!!ERROR
        // Double x1 = numberList.get(0); // !!!ERROR

        Number number = numberList.get(0);
        String string = numberList.toString();
        numberList.clear(); 
        string = numberList.toString();
    }
}
