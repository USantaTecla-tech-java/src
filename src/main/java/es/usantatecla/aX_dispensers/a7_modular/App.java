package es.usantatecla.aX_dispensers.a7_modular;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers.BoundedQueue;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers.BoundedStack;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers.FullDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.unboundedDispensers.UnboundedQueue;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.unboundedDispensers.UnboundedStack;
import es.usantatecla.aX_dispensers.a7_modular.utils.Console;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;

public class App {

	public static void main(String[] args) {
		App.example(new BoundedQueue(3), "BoundedQueue");
		App.example(new BoundedStack(3), "BoundedStack");
		App.example(new UnboundedQueue(), "UnboundedQueue");
		App.example(new UnboundedStack(), "UnboundedStack");
	}

	private static void example(Dispenser dispenser, String title) {
		Console.getInstance().writeln("======= " + title);
		Console.getInstance().writeln("------- Vacío");
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 10");
		for (int i = 0; i < 10; i++) {
			try {
				dispenser.add(new Interval(-i, i));
			} catch (FullDispenserException e) {
				Console.getInstance().writeln("No caben pero seguimos!!!");
				e.recover();
			}
		}
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Sacamos 5");
		for (int i = 0; i < 5; i++) {
			try {
				dispenser.remove();
			} catch (EmptyDispenserException e) {
				Console.getInstance().writeln("No hay pero seguimos!!!");
			}
		}
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 3");
		for (int i = 0; i < 3; i++) {
			try {
				dispenser.add(new Interval(-100, 100));
			} catch (FullDispenserException e) {
				Console.getInstance().writeln("No caben pero seguimos!!!");
				e.recover();
			}
		}
		App.writeln(dispenser.getElements());
	}

	private static void writeln(Interval[] elements) {
		int position = 1;
		for (Interval interval : elements) {
			Console.getInstance().writeln(position + ": " + interval.toString());
			position++;
		}
	}

}
