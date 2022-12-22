package es.usantatecla.u7parametrizacion.x.componentes2;

public class Simbolo implements Operando {

	private String nombre;

	public Simbolo(String nombre) {
		this.nombre = nombre;
	}

	public String getTexto() {
		return nombre;
	}
}
