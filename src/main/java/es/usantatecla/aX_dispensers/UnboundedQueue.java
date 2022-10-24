package es.usantatecla.aX_dispensers;

class UnboundedQueue extends UnboundedDispenser {

	private Node exit;

	public UnboundedQueue() {
		this.exit = null;
	}

	public void add(Interval interval) {
		boolean empty = this.isEmpty();
		super.add(interval);
		if (empty) {
			this.exit = this.entrance;
		}
	}

	public Interval remove() {
		Interval interval = exit.getInterval();
		if (this.exit.getPrevious() == null) {
			this.entrance = null;
			this.exit = null;
		} else {
			this.exit = exit.getPrevious();
			this.exit.setNext(null);
		}
		return interval;
	}

	public Iterator getIterator() {
		return new UnboundedQueueIterator(exit);
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		UnboundedQueue unboundedQueue = new UnboundedQueue();
		gestorIO.escribirLinea("-------");
		Iterator iterator = unboundedQueue.getIterator();
		int position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 10; i++) {
			unboundedQueue.add(new Interval(-i, i));
		}
		gestorIO.escribirLinea("-------");
		iterator = unboundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 5; i++) {
			unboundedQueue.remove();
		}
		for (int i = 0; i < 3; i++) {
			unboundedQueue.add(new Interval(-100, 100));
		}
		gestorIO.escribirLinea("-------");
		iterator = unboundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}

		for (int i = 0; i < 8; i++) {
			unboundedQueue.remove();
		}
		gestorIO.escribirLinea("-------");
		iterator = unboundedQueue.getIterator();
		position = 1;
		while (iterator.hasNext()) {
			gestorIO.escribirLinea(position + ": " + iterator.next());
			position++;
		}
	}
}
