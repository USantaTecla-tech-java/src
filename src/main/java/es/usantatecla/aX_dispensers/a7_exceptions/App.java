package es.usantatecla.aX_dispensers.a7_exceptions;

public class App {

	public static void main(String[] args) {
		App.examplePolymorphic(new BoundedQueue(3));
		App.examplePolymorphic(new BoundedStack(3));
		App.examplePolymorphic(new UnboundedQueue());
		App.examplePolymorphic(new UnboundedStack());
	}

	private static void examplePolymorphic(Dispenser dispenser) {
		Console.getInstance().writeln("=======");
		App.writelnDispenser(dispenser.getIterator());

		try {
			for (int i = 0; i < 10; i++) {
				dispenser.add(new Interval(-i, i));
			}
		} catch (FullDispenserException ex){
			Console.getInstance().writeln("Dispensador lleno, seguimos");
		}
		Console.getInstance().writeln("-------");
		App.writelnDispenser(dispenser.getIterator());

		try {
			for (int i = 0; i < 5; i++) {
				dispenser.remove();
			}
		} catch (EmptyDispenserException ex){
			Console.getInstance().writeln("Dispensador vacío, seguimos");
		}
		try {
			for (int i = 0; i < 5; i++) {
				dispenser.add(new Interval(-100, 100));
			}
		} catch (FullDispenserException ex){
			Console.getInstance().writeln("Dispensador lleno, seguimos");
		}
		Console.getInstance().writeln("-------");
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
