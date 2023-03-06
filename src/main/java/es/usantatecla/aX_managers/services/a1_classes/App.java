package es.usantatecla.aX_managers.services.a1_classes;

class App {
  
  public static void main(String[] args) {
		final int YEAR = 2022;
		ServicesContract servicesContract = new ServicesContract("USantaTecla", YEAR);

		servicesContract.writeln();
		double cost = servicesContract.getCost();
		Console.getInstance().writeln("Coste anual del contrato: " + cost);

		servicesContract.cancel(new Date(25, 12, YEAR));
		servicesContract.writeln();
		cost = servicesContract.getCost();
		Console.getInstance().writeln("Coste anual del contrato: " + cost);

		servicesContract.enlarge(new Date(24, 12, YEAR), 2.0);
		servicesContract.writeln();
		cost = servicesContract.getCost();
		Console.getInstance().writeln("Coste anual del contrato: " + cost);

		servicesContract.shift(new Date(26, 12, YEAR), 1.0);
		servicesContract.writeln();
		cost = servicesContract.getCost();
		Console.getInstance().writeln("Coste anual del contrato: " + cost);
	}

}
