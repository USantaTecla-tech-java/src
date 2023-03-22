package es.usantatecla.aX_dispensers.a5_extends_a1_node;

public class App {

	public static void main(String[] args){
		App.exampleBoundedQueue();
		App.exampleBoundedStack();
		App.exampleUnboundedQueue();
		App.exampleUnboundedStack();
	}

	private static void exampleBoundedQueue() {
		Console.getInstance().writeln("======= BoundedQueue");
		Console.getInstance().writeln("------- Vacío");
		BoundedQueue dispenser = new BoundedQueue(10);
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 10");
		for (int i = 0; i < 10; i++) {
			dispenser.add(new Interval(-i, i));
		}
		App.writeln(dispenser.getElements());
		
		Console.getInstance().writeln("------- Sacamos 5");
		for (int i = 0; i < 5; i++) {
			dispenser.remove();
		}
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 3");
		for (int i = 0; i < 3; i++) {
			dispenser.add(new Interval(-100, 100));
		}
		App.writeln(dispenser.getElements());
	}

	private static void writeln(Interval[] elements) {
		int position = 1;
		for(Interval interval : elements){
			Console.getInstance().writeln(position + ": " + interval.toString());
			position++;
		}
	}

	private static void exampleBoundedStack() {
		Console.getInstance().writeln("======= BoundedStack");
		Console.getInstance().writeln("------- Vacío");
		BoundedStack dispenser = new BoundedStack(10);
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 10");
		for (int i = 0; i < 10; i++) {
			dispenser.add(new Interval(-i, i));
		}
		App.writeln(dispenser.getElements());
		
		Console.getInstance().writeln("------- Sacamos 5");
		for (int i = 0; i < 5; i++) {
			dispenser.remove();
		}
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 3");
		for (int i = 0; i < 3; i++) {
			dispenser.add(new Interval(-100, 100));
		}
		App.writeln(dispenser.getElements());
	}

	private static void exampleUnboundedQueue() {
		Console.getInstance().writeln("======= UnboundedQueue");
		Console.getInstance().writeln("------- Vacío");
		UnboundedQueue dispenser = new UnboundedQueue();
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 10");
		for (int i = 0; i < 10; i++) {
			dispenser.add(new Interval(-i, i));
		}
		App.writeln(dispenser.getElements());
		
		Console.getInstance().writeln("------- Sacamos 5");
		for (int i = 0; i < 5; i++) {
			dispenser.remove();
		}
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 3");
		for (int i = 0; i < 3; i++) {
			dispenser.add(new Interval(-100, 100));
		}
		App.writeln(dispenser.getElements());
	}

	private static void exampleUnboundedStack() {
		Console.getInstance().writeln("======= UnboundedStack");
		Console.getInstance().writeln("------- Vacío");
		UnboundedStack dispenser = new UnboundedStack();
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 10");
		for (int i = 0; i < 10; i++) {
			dispenser.add(new Interval(-i, i));
		}
		App.writeln(dispenser.getElements());
		
		Console.getInstance().writeln("------- Sacamos 5");
		for (int i = 0; i < 5; i++) {
			dispenser.remove();
		}
		App.writeln(dispenser.getElements());

		Console.getInstance().writeln("------- Metemos 3");
		for (int i = 0; i < 3; i++) {
			dispenser.add(new Interval(-100, 100));
		}
		App.writeln(dispenser.getElements());
	}

}
