package es.usantatecla.u7parametrizacion.dispensadores.dispensadores.colas;

import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.DispensadorNoAcotado;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.Dispensador;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.ExDispensadorVacio;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.pilas.PilaNoAcotada;
import es.usantatecla.u7parametrizacion.dispensadores.util.GestorIO;
import es.usantatecla.u7parametrizacion.dispensadores.util.Intervalo;
import es.usantatecla.u7parametrizacion.dispensadores.util.Iterador;
import es.usantatecla.u7parametrizacion.dispensadores.util.Nodo;

public class ColaNoAcotada<Elemento> extends DispensadorNoAcotado<Elemento> {

	private Nodo<Elemento> salida;

	public ColaNoAcotada() {
		salida = null;
	}

	public void meter(Elemento elemento) {
		boolean vacio = this.vacio();
		super.meter(elemento);
		if (vacio) {
			salida = entrada;
		}
	}

	public Elemento sacar() throws ExDispensadorVacio {
		if (this.vacio()) {
			throw new ExDispensadorVacio();
		}
		Elemento elemento = salida.getElemento();
		if (salida.getAnterior() == null) {
			entrada = null;
			salida = null;
		} else {
			salida = salida.getAnterior();
			salida.setSiguiente(null);
		}
		return elemento;
	}

	public Iterador<Elemento> iterador() {
		return new IteradorColaNoAcotada<Elemento>(salida);
	}

	public Dispensador<Elemento> dispensadorAlterno() {
		return new PilaNoAcotada<Elemento>();
	}

	public static void main(String arg[]) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		ColaNoAcotada<Intervalo> cola = new ColaNoAcotada<Intervalo>();
		gestorIO.out("-------\n");
		Iterador<Intervalo> iterador = cola.iterador();
		int posicion = 1;
		while (iterador.hasNext()) {
			gestorIO.out(posicion + ": " + iterador.next() + "\n");
			posicion++;
		}


		for (int i = 0; i < 10; i++) {
			cola.meter(new Intervalo(-i, i));
		}
		gestorIO.out("-------\n");
		iterador = cola.iterador();
		posicion = 1;
		while (iterador.hasNext()) {
			gestorIO.out(posicion + " :" + iterador.next() + "\n");
			posicion++;
		}


		for (int i = 0; i < 5; i++) {
			try {
				cola.sacar();
			} catch (ExDispensadorVacio ex) {
				gestorIO.out("Excepción al sacar: " + ex.getMessage() + "\n");
			}
		}
		for (int i = 0; i < 3; i++) {
			cola.meter(new Intervalo(-100, 100));
		}
		gestorIO.out("-------\n");
		iterador = cola.iterador();
		posicion = 1;
		while (iterador.hasNext()) {
			gestorIO.out(posicion + ": " + iterador.next() + "\n");
			posicion++;
		}

		for (int i = 0; i < 8; i++) {
			try {
				cola.sacar();
			} catch (ExDispensadorVacio ex) {
				gestorIO.out("Excepción al sacar: " + ex.getMessage() + "\n");
			}
		}
		gestorIO.out("-------\n");
		iterador = cola.iterador();
		posicion = 1;
		while (iterador.hasNext()) {
			gestorIO.out(posicion + ": " + iterador.next() + "\n");
			posicion++;
		}
	}
}
