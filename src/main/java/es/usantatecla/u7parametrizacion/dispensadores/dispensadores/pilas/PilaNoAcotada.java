package es.usantatecla.u7parametrizacion.dispensadores.dispensadores.pilas;

import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.colas.ColaNoAcotada;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.DispensadorNoAcotado;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.Dispensador;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.ExDispensadorVacio;
import es.usantatecla.u7parametrizacion.dispensadores.util.GestorIO;
import es.usantatecla.u7parametrizacion.dispensadores.util.Intervalo;
import es.usantatecla.u7parametrizacion.dispensadores.util.Iterador;

public class PilaNoAcotada<Elemento> extends DispensadorNoAcotado<Elemento> {

	public Elemento sacar() throws ExDispensadorVacio {
		if (this.vacio()) {
			throw new ExDispensadorVacio();
		}
		Elemento elemento = entrada.getElemento();
		entrada = entrada.getSiguiente();
		return elemento;
	}

	public Iterador<Elemento> iterador() {
		return new IteradorPilaNoAcotada<Elemento>(entrada);
	}

	public Dispensador<Elemento> dispensadorAlterno() {
		return new ColaNoAcotada<Elemento>();
	}

	public static void main(String arg[]) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		PilaNoAcotada<Intervalo> pila = new PilaNoAcotada<Intervalo>();
		gestorIO.out("-------\n");
		Iterador<Intervalo> iterador = pila.iterador();
		int posicion = 1;
		while (iterador.hasNext()) {
			gestorIO.out(posicion + ": " + iterador.next() + "\n");
			posicion++;
		}

		for (int i = 0; i < 10; i++) {
			pila.meter(new Intervalo(-i, i));
		}
		gestorIO.out("-------\n");
		iterador = pila.iterador();
		posicion = 1;
		while (iterador.hasNext()) {
			gestorIO.out(posicion + ": " + iterador.next() + "\n");
			posicion++;
		}
		for (int i = 0; i < 5; i++) {
			try {
				pila.sacar();
			} catch (ExDispensadorVacio ex) {
				gestorIO.out("Excepción al sacar: " + ex.getMessage() + "\n");
			}
		}
		for (int i = 0; i < 3; i++) {
			pila.meter(new Intervalo(-100, 100));
		}

		gestorIO.out("-------\n");
		iterador = pila.iterador();
		posicion = 1;
		while (iterador.hasNext()) {
			gestorIO.out(posicion + ": " + iterador.next() + "\n");
			posicion++;
		}

		for (int i = 0; i < 8; i++) {
			try {
				pila.sacar();
			} catch (ExDispensadorVacio ex) {
				gestorIO.out("Excepción al sacar: " + ex.getMessage() + "\n");
			}
		}
		gestorIO.out("-------\n");
		iterador = pila.iterador();
		posicion = 1;
		while (iterador.hasNext()) {
			gestorIO.out(posicion + ": " + iterador.next() + "\n");
			posicion++;
		}
	}
}
