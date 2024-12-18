package es.usantatecla.nestedDocs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collection;

// 2.Colecciones

class CollectionsApp {

  public static void main(String[] args) {
    Collection<Integer> collection = new ArrayList<Integer>();
    for (int integer : new int[] { -3, -2, -1, 0, 1, 2, 3 }) {
      collection.add(integer);
    }

    collection.forEach((integer) -> {
      Console.getInstance().writeln(integer);
    });
    collection.removeIf((integer) -> integer < 0);
    collection.forEach((integer) -> {
      Console.getInstance().writeln(integer);
    });
  }

}

class IntervalApp {

  public static void main(String[] arg) {
    IntervalApp.withoutLambda();
    IntervalApp.withLambda();
  }

  private static void withoutLambda() {
    List<Interval<Integer>> intervals = IntervalApp.createRandom();

    Interval<Integer> intersection = intervals.get(0);
    for (Interval<Integer> interval : intervals) {
      Console.getInstance().writeln(": " + interval);
      intersection = intersection.intersection(interval);
    }

    Interval<Integer> leftOversUnion = null;
    Interval<Integer> rightOversUnion = null;
    for (Interval<Integer> interval : intervals) {
      Interval<Integer> leftOver = interval.leftOver(intersection);
      leftOversUnion = leftOversUnion == null ? leftOver : leftOversUnion.union(leftOver);
      Interval<Integer> rightOver = interval.rightOver(intersection);
      rightOversUnion = rightOversUnion == null ? rightOver : rightOversUnion.union(rightOver);
    }

    Console.getInstance().writeln(
        "izquierda: " + leftOversUnion + "\n" +
            "intersección: " + intersection + "\n" +
            "derecha: " + rightOversUnion);
  }

  private static void withLambda() {
    List<Interval<Integer>> intervals = IntervalApp.createRandom();

    intervals.forEach((interval) -> {
      Console.getInstance().writeln(": " + interval);
    });

    Interval<Integer> intersection = intervals.get(0);
    // intervals.forEach((interval) -> {
    //  intersection = intersection.intersection(interval);
    // });
    for (Interval<Integer> interval : intervals) {
      intersection = intersection.intersection(interval);
    }

    Interval<Integer> leftOversUnion = null;
    Interval<Integer> rightOversUnion = null;
    // intervals.forEach((Interval<Integer> interval) -> {
    //  Interval<Integer> leftOver = interval.leftOver(intersection);
    //  leftOversUnion = leftOversUnion == null ? leftOver :
    //  leftOversUnion.union(leftOver);
    //  Interval<Integer> rightOver = interval.rightOver(intersection);
    //  rightOversUnion = rightOversUnion == null ? rightOver :
    //  rightOversUnion.union(rightOver);
    // });
    for (Interval<Integer> interval : intervals) {
      Interval<Integer> leftOver = interval.leftOver(intersection);
      leftOversUnion = leftOversUnion == null ? leftOver : leftOversUnion.union(leftOver);
      Interval<Integer> rightOver = interval.rightOver(intersection);
      rightOversUnion = rightOversUnion == null ? rightOver : rightOversUnion.union(rightOver);
    }

    Console.getInstance().writeln(
        "izquierda: " + leftOversUnion + "\n" +
            "intersección: " + intersection + "\n" +
            "derecha: " + rightOversUnion);
  }

  private static List<Interval<Integer>> createRandom() {
    ArrayList<Interval<Integer>> intervals = new ArrayList<Interval<Integer>>();
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