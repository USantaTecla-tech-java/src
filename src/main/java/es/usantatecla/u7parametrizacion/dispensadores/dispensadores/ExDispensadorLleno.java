package es.usantatecla.u7parametrizacion.dispensadores.dispensadores;

import es.usantatecla.u7parametrizacion.dispensadores.util.GestorIO;

// NO SE PUEDE PARAMETRIZAR
public class ExDispensadorLleno extends Exception {

	private DispensadorAcotado dispensador;
	private Object elemento;

	public ExDispensadorLleno(DispensadorAcotado dispensador,
			Object elemento) {
		super("No se puede meter el elemento " + elemento +
				" porque el dispensador está lleno");
		this.dispensador = dispensador;
		this.elemento = elemento;
	}

	public void reparar() {
		GestorIO.getGestorIO().out("Reparando......\n");
		dispensador.duplicar();
		try {
			dispensador.meter(elemento);
		} catch (ExDispensadorLleno ex) {}
	}
}
