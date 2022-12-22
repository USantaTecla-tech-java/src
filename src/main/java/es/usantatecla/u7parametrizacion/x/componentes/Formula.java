package es.usantatecla.u7parametrizacion.x.componentes;

public class Formula implements Operando, Visualizable {

	private Operando primero;
	private String operador;
	private Operando segundo;

	public Formula(Operando primero, String operador, Operando segundo) {
		this.primero = primero;
		this.operador = operador;
		this.segundo = segundo;
	}

	public String getTexto() {
		return primero.getTexto() + operador + segundo.getTexto();
	}

	public void visualizar() {
		System.out.println(this.getTexto());
	}
}
