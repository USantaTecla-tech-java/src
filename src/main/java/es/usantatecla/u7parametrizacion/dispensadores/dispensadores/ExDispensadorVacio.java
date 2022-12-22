package es.usantatecla.u7parametrizacion.dispensadores.dispensadores;

// NO SE PUEDE PARAMETRIZAR
public class ExDispensadorVacio extends Exception {

	public ExDispensadorVacio() {
		super("El dispensador está vacío");
	}
}
