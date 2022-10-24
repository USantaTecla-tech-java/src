package es.usantatecla.aX_dispensers;

class Interval {

	private double minimo;
	private double maximo;

	protected double getMinimo() {
		return minimo;
	}

	protected double getMaximo() {
		return maximo;
	}

	public Interval(double minimo, double maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public Interval() {
		this(0, 0);
	}

	public Interval(Interval intervalo) {
		this(intervalo.minimo, intervalo.maximo);
	}

	public double longitud() {
		return maximo - minimo;
	}

	public double puntoMedio() {
		return (maximo + minimo) / 2;
	}

	public Interval copia() {
		return new Interval(this);
	}

	public Interval simetrico() {
		return new Interval(-maximo, -minimo);
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

	public boolean incluye(Interval intervalo) {
		return this.incluye(intervalo.minimo) &&
				this.incluye(intervalo.maximo);
	}

	public boolean iguales(Interval intervalo) {
		return minimo == intervalo.minimo &&
			   maximo == intervalo.maximo;
	}

	public Interval interseccion(Interval intervalo) {
		if (this.incluye(intervalo)) {
			return intervalo.copia();
		} else if (intervalo.incluye(this)) {
			return this.copia();
		} else if (this.incluye(intervalo.minimo)) {
			return new Interval(intervalo.minimo, this.maximo);
		} else if (this.incluye(intervalo.maximo)) {
			return new Interval(this.minimo, intervalo.maximo);
		} else {
			return null;
		}
	}

	public Interval desplazado(double cantidad) {
		Interval intervalo = this.copia();
		intervalo.desplazar(cantidad);
		return intervalo;
	}

	public void recoger() {
		GestorIO gestorIO = GestorIO.getGestorIO();
		do {
			minimo = gestorIO.leerDouble("Introduce el minimo: ");
			maximo = gestorIO.leerDouble("Introduce el maximo: ");
			if (minimo > maximo) {
				gestorIO.escribirLinea(
						"El minimo no puede ser mayor que el maximo");
			}
		} while (minimo > maximo);
	}

	public String toString() {
		return "[" + minimo + ", " + maximo + "]";
	}

	public static void main(String[] args) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		Interval intervalo = new Interval();
		intervalo.recoger();
		gestorIO.escribirLinea("Longitud: " + intervalo.longitud());
		gestorIO.escribirLinea("Punto medio: " + intervalo.puntoMedio());
		gestorIO.escribirLinea("Simetrico: " + intervalo.simetrico());
		Interval copia = intervalo.copia();
		intervalo.desplazar(7.7);
		gestorIO.escribirLinea("Desplazado 7.7: " + intervalo);
		gestorIO.escribirLinea("Incluye 3.3? " + intervalo.incluye(3.3));
		gestorIO.escribirLinea("Incluye al original? " +
				intervalo.incluye(copia));
	}
}
