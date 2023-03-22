package es.usantatecla.aX_dispensers.a5_extends_a2_dispenser;

public class App {

	public static void main(String[] args){
		App.example(new BoundedQueue(10),"BoundedQueue");
		App.example(new BoundedStack(10),"BoundedStack");
		App.example(new UnboundedQueue(),"UnboundedQueue");
		App.example(new UnboundedStack(),"UnboundedStack");
	}

	private static void example(Dispenser dispenser, String title) {
		Console.getInstance().writeln("======= " + title);
		Console.getInstance().writeln("------- Vacío");
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

}
