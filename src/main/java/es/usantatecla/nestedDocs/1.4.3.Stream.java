package es.usantatecla.nestedDocs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

// 3. Streams

// Secuencia de valores constantes de un solo procesamiento secuencial
// Todo igual para Stream como para IntStream, LongStream, DoubleStream
// A partir de Collection .stream()

// 3.1. Optional

class OptionalApp {

  public static void main(String[] args) {

    Optional<Integer> optional = Optional.of(666);
    Optional<Integer> emptyOptional = Optional.empty();
    Optional<Integer> nullOptional = Optional.of(null);
    Optional<Integer> nullableOptional = Optional.ofNullable(null);

    OptionalApp.test(optional);
    OptionalApp.test(emptyOptional);
    OptionalApp.test(nullOptional);
    OptionalApp.test(nullableOptional);
  }

  private static <T> void test(Optional<T> optional) {
    if (optional.isPresent()) {
      Console.getInstance().writeln("Presente: " + optional.get());
    }
    if (optional.isEmpty()) {
      Console.getInstance().writeln("Vacío");
    } else {
      Console.getInstance().writeln("Presente: " + optional.get());
    }

    optional.ifPresent(
        (T element) -> Console.getInstance().writeln("Presente: " + element.toString()));
    optional.ifPresentOrElse(
        (T element) -> Console.getInstance().writeln("Presente: " + element.toString()),
        () -> Console.getInstance().writeln("Vacío!!!"));

    // optional.filter()
    // optional.map()
    // optional.flatMap()

  }
}

// 3.2. Métodos

class StreamApp {

  public static void main(String[] args) {
    StreamApp.test(Arrays.asList(5, 8, -2, 6, 7, 9, -1, 3, 4, 10));
    StreamApp.test(new HashSet<Integer>());
    // StreamApp.test(Stream.generate(() -> new Random().nextInt()).limit(5).collect(Collectors.toList()));
  }

  private static void test(Collection<Integer> collection) {

    // metodos finales
    Console.getInstance().writeln("\nCantidad: " + collection.stream()
        .count());
    Console.getInstance().writeln("\nSon todos positivos?: " + collection.stream()
        .allMatch(integer -> integer > 0));
    Console.getInstance().writeln("\nEs alguno decena?: " + collection.stream()
        .anyMatch(integer -> integer >= 10));
    Console.getInstance().writeln("\nNinguno es negativo?: " + collection.stream()
        .noneMatch(integer -> integer < 0));
    collection.stream()
        .findFirst().ifPresentOrElse(
            (Integer integer) -> Console.getInstance().writeln("\nPrimero: " + integer),
            () -> Console.getInstance().writeln("Vacío!!!"));
    collection.stream()
        .findAny().ifPresentOrElse(
            (Integer integer) -> Console.getInstance().writeln("nAlguno: " + integer),
            () -> Console.getInstance().writeln("Vacío!!!"));
    collection.stream()
        .reduce((left, right) -> left + right).ifPresentOrElse(
            (Integer integer) -> Console.getInstance().writeln("nSuma: " + integer),
            () -> Console.getInstance().writeln("Vacío!!!"));
    Console.getInstance().writeln("nSuma: " + collection.stream()
        .reduce(0, (left, right) -> left + right));

    // métodos intermedios
    Console.getInstance().writeln("\nValores: " + collection.stream()
        .map(integer -> "" + integer + ", ")
        .reduce((left, right) -> left + right));
    Console.getInstance().writeln("\nPositivos: " + collection.stream()
        .filter((integer) -> integer > 0)
        .map(integer -> "" + integer + ", ")
        .reduce((left, right) -> left + right));

    // flujos de enteros (como para long y double)
    Console.getInstance().writeln("\nSuma: " + collection.stream()
        .mapToInt(integer -> integer).sum());
    collection.stream()
        .mapToInt(integer -> integer).average().ifPresentOrElse(
            (integer) -> Console.getInstance().writeln("\nMedia: " + integer),
            () -> Console.getInstance().writeln("Vacío!!!"));
    collection.stream()
        .mapToInt(integer -> integer).min().ifPresentOrElse(
            (integer) -> Console.getInstance().writeln("\nMinimo: " + integer),
            () -> Console.getInstance().writeln("Vacío!!!"));
    collection.stream().mapToInt(integer -> integer)
        .max().ifPresentOrElse(
            (integer) -> Console.getInstance().writeln("\nMáximo: " + integer),
            () -> Console.getInstance().writeln("Vacío!!!"));
  }
}

// foreach
// foreachOrdered
// peek
// distinc
// limit
// range
// skip
// iterate(min, max)
// string.chars
// reader.lines
// random.ints

// Ej. Intervals

class IntervalApp {
  public static void main(String[] arg) {
    List<Interval<Integer>> intervals = IntervalApp.createRandom();

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

    BinaryOperator<Interval<Integer>> unionOperator = (accumulator, interval) -> accumulator.union(interval);

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

