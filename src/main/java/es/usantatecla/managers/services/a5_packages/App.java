package es.usantatecla.managers.services.a5_packages;

class App {

  public static void main(String[] args) {
		Console console = new Console();
		ServicesContract etsisi = new ServicesContract(2015);
		
		etsisi.writeln();
		double cost = etsisi.getCost();
		console.writeln("Coste anual del contrato: " + cost + " €");
		console.writeln(cost == 102200 ? "" : "ERROR!!!!");

		etsisi.cancel(new Date(25, Month.JANUARY, 2015));
		etsisi.writeln();
		cost = etsisi.getCost();
		console.writeln("Coste anual del contrato: " + cost + " €");
		console.writeln(cost == 101920 ? "" : "ERROR!!!!");
		
		etsisi.enlarge(new Date(30, Month.APRIL, 2015), 2.0);
		etsisi.writeln();
		cost = etsisi.getCost();
		console.writeln("Coste anual del contrato: " + cost + " €");
		console.writeln(cost == 102280 ? "" : "ERROR!!!!");

		etsisi.desplazar(new Date(28, Month.DECEMBER, 2015), 1.0);
		etsisi.writeln();
		cost = etsisi.getCost();
		console.writeln("Coste anual del contrato: " + cost + " €");
		console.writeln(cost == 102300 ? "" : "ERROR!!!!");
	}
  
}
