package es.usantatecla.u7parametrizacion.x.componentes;

public class Texto implements Visualizable {

	private String texto;

	public Texto(String texto) {
		this.texto = texto;
	}

	public void visualizar() {
		System.out.println(texto);
	}
}
