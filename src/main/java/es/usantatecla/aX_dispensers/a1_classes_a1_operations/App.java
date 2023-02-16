package es.usantatecla.aX_dispensers.a1_classes_a1_operations;

public class App {

	public static void main(String[] args) {
		App.exampleBoundedQueue();
		App.exampleBoundedStack();
		App.exampleUnboundedQueue();
		App.exampleUnboundedStack();
	}

	private static void exampleBoundedQueue() {
		BoundedQueue boundedQueue = new BoundedQueue(10);
		boundedQueue.writeln("=======");;

		for (int i = 0; i < 10; i++) {
			boundedQueue.add(new Interval(-i, i));
		}
		boundedQueue.writeln("-------");;

		for (int i = 0; i < 5; i++) {
			boundedQueue.remove();
		}
		for (int i = 0; i < 3; i++) {
			boundedQueue.add(new Interval(-100, 100));
		}
		boundedQueue.writeln("-------");;
	}

	private static void exampleBoundedStack() {
		BoundedStack boudedStack = new BoundedStack(10);
		boudedStack.writeln("=======");;

		for (int i = 0; i < 10; i++) {
			boudedStack.add(new Interval(-i, i));
		}
		boudedStack.writeln("-------");

		for (int i = 0; i < 5; i++) {
			boudedStack.remove();
		}
		for (int i = 0; i < 3; i++) {
			boudedStack.add(new Interval(-100, 100));
		}
		boudedStack.writeln("-------");;
	}

	private static void exampleUnboundedQueue() {
		UnboundedQueue unboundedQueue = new UnboundedQueue();
		unboundedQueue.writeln("=======");

		for (int i = 0; i < 10; i++) {
			unboundedQueue.add(new Interval(-i, i));
		}
		unboundedQueue.writeln("-------");

		for (int i = 0; i < 5; i++) {
			unboundedQueue.remove();
		}
		for (int i = 0; i < 3; i++) {
			unboundedQueue.add(new Interval(-100, 100));
		}
		unboundedQueue.writeln("-------");

		for (int i = 0; i < 8; i++) {
			unboundedQueue.remove();
		}
		unboundedQueue.writeln("-------");;
	}

	private static void exampleUnboundedStack() {
		UnboundedStack unboundedStack = new UnboundedStack();
		unboundedStack.writeln("=======");

		for (int i = 0; i < 10; i++) {
			unboundedStack.add(new Interval(-i, i));
		}
		unboundedStack.writeln("-------");

		for (int i = 0; i < 5; i++) {
			unboundedStack.remove();
		}
		for (int i = 0; i < 3; i++) {
			unboundedStack.add(new Interval(-100, 100));
		}
		unboundedStack.writeln("-------");

		for (int i = 0; i < 8; i++) {
			unboundedStack.remove();
		}
		unboundedStack.writeln("-------");
	}

}
