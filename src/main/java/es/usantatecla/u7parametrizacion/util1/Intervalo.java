package es.usantatecla.u7parametrizacion.util1;

public class Intervalo {

	private Integer minimo;
	private Integer maximo;

	public Intervalo(Integer minimo, Integer maximo) {
		this.minimo = minimo;
		this.maximo = maximo;
	}

	public Intervalo(Intervalo intervalo) {
		this(intervalo.getMinimo(), intervalo.getMaximo());
	}

	public int getMinimo() {
		return minimo;
	}

	public int getMaximo() {
		return maximo;
	}

	public Intervalo copia() {
		return new Intervalo(minimo, maximo);
	}

	public boolean incluye(Integer valor) {
		return minimo <= valor && maximo >= valor;
	}

	public boolean incluye(Intervalo intervalo) {
		return this.incluye(intervalo.getMinimo()) &&
			   this.incluye(intervalo.getMaximo());
	}

	public boolean iguales(Intervalo intervalo) {
		return minimo.equals(intervalo.minimo) &&
		       maximo.equals(intervalo.maximo);
	}

	public boolean distintos(Intervalo intervalo) {
		return !this.iguales(intervalo);
	}

	public String toString() {
		return "[" + minimo + ", " + maximo + "]";
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
}

