package es.usantatecla.u7parametrizacion.dispensadores.dispensadores.colas;

import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.DispensadorAcotado;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.Dispensador;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.ExDispensadorInvalido;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.ExDispensadorLleno;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.ExDispensadorVacio;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.pilas.PilaAcotada;
import es.usantatecla.u7parametrizacion.dispensadores.util.GestorIO;
import es.usantatecla.u7parametrizacion.dispensadores.util.Intervalo;
import es.usantatecla.u7parametrizacion.dispensadores.util.Iterador;

public class ColaAcotada<Elemento> extends DispensadorAcotado<Elemento> {

	private int inicio;

	public ColaAcotada(int tamaño) throws ExDispensadorInvalido {
		super(tamaño);
		inicio = 0;
	}

	public void meter(Elemento elemento) throws ExDispensadorLleno {
		super.meter(elemento);
		if (siguiente == elementos.length) {
			siguiente = 0;
		}
	}

	public Elemento sacar() throws ExDispensadorVacio {
		if (this.vacio()) {
			throw new ExDispensadorVacio();
		}
		cuantos--;
		Elemento elemento = elementos[inicio];
		inicio = (inicio + 1) % elementos.length;
		return elemento;
	}

	public Iterador<Elemento> iterador() {
		return new IteradorColaAcotada<Elemento>(elementos, cuantos, inicio);
	}

	public Dispensador<Elemento> dispensadorAlterno() {
		try {
			return new PilaAcotada<Elemento>(elementos.length);
		} catch (ExDispensadorInvalido ex) {
			return null;
		}
	}

	public void duplicar() {
		// ERROR: No se puede crear una array generico
		// Elemento nuevos[] = new Elemento[2 * elementos.length];
		Elemento nuevos[] = (Elemento[]) new Object[2 * elementos.length];
		int i = inicio;
		for (int j = 0; j < cuantos; j++) {
			nuevos[j] = elementos[i];
			i = (i + 1) % elementos.length;
		}
		elementos = nuevos;
		inicio = 0;
		siguiente = cuantos;
	}

	public static void dump(Dispensador<?> dispensador) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		Iterador<?> iterador = dispensador.iterador();
		int posicion = 1;
		while (iterador.hasNext()) {
			gestorIO.out(posicion + ": " + iterador.next() + "\n");
			posicion++;
		}
	}

	public static void main(String arg[]) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		ColaAcotada<Intervalo> cola = null;
		do {
			try {
				int tamaño = gestorIO.inInt("Introduce el tamaño de la cola: ");
				cola = new ColaAcotada<Intervalo>(tamaño);
			} catch (ExDispensadorInvalido ex) {
				gestorIO.out("Excepción al crear: " + ex.getMessage() + "\n");
			}
		} while (cola == null);
		gestorIO.out("\n############ Inicial ############\n");
		dump(cola);

		gestorIO.out("\n############ Metiendo ############\n");
		for (int i = 0; i < 6; i++) {
			try {
				cola.meter(new Intervalo(-i, i));
			} catch (ExDispensadorLleno ex) {
				ex.reparar();
			}
		}
		gestorIO.out("\n############ Tras meter ############\n");
		dump(cola);

		gestorIO.out("\n############ Sacando ############\n");
		for (int i = 0; i < 2; i++) {
			try {
				cola.sacar();
			} catch (ExDispensadorVacio ex) {
				gestorIO.out("Excepción al sacar: " + ex.getMessage() + "\n");
			}
		}
		gestorIO.out("\n############ Tras sacar ############\n");
		dump(cola);

		gestorIO.out("\n############ Metiendo ############\n");
		for (int i = 6; i < 14; i++) {
			try {
				cola.meter(new Intervalo(-i, i));
			} catch (ExDispensadorLleno ex) {
				ex.reparar();
			}
		}
		gestorIO.out("\n############ Tras meter ############\n");
		dump(cola);
	}
}
