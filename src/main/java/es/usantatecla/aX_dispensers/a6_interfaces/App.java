package es.usantatecla.aX_dispensers.a6_interfaces;

public class App {

	public static void main(String[] args) {
		App.examplePolymorphic(new BoundedQueue(10));
		App.examplePolymorphic(new BoundedStack(10));
		App.examplePolymorphic(new UnboundedQueue());
		App.examplePolymorphic(new UnboundedStack());
	}

	private static void examplePolymorphic(Dispenser dispenser) {
		Console.getInstance().writeln("=======");
		App.writelnDispenser(dispenser.getIterator());

		for (int i = 0; i < 10; i++) {
			dispenser.add(new Interval(-i, i));
		}
		Console.getInstance().writeln("-------");
		App.writelnDispenser(dispenser.getIterator());

		for (int i = 0; i < 5; i++) {
			dispenser.remove();
		}
		for (int i = 0; i < 3; i++) {
			dispenser.add(new Interval(-100, 100));
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
