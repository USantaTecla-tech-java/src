package es.usantatecla.aX_listas.a1_basic.a4_extends;

class AppList {

  public static void main(String[] args){
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

}
