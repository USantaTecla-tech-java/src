package es.usantatecla.aX_listas.a5_parametrized3;

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

        List<Fraction> fractionList = new List<Fraction>();
        fractionList.add(new Fraction(1, 2));
        fractionList.add(new Fraction(1, 3));
        fractionList.add(new Fraction(2, 3));
        Console.getInstance().writeln("La lista resultado de unir " +
                numberList + " y " + fractionList + " es ");
        numberList.addAll(fractionList);
        Console.getInstance().writeln(""+numberList);

        List<Double> doubleGreaters = integerList.greaters(doubleList);
        Console.getInstance().writeln("Los elementos de " + doubleList +
                " mayores que " + integerList + " son " + doubleGreaters);

        List<Integer> integerGreaters = doubleList.greaters(integerList);
        Console.getInstance().writeln("Los elementos de " + integerList +
                " mayores que " + doubleList + " son " + integerGreaters);
    }

}
