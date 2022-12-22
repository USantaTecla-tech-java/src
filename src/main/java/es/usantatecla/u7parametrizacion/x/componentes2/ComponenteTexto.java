package es.usantatecla.u7parametrizacion.x.componentes2;

public class ComponenteTexto extends Componente {

	private String texto;

	public ComponenteTexto(String nombre, String texto) {
		super(nombre);
		this.texto = texto;
	}

	public void visualizar() {
		System.out.println(nombre + ": " + texto);
	}
}
