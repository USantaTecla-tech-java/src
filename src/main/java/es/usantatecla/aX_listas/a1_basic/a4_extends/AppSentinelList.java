package es.usantatecla.aX_listas.a1_basic.a4_extends;

class AppSentinelList {

  public static void main(String[] args){
		Console console = new Console();
		SentinelList sentinelList = new SentinelList();
		console.writeln("========");
    sentinelList.writeln();
		console.writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sentinelList.insertFirst(new Interval(-i, i));
			} else {
				sentinelList.insertLast(new Interval(-i, i));
			}
		}
		console.writeln("-------");
    sentinelList.writeln();
		console.writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));

		for (int i = 0; i < 3; i++) {
			sentinelList.removeFirst();
			sentinelList.removeLast();
		}
		console.writeln("-------");
    sentinelList.writeln();
		console.writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));

		for (int i = 0; i < 2; i++) {
			sentinelList.removeFirst();
			sentinelList.removeLast();
		}
		console.writeln("-------");
    sentinelList.writeln();
		console.writeln("Esta: " + sentinelList.includes(new Interval(-1, 1)));
	}

}
