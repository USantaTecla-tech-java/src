package es.usantatecla.u7parametrizacion.dispensadores.dispensadores;

public abstract class DispensadorAcotado<Elemento>
		extends Dispensador<Elemento> {

	protected Elemento elementos[];
	protected int cuantos;
	protected int siguiente;

	public DispensadorAcotado(int tamaño) throws ExDispensadorInvalido {
		if (tamaño <= 0) {
			throw new ExDispensadorInvalido(tamaño);
		}
		// ERROR: No se puede crear una array generico
		// elementos = new Elemento[tamaño];
		elementos = (Elemento[]) new Object[tamaño];
		cuantos = 0;
		siguiente = 0;
	}

	public void meter(Elemento elemento) throws ExDispensadorLleno {
		if (this.lleno()) {
			throw new ExDispensadorLleno(this, elemento);
		}
		cuantos++;
		elementos[siguiente] = elemento;
		siguiente++;
	}

	public boolean vacio() {
		return cuantos == 0;
	}

	public boolean lleno() {
		return cuantos == elementos.length;
	}

	abstract public void duplicar();
}
