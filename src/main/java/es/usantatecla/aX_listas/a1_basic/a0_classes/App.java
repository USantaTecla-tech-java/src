package es.usantatecla.aX_listas.a1_basic.a0_classes;

class App {

  public static void main(String[] args){
    App.manageList();
  }
  
  public static void manageList() {
		Console console = new Console();
		List list = new List();
		console.writeln("========");
    list.writeln();
		console.writeln("Esta: " + list.includes(new Interval(-7, 7)));

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				list.insertFirst(new Interval(-i, i));
			} else {
				list.insertLast(new Interval(-i, i));
			}
		}
		console.writeln("-------");
		console.writeln("Contenido de la lista despues de inserciones");
		list.writeln();
		console.writeln("Esta: " + list.includes(new Interval(-7, 7)));
		for (int i = 0; i < 3; i++) {
			list.removeFirst();
			list.removeLast();
		}
		console.writeln("-------");
		console.writeln("Contenido después de eliminaciones");
		list.writeln();
		console.writeln("Esta: " + list.includes(new Interval(-7, 7)));
	}

}
