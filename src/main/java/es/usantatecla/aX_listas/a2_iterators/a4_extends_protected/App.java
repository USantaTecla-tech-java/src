package es.usantatecla.aX_listas.a2_iterators.a4_extends_protected;

class App {

  public static void main(String[] args){
    App.manageList();
    App.manageSentinelList();
    App.manageSet();
  }
  
  public static void manageList() {
		List list = new List();
		Console.getInstance().writeln("========");
    list.writeln();
		Console.getInstance().writeln("Esta: " + list.includes(new Interval(-7, 7)));

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				list.insertFirst(new Interval(-i, i));
			} else {
				list.insertLast(new Interval(-i, i));
			}
		}
		Console.getInstance().writeln("-------");
		Console.getInstance().writeln("Contenido de la lista despues de inserciones");
		list.writeln();
		Console.getInstance().writeln("Esta: " + list.includes(new Interval(-7, 7)));
		for (int i = 0; i < 3; i++) {
			list.removeFirst();
			list.removeLast();
		}
		Console.getInstance().writeln("-------");
		Console.getInstance().writeln("Contenido después de eliminaciones");
		list.writeln();
		Console.getInstance().writeln("Esta: " + list.includes(new Interval(-7, 7)));
	}

  public static void manageSentinelList() {
		SentinelList sentinelList = new SentinelList();
		Console.getInstance().writeln("========");
    sentinelList.writeln();
		Console.getInstance().writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sentinelList.insertFirst(new Interval(-i, i));
			} else {
				sentinelList.insertLast(new Interval(-i, i));
			}
		}
		Console.getInstance().writeln("-------");
    sentinelList.writeln();
		Console.getInstance().writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));

		for (int i = 0; i < 3; i++) {
			sentinelList.removeFirst();
			sentinelList.removeLast();
		}
		Console.getInstance().writeln("-------");
    sentinelList.writeln();
		Console.getInstance().writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));

		for (int i = 0; i < 2; i++) {
			sentinelList.removeFirst();
			sentinelList.removeLast();
		}
		Console.getInstance().writeln("-------");
    sentinelList.writeln();
		Console.getInstance().writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));
	}

  public static void manageSet() {
		Set set = new Set();
		Console.getInstance().writeln("========");
		set.writeln();
		Console.getInstance().writeln("Esta: " + set.includes(new Interval(-7, 7)));

		for (int i = 0; i < 10; i++) {
			set.insertLast(new Interval(-7, 7));
		}

		Console.getInstance().writeln("-------");
		set.writeln();
		Console.getInstance().writeln("Esta: " + set.includes(new Interval(-7, 7)));

		set.removeFirst();
		Console.getInstance().writeln("-------");
		set.writeln();
		Console.getInstance().writeln("Esta: " + set.includes(new Interval(-7, 7)));
	}

}
