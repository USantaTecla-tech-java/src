package es.usantatecla.nestedDocs;

// 3. Streams

// Secuencia de valores constantes de un solo procesamiento secuencial
// Todo igual para Stream como para IntStream, LongStream, DoubleStream
// A partir de Collection .stream()

// 3.1. Métodos de instancia

// 3.1.2. Métodos intermedios 
// map
// peek
// filter
// distinc
// limit
// range
// skip

// 3.1.3. Metodos terminales
// count
// findFirst, findAny, 
// anyMatch, allMatch, NoneMatch
// min, max
// reduce 
// mapToInt, toArray
// Collectors.toList()
// foreach
// foreachOrdered
// average
// sum

// 3.2. Métodos estáticos
// empty
// iterate(min, max)
// generate(random)
// string.chars
// reader.lines
// random.ints

// 3.3. Desde Stream

// 3.4. Desde arrays

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class StreamApp {
  public static void main(String[] arg) {
    List<Interval<Integer>> intervals = StreamApp.createRandom();

    intervals.stream().forEach(
        (interval) -> {
          Console.getInstance().writeln(": " + interval);
        });

    final Interval<Integer> intersection = intervals.stream().reduce(
        intervals.get(0),
        (accumulator, interval) -> accumulator.intersection(interval));

    List<Interval<Integer>> leftOversIntervals = intervals.stream()
        .map((interval) -> interval.leftOver(intersection))
        .collect(Collectors.toList());

    List<Interval<Integer>> rightOversIntervals = intervals.stream()
        .map((interval) -> interval.rightOver(intersection))
        .collect(Collectors.toList());

    BinaryOperator<Interval<Integer>> unionOperator = 
        (accumulator, interval) -> accumulator.union(interval);

    Console.getInstance().writeln(
        "izquierda: " + leftOversIntervals.stream()
            .reduce(leftOversIntervals.get(0), unionOperator) + "\n" +
            "intersección: " + intersection + "\n" +
            "derecha: " + rightOversIntervals.stream()
                .reduce(rightOversIntervals.get(0), unionOperator));
  }

  private static List<Interval<Integer>> createRandom() {
    List<Interval<Integer>> intervals = new ArrayList<Interval<Integer>>();
    Random random = new Random();
    int middlePoint = random.nextInt(10);
    for (int i = 0; i < 3; i++) {
      intervals.add(
          new Interval<Integer>(
              middlePoint - 1 - random.nextInt(5),
              middlePoint + 1 + random.nextInt(5)));
    }
    return intervals;
  }
}

// removeIf(Predicate<? super E> filter)

