package es.usantatecla.aX_dispensers.a7_modular;

import es.usantatecla.aX_dispensers.a7_modular.dispensers.Dispenser;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.EmptyDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.FullDispenserException;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers.BoundedQueue;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.boundedDispensers.BoundedStack;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.unboundedDispensers.UnboundedQueue;
import es.usantatecla.aX_dispensers.a7_modular.dispensers.unboundedDispensers.UnboundedStack;
import es.usantatecla.aX_dispensers.a7_modular.utils.Console;
import es.usantatecla.aX_dispensers.a7_modular.utils.Interval;
import es.usantatecla.aX_dispensers.a7_modular.utils.Iterator;

public class App {

	public static void main(String[] args) {
		App.examplePolymorphic(new BoundedQueue(3));
		App.examplePolymorphic(new BoundedStack(3));
		App.examplePolymorphic(new UnboundedQueue());
		App.examplePolymorphic(new UnboundedStack());
	}

	private static void examplePolymorphic(Dispenser dispenser) {
		Console.getInstance().writeln("======= Vacío");
		App.writelnDispenser(dispenser.getIterator());

		Console.getInstance().writeln("------- Metemos 10");
		try {
			for (int i = 0; i < 10; i++) {
				dispenser.add(new Interval(-i, i));
			}
		} catch (FullDispenserException ex){
			Console.getInstance().writeln("Dispensador lleno, seguimos");
		}
		App.writelnDispenser(dispenser.getIterator());

		Console.getInstance().writeln("------- Sacamos 5");
		try {
			for (int i = 0; i < 5; i++) {
				dispenser.remove();
			}
		} catch (EmptyDispenserException ex){
			Console.getInstance().writeln("!!! Dispensador vacío, seguimos");
		}
		App.writelnDispenser(dispenser.getIterator());

		Console.getInstance().writeln("------- Metemos 5");
		try {
			for (int i = 0; i < 5; i++) {
				dispenser.add(new Interval(-100, 100));
			}
		} catch (FullDispenserException ex){
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

}
