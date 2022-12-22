package es.usantatecla.u7parametrizacion.x.componentes2;

public abstract class Componente implements Visualizable {

	protected String nombre;

	protected Componente(String nombre) {
		this.nombre = nombre;
	}

	public abstract void visualizar();
}

