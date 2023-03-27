package es.usantatecla.u7parametrizacion.util4;

public class App {
  
  public static void main(String[] args) {
		Integer i1 = Integer.valueOf(1);
		Integer i2 = Integer.valueOf(2);
		Integer i3 = Integer.valueOf(3);
		Lista<Integer> listaEnteros = new Lista<Integer>();
		listaEnteros.add(i1);
		listaEnteros.add(i2);
		listaEnteros.add(i3);

		Double d1 = Double.valueOf(1.1);
		Double d2 = Double.valueOf(2.2);
		Double d3 = Double.valueOf(3.3);
		Lista<Double> listaReales = new Lista<Double>();
		listaReales.add(d1);
		listaReales.add(d2);
		listaReales.add(d3);
		System.out.println("La suma de los elementos de " +
				listaEnteros + " y " + listaReales + " es " +
				listaEnteros.suma(listaReales));
		System.out.println("La suma de los elementos de " +
				listaReales + " y " + listaEnteros + " es " +
				listaReales.suma(listaEnteros));
		System.out.println("Son iguales = " +
				(listaEnteros.suma(listaReales) ==
				 listaReales.suma(listaEnteros)));

		Lista<Number> listaNumeros = new Lista<Number>();
		listaNumeros.addAll(listaEnteros);
		listaNumeros.addAll(listaReales);
		System.out.println("La lista resultado de unir " +
				listaEnteros + " y " + listaReales + " es " + listaNumeros);

		Lista<Fraccion> listaFracciones = new Lista<Fraccion>();
		listaFracciones.add(new Fraccion(1, 2));
		listaFracciones.add(new Fraccion(1, 3));
		listaFracciones.add(new Fraccion(2, 3));
		System.out.print("La lista resultado de unir " +
				listaNumeros + " y " + listaFracciones + " es ");
		listaNumeros.addAll(listaFracciones);
		System.out.println(listaNumeros);

//		Lista<Double> listaReales2 = new Lista<Double>();
//		Lista<Number> listaNumeros2 = listaReales2;   // ERROR
//		listaNumeros2.add(new Integer(3));
//		Double real2 = listaReales2.get(0);
//

		// Se podria omitir extends Number
//		Lista<? extends Number> listaNumeros3 = listaReales;    // CORRECTO
//		listaNumeros3.add(new Double(3));                       // ERROR
//		Number numero = new Double(3);
//		listaNumeros3.add(numero);                              // ERROR
//		Double x1 = listaNumeros3.get(0);                       // ERROR
//		Number x2 = listaNumeros3.get(0);                       // CORRECTO
//		String cadena1 = listaNumeros3.toString();              // CORRECTO
//		listaNumeros3.clear();                                  // CORRECTO
//		String cadena2 = listaNumeros3.toString();              // CORRECTO
	}
}
