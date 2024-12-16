package es.usantatecla.nestedDocs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 2.Colecciones

class CollectionsApp {

  public static void main(String[] arg) {
    List<Interval<Integer>> intervals = CollectionsApp.createRandom();

    for(Interval<Integer> interval : intervals){
          Console.getInstance().writeln(": " + interval);
    }
    
    Interval<Integer> intersection = intervals.get(0);
    for(Interval<Integer> interval : intervals){
      intersection = intersection.intersection(interval);
    }
  
    Interval<Integer> leftOversUnion = null;
    Interval<Integer> rightOversUnion = null;
    for(Interval<Integer> interval : intervals){
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