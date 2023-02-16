package es.usantatecla.aX_dispensers.a5_extends_a1_node;

public class App {

	public static void main(String[] args) {
		App.exampleBoundedQueue();
		App.exampleBoundedStack();
		App.exampleUnboundedQueue();
		App.exampleUnboundedStack();
	}

	private static void exampleBoundedQueue() {
		Console.getInstance().writeln("=======");
		BoundedQueue boundedQueue = new BoundedQueue(10);
		BoundedQueueIterator iterator = boundedQueue.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			boundedQueue.add(new Interval(-i, i));
		}
		Console.getInstance().writeln("-------");
		iterator = boundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			boundedQueue.remove();
		}
		for (int i = 0; i < 3; i++) {
			boundedQueue.add(new Interval(-100, 100));
		}
		Console.getInstance().writeln("-------");
		iterator = boundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}
	}

	private static void exampleBoundedStack() {
		Console.getInstance().writeln("=======");
		BoundedStack boudedStack = new BoundedStack(10);
		BoundedStackIterator iterator = boudedStack.getIterator();
		int position= 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			boudedStack.add(new Interval(-i, i));
		}
		Console.getInstance().writeln("-------");
		iterator = boudedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			boudedStack.remove();
		}
		for (int i = 0; i < 3; i++) {
			boudedStack.add(new Interval(-100, 100));
		}
		Console.getInstance().writeln("-------");
		iterator = boudedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}
	}

	private static void exampleUnboundedQueue() {
		Console.getInstance().writeln("=======");
		UnboundedQueue unboundedQueue = new UnboundedQueue();
		UnboundedQueueIterator iterator = unboundedQueue.getIterator();
		int position= 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			unboundedQueue.add(new Interval(-i, i));
		}
		Console.getInstance().writeln("-------");
		iterator = unboundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			unboundedQueue.remove();
		}
		for (int i = 0; i < 3; i++) {
			unboundedQueue.add(new Interval(-100, 100));
		}
		Console.getInstance().writeln("-------");
		iterator = unboundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 8; i++) {
			unboundedQueue.remove();
		}
		Console.getInstance().writeln("-------");
		iterator = unboundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}
	}

	private static void exampleUnboundedStack() {
		Console.getInstance().writeln("=======");
		UnboundedStack unboundedStack = new UnboundedStack();
		UnboundedStackIterator iterator = unboundedStack.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			unboundedStack.add(new Interval(-i, i));
		}
		Console.getInstance().writeln("-------");
		iterator = unboundedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			unboundedStack.remove();
		}
		for (int i = 0; i < 3; i++) {
			unboundedStack.add(new Interval(-100, 100));
		}

		Console.getInstance().writeln("-------");
		iterator = unboundedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 8; i++) {
			unboundedStack.remove();
		}
		Console.getInstance().writeln("-------");
		iterator = unboundedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			Console.getInstance().writeln(position + ": " + iterator.next());
			position++;
		}
	}

}
