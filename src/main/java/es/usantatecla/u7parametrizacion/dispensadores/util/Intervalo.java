package es.usantatecla.u7parametrizacion.dispensadores.util;

import java.util.regex.Pattern;

public class Intervalo {

	private double minimo;
	private double maximo;

	protected double getMinimo() {
		return minimo;
	}

	protected double getMaximo() {
		return maximo;
	}

	/**
	 *
	 * @throws IllegalArgumentException si minimo es mayor que maximo
	 */
	public Intervalo(double minimo, double maximo)
			throws IllegalArgumentException {
		if (minimo > maximo) {
			throw new IllegalArgumentException(
					"El mínimo " + minimo + " no puede ser mayor " +
					"que el máximo " + maximo);
		}
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public Intervalo() {
		this(0, 0);
	}

	public Intervalo(Intervalo intervalo) {
		this(intervalo.minimo, intervalo.maximo);
	}

	public double longitud() {
		return maximo - minimo;
	}

	public double puntoMedio() {
		return (maximo + minimo) / 2;
	}

	public Intervalo copia() {
		return new Intervalo(this);
	}

	public Intervalo simetrico() {
		return new Intervalo(-maximo, -minimo);
	}

	public void desplazar(double cantidad) {
		minimo += cantidad;
		maximo += cantidad;
	}

	public void escalar(double escala) {
		double nuevaLongitud = this.longitud() * escala;
		double puntoMedio = this.puntoMedio();
		minimo = puntoMedio - nuevaLongitud / 2;
		maximo = puntoMedio + nuevaLongitud / 2;
	}

	public boolean incluye(double punto) {
		return minimo <= punto && punto <= maximo;
	}

	public boolean incluye(Intervalo intervalo) {
		return this.incluye(intervalo.minimo) &&
			   this.incluye(intervalo.maximo);
	}

	public boolean iguales(Intervalo intervalo) {
		return minimo == intervalo.minimo &&
		       maximo == intervalo.maximo;
	}

	public Intervalo interseccion(Intervalo intervalo) {
		if (this.incluye(intervalo)) {
			return intervalo.copia();
		} else if (intervalo.incluye(this)) {
			return this.copia();
		} else if (this.incluye(intervalo.minimo)) {
			return new Intervalo(intervalo.minimo, this.maximo);
		} else if (this.incluye(intervalo.maximo)) {
			return new Intervalo(this.minimo, intervalo.maximo);
		} else {
			return null;
		}
	}

	public Intervalo desplazado(double cantidad) {
		Intervalo intervalo = this.copia();
		intervalo.desplazar(cantidad);
		return intervalo;
	}

	public void recoger() {
		GestorIO gestorIO = GestorIO.getGestorIO();
		do {
			minimo = gestorIO.inDouble("Introduce el minimo: ");
			maximo = gestorIO.inDouble("Introduce el maximo: ");
			if (minimo > maximo) {
				gestorIO.out(
					"El mínimo " + minimo + " no puede ser mayor " +
					"que el máximo " + maximo + "\n\n");
			}
		} while (minimo > maximo);
	}

	/**
	 *
	 * @throws IllegalArgumentException si los intervalos son disjuntos
	 */
	public void ajustar(Intervalo intervalo) throws IllegalArgumentException {
		if (this.interseccion(intervalo) == null) {
			throw new IllegalArgumentException(
					"El intervalo " + this +
					" es disjunto al argumento " + intervalo);
		}
		if (this.minimo < intervalo.minimo) {
			this.minimo = intervalo.minimo;
		}
		if (this.maximo > intervalo.maximo) {
			this.maximo = intervalo.maximo;
		}
	}

	/**
	 *
	 * @throws IllegalArgumentException si el formato del argumento
	 * no es [double, double] o si el minimo es mayor que el maximo
	 */
	public Intervalo(String cadena) throws IllegalArgumentException {
		if (!Pattern.matches("\\[ *(-?\\d+(.\\d)?) *," +
		                        " *(-?\\d+(.\\d)?) *\\]", cadena)) {
			throw new IllegalArgumentException(
					"La cadena " + cadena + " no tiene el formato de intervalo");
		}
		minimo = Double.parseDouble(cadena.substring(
				cadena.indexOf("[") + 1,
				cadena.indexOf(",")).trim());
		cadena = cadena.substring(
				cadena.indexOf(",") + 1, cadena.length()).trim();
		maximo = Double.parseDouble(
				cadena.substring(0, cadena.indexOf("]")));
		if (minimo > maximo) {
			throw new IllegalArgumentException(
					"El mínimo " + minimo + " no puede ser mayor " +
					"que el máximo " + maximo);
		}
	}

	public String toString() {
		return "[" + minimo + ", " + maximo + "]";
	}

	public boolean distintos(Intervalo intervalo) {
		return !this.iguales(intervalo);
	}

	/**
	 *
	 * @throws IllegalArgumentException si el argumento es menor que 0.1
	 */
	public double[] valores(double distancia) throws IllegalArgumentException {
		if (distancia < 0.1) {
			throw new IllegalArgumentException(
					"La distancia " + distancia + " es menor que 0.1");
		}
		int cantidad = (int) (1 + this.longitud() / distancia);
		double valores[] = new double[cantidad];
		double valor = minimo;
		for (int i = 0; i < cantidad; i++){
			valores[i] = valor;
			valor += distancia;
		}
		return valores;
	}

	/**
	 *
	 * @throws IllegalArgumentException si el argumento es menor o igual a cero
	 */
	public Intervalo[] troceado(int veces) throws IllegalArgumentException {
		if (veces <= 0) {
			throw new IllegalArgumentException(
					"El número de veces " + veces + " es menor o igual a cero");
		}
		Intervalo intervalos[] = new Intervalo[veces];
		double longitud = this.longitud() / veces;
		double minimo = this.minimo;
		double maximo = minimo + longitud;
		for (int i = 0; i < veces; i++) {
			intervalos[i] = new Intervalo(minimo, maximo);
			minimo = maximo;
			maximo += longitud;
		}
		return intervalos;
	}

	public static void main(String args[]) {
		GestorIO gestorIO = GestorIO.getGestorIO();
//		Intervalo intervalo = new Intervalo();
//		intervalo.recoger();
//		gestorIO.out("\nOriginal: " + intervalo.toString());
//		gestorIO.out("\nLongitud: " + intervalo.longitud());
//		gestorIO.out("\nPunto medio: " + intervalo.puntoMedio());
//		gestorIO.out("\nSimetrico: " + intervalo.toString());
//		Intervalo copia = intervalo.copia();
//		intervalo.desplazar(7.7);
//		gestorIO.out("\nDesplazado 7.7: " + intervalo.toString());
//		gestorIO.out("\nIncluye 3.3? " + intervalo.incluye(3.3));
//		gestorIO.out("\nIncluye al original? " +
//				intervalo.incluye(copia) + "\n");
//
//		intervalo = new Intervalo("[0, 5]");
//		gestorIO.out("\nOriginal: " + intervalo.toString());
//		gestorIO.out("\nTroceado por 4: ");
//		Intervalo intervalos[] = intervalo.troceado(4);
//		for (int i = 0; i < intervalos.length; i++) {
//			if (i != 0) {
//				gestorIO.out(", ");
//			}
//			gestorIO.out(intervalos[i].toString());
//		}
//		gestorIO.out("\nValores cada 0.4: ");
//		double valores[] = intervalo.valores(0.4);
//		for (int i = 0; i < valores.length; i++) {
//			if (i != 0) {
//				gestorIO.out(", ");
//			}
//			gestorIO.out(valores[i]);
//		}
//		gestorIO.out("\n");

		try {
			Intervalo intervalo1 = new Intervalo(1, 2);
			Intervalo intervalo2 = new Intervalo(2, 1);
		} catch (IllegalArgumentException ex) {
			gestorIO.out(ex.getMessage() + "\n");
		}

		try {
			Intervalo intervalo1 = new Intervalo(1, 4);
			Intervalo intervalo2 = new Intervalo(8, 10);
			Intervalo intervalo3 = new Intervalo(2, 6);
			intervalo1.ajustar(intervalo2);
		} catch (IllegalArgumentException ex) {
			gestorIO.out(ex.getMessage() + "\n");
		}

		try {
			Intervalo intervalo1 = new Intervalo("[-2.1.1, 3]");
			Intervalo intervalo2 = new Intervalo("[-2.1, 3]");
		} catch (IllegalArgumentException ex) {
			gestorIO.out(ex.getMessage() + "\n");
		}

		try {
			Intervalo intervalo = new Intervalo(1, 2);
			Intervalo intervalos1[] = intervalo.troceado(0);
			Intervalo intervalos2[] = intervalo.troceado(1);
		} catch (IllegalArgumentException ex) {
			gestorIO.out(ex.getMessage() + "\n");
		}

		try {
			Intervalo intervalo = new Intervalo(1, 2);
			double valores1[] = intervalo.valores(0.05);
			double valores2[] = intervalo.valores(0.1);
		} catch (IllegalArgumentException ex) {
			gestorIO.out(ex.getMessage() + "\n");
		}
	}
}
















