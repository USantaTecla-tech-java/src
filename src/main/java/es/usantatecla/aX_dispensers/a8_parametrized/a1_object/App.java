package es.usantatecla.aX_dispensers.a8_parametrized.a1_object;

import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Console;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Fraction;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Interval;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Iterator;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.DispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.FullDispenserException;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers.BoundedQueue;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.boundedDispensers.BoundedStack;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers.UnboundedQueue;
import es.usantatecla.aX_dispensers.a8_parametrized.a1_object.dispensers.unboundedDispensers.UnboundedStack;

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
				new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 
				new Integer[] { -2, -1, 0, 1, 2 });

		App.sumFractions(App.getFractionBoundedQueue());
		App.sumInts(App.getIntBoundedQueue());
		try {
			BoundedQueue boundedQueue = new BoundedQueue(1);
			boundedQueue.add(2);
			// boundedQueue.add(new Fraction(1, 2));
			int element = (int) boundedQueue.remove();
			Console.getInstance().writeln(element);
		} catch (DispenserException e) {
			e.printStackTrace();
		}
	}

	private static <E> void exampleParametrized(E[] in10, E[] in5) {
		App.examplePolymorphic(new BoundedQueue(3), in10, in5);
		App.examplePolymorphic(new BoundedStack(3), in10, in5);
		App.examplePolymorphic(new UnboundedQueue(), in10, in5);
		App.examplePolymorphic(new UnboundedStack(), in10, in5);
	}

	private static void examplePolymorphic(Dispenser dispenser, Object[] in10, Object[] in5) {
		Console.getInstance().writeln("======= Vacío");
		App.writelnDispenser(dispenser.getIterator());

		Console.getInstance().writeln("------- Metemos 10");
		try {
			for (Object element : in10) {
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
			for (Object element : in5) {
				dispenser.add(element);
			}
		} catch (FullDispenserException ex) {
			Console.getInstance().writeln("!!! Dispensador lleno, seguimos");
		}
		App.writelnDispenser(dispenser.getIterator());
	}

	private static void writelnDispenser(Iterator iterator) {
		int position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}
	}

	private static BoundedQueue getFractionBoundedQueue() {
		try {
			BoundedQueue boundedQueue = new BoundedQueue(5);
			boundedQueue.add(new Fraction(1, 2));
			boundedQueue.add(new Fraction(1, 2));
			return boundedQueue;
		} catch (FullDispenserException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private static Fraction sumFractions(BoundedQueue boundedQueue) {
		assert boundedQueue != null;

		Fraction acum = new Fraction(0);
		try {
			while (boundedQueue.isEmpty()) {
				acum = acum.add((Fraction) boundedQueue.remove());
			}
		} catch (EmptyDispenserException ex) {
			ex.printStackTrace();
		}
		return acum;
	}

	private static BoundedQueue getIntBoundedQueue() {
		try {
			BoundedQueue boundedQueue = new BoundedQueue(5);
			boundedQueue.add(1);
			boundedQueue.add(1);
			return boundedQueue;
		} catch (FullDispenserException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private static int sumInts(BoundedQueue boundedQueue) {
		assert boundedQueue != null;

		int acum = 0;
		try {
			while (boundedQueue.isEmpty()) {
				acum += (int) boundedQueue.remove();
			}
		} catch (EmptyDispenserException ex) {
			ex.printStackTrace();
		}
		return acum;
	}

}
