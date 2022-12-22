package es.usantatecla.u7parametrizacion.x.componentes;

public class Componente<V extends Visualizable> implements Visualizable {

	private String nombre;
	private V contenido;

	public Componente(String nombre, V contenido) {
		this.nombre = nombre;
		this.contenido = contenido;
	}

	public String getNombre() {
		return nombre;
	}

	public V getContenido() {
		return contenido;
	}

	public void visualizar() {
		System.out.print(nombre + ": ");
		contenido.visualizar();
	}
}
