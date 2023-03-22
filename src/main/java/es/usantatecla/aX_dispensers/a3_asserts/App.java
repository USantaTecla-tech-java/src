package es.usantatecla.aX_dispensers.a3_asserts;

public class App {

	public static void main(String[] args){
		new App().exec();
	}

	private Console console;

	public App() {
		this.console = new Console();
	}

	public void exec() {
		this.exampleBoundedQueue();
		this.exampleBoundedStack();
		this.exampleUnboundedQueue();
		this.exampleUnboundedStack();
	}

	private void exampleBoundedQueue() {
		this.console.writeln("======= BoundedQueue");
		this.console.writeln("------- Vacío");
		BoundedQueue dispenser = new BoundedQueue(10);
		this.writeln(dispenser.getElements());

		this.console.writeln("------- Metemos 10");
		for (int i = 0; i < 10; i++) {
			dispenser.add(new Interval(-i, i));
		}
		this.writeln(dispenser.getElements());
		
		this.console.writeln("------- Sacamos 5");
		for (int i = 0; i < 5; i++) {
			dispenser.remove();
		}
		this.writeln(dispenser.getElements());

		this.console.writeln("------- Metemos 3");
		for (int i = 0; i < 3; i++) {
			dispenser.add(new Interval(-100, 100));
		}
		this.writeln(dispenser.getElements());
	}

	private void writeln(Interval[] elements) {
		int position = 1;
		for(Interval interval : elements){
			this.console.writeln(position + ": " + interval.toString());
			position++;
		}
	}

	private void exampleBoundedStack() {
		this.console.writeln("======= BoundedStack");
		this.console.writeln("------- Vacío");
		BoundedStack dispenser = new BoundedStack(10);
		this.writeln(dispenser.getElements());

		this.console.writeln("------- Metemos 10");
		for (int i = 0; i < 10; i++) {
			dispenser.add(new Interval(-i, i));
		}
		this.writeln(dispenser.getElements());
		
		this.console.writeln("------- Sacamos 5");
		for (int i = 0; i < 5; i++) {
			dispenser.remove();
		}
		this.writeln(dispenser.getElements());

		this.console.writeln("------- Metemos 3");
		for (int i = 0; i < 3; i++) {
			dispenser.add(new Interval(-100, 100));
		}
		this.writeln(dispenser.getElements());
	}

	private void exampleUnboundedQueue() {
		this.console.writeln("======= UnboundedQueue");
		this.console.writeln("------- Vacío");
		UnboundedQueue dispenser = new UnboundedQueue();
		this.writeln(dispenser.getElements());

		this.console.writeln("------- Metemos 10");
		for (int i = 0; i < 10; i++) {
			dispenser.add(new Interval(-i, i));
		}
		this.writeln(dispenser.getElements());
		
		this.console.writeln("------- Sacamos 5");
		for (int i = 0; i < 5; i++) {
			dispenser.remove();
		}
		this.writeln(dispenser.getElements());

		this.console.writeln("------- Metemos 3");
		for (int i = 0; i < 3; i++) {
			dispenser.add(new Interval(-100, 100));
		}
		this.writeln(dispenser.getElements());
	}

	private void exampleUnboundedStack() {
		this.console.writeln("======= UnboundedStack");
		this.console.writeln("------- Vacío");
		UnboundedStack dispenser = new UnboundedStack();
		this.writeln(dispenser.getElements());

		this.console.writeln("------- Metemos 10");
		for (int i = 0; i < 10; i++) {
			dispenser.add(new Interval(-i, i));
		}
		this.writeln(dispenser.getElements());
		
		this.console.writeln("------- Sacamos 5");
		for (int i = 0; i < 5; i++) {
			dispenser.remove();
		}
		this.writeln(dispenser.getElements());

		this.console.writeln("------- Metemos 3");
		for (int i = 0; i < 3; i++) {
			dispenser.add(new Interval(-100, 100));
		}
		this.writeln(dispenser.getElements());
	}

}
