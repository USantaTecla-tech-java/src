package es.usantatecla.aX_dispensers.a1_classes_a2_iterator;

public class App {

	public static void main(String[] args) {
		App.exampleBoundedQueue();
		App.exampleBoundedStack();
		App.exampleUnboundedQueue();
		App.exampleUnboundedStack();
	}

	private static void exampleBoundedQueue() {
		Console console = new Console();
		console.writeln("=======");
		BoundedQueue boundedQueue = new BoundedQueue(10);
		BoundedQueueIterator iterator = boundedQueue.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			boundedQueue.add(new Interval(-i, i));
		}
		console.writeln("-------");
		iterator = boundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			boundedQueue.remove();
		}
		for (int i = 0; i < 3; i++) {
			boundedQueue.add(new Interval(-100, 100));
		}
		console.writeln("-------");
		iterator = boundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}
	}

	private static void exampleBoundedStack() {
		Console console = new Console();
		console.writeln("=======");
		BoundedStack boudedStack = new BoundedStack(10);
		BoundedStackIterator iterator = boudedStack.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			boudedStack.add(new Interval(-i, i));
		}
		console.writeln("-------");
		iterator = boudedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			boudedStack.remove();
		}
		for (int i = 0; i < 3; i++) {
			boudedStack.add(new Interval(-100, 100));
		}
		console.writeln("-------");
		iterator = boudedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}
	}

	private static void exampleUnboundedQueue() {
		Console console = new Console();
		console.writeln("=======");
		UnboundedQueue unboundedQueue = new UnboundedQueue();
		UnboundedQueueIterator iterator = unboundedQueue.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			unboundedQueue.add(new Interval(-i, i));
		}
		console.writeln("-------");
		iterator = unboundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			unboundedQueue.remove();
		}
		for (int i = 0; i < 3; i++) {
			unboundedQueue.add(new Interval(-100, 100));
		}
		console.writeln("-------");
		iterator = unboundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 8; i++) {
			unboundedQueue.remove();
		}
		console.writeln("-------");
		iterator = unboundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}
	}

	private static void exampleUnboundedStack() {
		Console console = new Console();
		console.writeln("=======");
		UnboundedStack unboundedStack = new UnboundedStack();
		UnboundedStackIterator iterator = unboundedStack.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			unboundedStack.add(new Interval(-i, i));
		}
		console.writeln("-------");
		iterator = unboundedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			unboundedStack.remove();
		}
		for (int i = 0; i < 3; i++) {
			unboundedStack.add(new Interval(-100, 100));
		}

		console.writeln("-------");
		iterator = unboundedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 8; i++) {
			unboundedStack.remove();
		}
		console.writeln("-------");
		iterator = unboundedStack.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			console.writeln(position + ": " + iterator.next());
			position++;
		}
	}

}
