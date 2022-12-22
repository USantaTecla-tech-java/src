package es.usantatecla.u7parametrizacion.x.componentes2;

public class ComponenteFormula extends Componente {

	private Formula formula;

	public ComponenteFormula(String nombre, Formula formula) {
		super(nombre);
		this.formula = formula;
	}

	public void visualizar() {
		System.out.println(nombre + ": " + formula.getTexto());
	}
}
