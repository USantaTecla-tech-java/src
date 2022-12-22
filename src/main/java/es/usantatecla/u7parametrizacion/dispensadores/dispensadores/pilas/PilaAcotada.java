package es.usantatecla.u7parametrizacion.dispensadores.dispensadores.pilas;

import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.colas.ColaAcotada;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.DispensadorAcotado;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.Dispensador;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.ExDispensadorInvalido;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.ExDispensadorLleno;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.ExDispensadorVacio;
import es.usantatecla.u7parametrizacion.dispensadores.util.GestorIO;
import es.usantatecla.u7parametrizacion.dispensadores.util.Intervalo;
import es.usantatecla.u7parametrizacion.dispensadores.util.Iterador;

public class PilaAcotada<Elemento> extends DispensadorAcotado<Elemento> {

	public PilaAcotada(int tamaño) throws ExDispensadorInvalido {
		super(tamaño);
	}

	public Elemento sacar() throws ExDispensadorVacio {
		if (this.vacio()) {
			throw new ExDispensadorVacio();
		}
		cuantos--;
		siguiente--;
		return elementos[siguiente];
	}

	public Iterador<Elemento> iterador() {
		return new IteradorPilaAcotada<Elemento>(elementos, cuantos, siguiente);
	}

	public Dispensador<Elemento> dispensadorAlterno() {
		try {
			return new ColaAcotada<Elemento>(elementos.length);
		} catch (ExDispensadorInvalido ex) {
			return null;
		}
	}

	public void duplicar() {
		// ERROR: No se puede crear una array generico
		// Elemento nuevos[] = new Elemento[2 * elementos.length];
		Elemento nuevos[] = (Elemento[]) new Object[2 * elementos.length];
		for (int i = 0; i < cuantos; i++) {
			nuevos[i] = elementos[i];
		}
		elementos = nuevos;
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
		PilaAcotada<Intervalo> pila = null;
		do {
			try {
				int tamaño = gestorIO.inInt("Introduce el tamaño de la pila: ");
				pila = new PilaAcotada<Intervalo>(tamaño);
			} catch (ExDispensadorInvalido ex) {
				gestorIO.out("Excepción al crear: " + ex.getMessage() + "\n");
			}
		} while (pila == null);
		gestorIO.out("\n############ Inicial ############\n");
		dump(pila);

		gestorIO.out("\n############ Metiendo ############\n");
		for (int i = 0; i < 6; i++) {
			try {
				pila.meter(new Intervalo(-i, i));
			} catch (ExDispensadorLleno ex) {
				ex.reparar();
			}
		}
		gestorIO.out("\n############ Tras meter ############\n");
		dump(pila);

		gestorIO.out("\n############ Sacando ############\n");
		for (int i = 0; i < 2; i++) {
			try {
				pila.sacar();
			} catch (ExDispensadorVacio ex) {
				gestorIO.out("Excepción al sacar: " + ex.getMessage() + "\n");
			}
		}
		gestorIO.out("\n############ Tras sacar ############\n");
		dump(pila);

		gestorIO.out("\n############ Metiendo ############\n");
		for (int i = 6; i < 14; i++) {
			try {
				pila.meter(new Intervalo(-i, i));
			} catch (ExDispensadorLleno ex) {
				ex.reparar();
			}
		}
		gestorIO.out("\n############ Tras meter ############\n");
		dump(pila);
	}
}
