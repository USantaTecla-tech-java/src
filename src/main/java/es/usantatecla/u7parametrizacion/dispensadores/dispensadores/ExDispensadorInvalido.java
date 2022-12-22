package es.usantatecla.u7parametrizacion.dispensadores.dispensadores;

// NO SE PUEDE PARAMETRIZAR
public class ExDispensadorInvalido extends Exception {

	public ExDispensadorInvalido(int tamaño) {
		super("El tamaño '" + tamaño + "' del dispensador no es válido");
	}
}
