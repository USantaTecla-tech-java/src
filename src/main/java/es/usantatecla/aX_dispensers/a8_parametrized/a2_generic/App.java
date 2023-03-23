package es.usantatecla.aX_dispensers.a8_parametrized.a2_generic;

import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Console;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Fraction;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Interval;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.utils.Iterator;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.DispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.FullDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers.BoundedQueue;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.boundedDispensers.BoundedStack;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.unboundedDispensers.UnboundedQueue;
import es.usantatecla.aX_dispensers.a8_parametrized.a2_generic.dispensers.unboundedDispensers.UnboundedStack;

public class App {

	public static void main(String[] args) {
		Interval[] in10 = new Interval[10];
		for (int i = 0; i < 10; i++) {
			in10[i] = new Interval(-i, i);
		}
		Interval[] in5 = new Interval[5];
		for (int i = 0; i < 5; i++) {
			in5[i] = new Interval(-100, 100);
		}
		App.exampleParametrized(in10, in5);

		Fraction[] fraction10 = new Fraction[10];
		for (int i = 0; i < 10; i++) {
			fraction10[i] = new Fraction(-i, i + 1);
		}
		Fraction[] fraction5 = new Fraction[5];
		for (int i = 0; i < 5; i++) {
			fraction5[i] = new Fraction(-100, 100);
		}
		App.exampleParametrized(fraction10, fraction5);
		App.exampleParametrized(
				new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, new Integer[] { -2, -1, 0, 1, 2 });

		App.sumFractions(App.getFractionBoundedQueue());
		App.sumInts(App.getIntBoundedQueue());
		try {
			BoundedQueue<Integer> boundedQueue = new BoundedQueue<Integer>(1);
			boundedQueue.add(2);
			// boundedQueue.add(new Fraction(1, 2)); No compila!!!
			int element = boundedQueue.remove();
			Console.getInstance().writeln(element);
		} catch (DispenserException e) {
			e.printStackTrace();
		}
	}

	private static <E> void exampleParametrized(E[] in10, E[] in5) {
		App.examplePolymorphic(new BoundedQueue<E>(3), in10, in5);
		App.examplePolymorphic(new BoundedStack<E>(3), in10, in5);
		App.examplePolymorphic(new UnboundedQueue<E>(), in10, in5);
		App.examplePolymorphic(new UnboundedStack<E>(), in10, in5);
	}

	private static <E> void examplePolymorphic(Dispenser<E> dispenser, E[] in10, E[] in5) {
		Console.getInstance().writeln("======= Vacío");
		App.writelnDispenser(dispenser.getIterator());

		Console.getInstance().writeln("------- Metemos 10");
		try {
			for (E element : in10) {
				dispenser.add(element);
			}
		} catch (FullDispenserException ex) {
			Console.getInstance().writeln("Dispensador lleno, seguimos");
		}
		App.writelnDispenser(dispenser.getIterator());

		Console.getInstance().writeln("------- Sacamos 5");
		try {
			for (int i = 0; i < 5; i++) {
				dispenser.remove();
			}
		} catch (EmptyDispenserException ex) {
			Console.getInstance().writeln("!!! Dispensador vacío, seguimos");
		}
		App.writelnDispenser(dispenser.getIterator());

		Console.getInstance().writeln("------- Metemos 5");
		try {
			for (E element : in5) {
				dispenser.add(element);
			}
		} catch (FullDispenserException ex) {
			Console.getInstance().writeln("!!! Dispensador lleno, seguimos");
		}
		App.writelnDispenser(dispenser.getIterator());
	}

	private static <E> void writelnDispenser(Iterator<E> iterator) {
		int position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}
	}

	private static BoundedQueue<Fraction> getFractionBoundedQueue() {
		BoundedQueue<Fraction> boundedQueue = new BoundedQueue<Fraction>(5);
		try {
			boundedQueue.add(new Fraction(1, 2));
			boundedQueue.add(new Fraction(1, 2));
		} catch (FullDispenserException ex) {
			ex.printStackTrace();
		}
		return boundedQueue;
	}

	private static Fraction sumFractions(BoundedQueue<Fraction> boundedQueue) {
		assert boundedQueue != null;

		Fraction acum = new Fraction(0);
		try {
			while (boundedQueue.isEmpty()) {
				acum = acum.add(boundedQueue.remove());
			}
		} catch (EmptyDispenserException ex) {
			ex.printStackTrace();
		}
		return acum;
	}

	private static BoundedQueue<Integer> getIntBoundedQueue() {
		try {
			BoundedQueue<Integer> boundedQueue = new BoundedQueue<Integer>(5);
			boundedQueue.add(1);
			boundedQueue.add(1);
			return boundedQueue;
		} catch (FullDispenserException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private static int sumInts(BoundedQueue<Integer> boundedQueue) {
		assert boundedQueue != null;

		int acum = 0;
		try {
			while (boundedQueue.isEmpty()) {
				acum += boundedQueue.remove();
			}
		} catch (EmptyDispenserException ex) {
			ex.printStackTrace();
		}
		return acum;
	}

}
