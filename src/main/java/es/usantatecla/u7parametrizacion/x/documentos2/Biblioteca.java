package es.usantatecla.u7parametrizacion.x.documentos2;

import es.usantatecla.u7parametrizacion.x.componentes2.Componente;
import es.usantatecla.u7parametrizacion.x.componentes2.ComponenteFormula;
import es.usantatecla.u7parametrizacion.x.componentes2.ComponenteTexto;
import es.usantatecla.u7parametrizacion.x.componentes2.Formula;
import es.usantatecla.u7parametrizacion.x.componentes2.Simbolo;

public class Biblioteca {

	public static void visualizar(Documento<?> documento) {
		IteradorDocumento<?> iterador = documento.iterador();
		while (iterador.hasNext()) {
			iterador.next().visualizar();
		}
	}

	public static void main(String[] arg) {
		Formula formula1 = new Formula(
				new Formula(new Simbolo("x"), "^", new Simbolo("2")),
				"<",
				new Formula(new Simbolo("3"), "*", new Simbolo("y")));
		ComponenteFormula ecuacion1 = new ComponenteFormula("Premisa",
				formula1);

		Formula formula2 = new Formula(
				new Simbolo("E"), "=", new Formula(
						new Simbolo("m"),
						"*",
						new Formula(new Simbolo("c"), "^", new Simbolo("2"))));

		ComponenteFormula ecuacion2 = new ComponenteFormula("Energia",
				formula2);
		Documento<ComponenteFormula> documentoEcuaciones =
				new Documento<ComponenteFormula>(5);
		documentoEcuaciones.addComponente(ecuacion1);
		documentoEcuaciones.addComponente(ecuacion2);
		System.out.println();
		System.out.println("DOCUMENTO DE ECUACIONES");
		Biblioteca.visualizar(documentoEcuaciones);

		ComponenteTexto bibliografia1 = new ComponenteTexto("Arnold",
				"El lenguaje de programación Java");
		ComponenteTexto bibliografia2 = new ComponenteTexto("Deitel",
				"Cómo programar en Java");
		Documento<ComponenteTexto> documentoBibliografia =
				new Documento<ComponenteTexto>(5);
		documentoBibliografia.addComponente(bibliografia1);
		documentoBibliografia.addComponente(bibliografia2);
		System.out.println();
		System.out.println("BIBLIOGRAFIA DE POOA");
		Biblioteca.visualizar(documentoBibliografia);

		ComponenteTexto web1 = new ComponenteTexto("API Java",
				"http://docs.oracle.com/javase/7/docs/api/");
		Documento<ComponenteTexto> documentoWeb =
				new Documento<ComponenteTexto>(5);
		documentoWeb.addComponente(web1);
		System.out.println();
		System.out.println("REFERENCIAS WEB DE POOA");
		Biblioteca.visualizar(documentoWeb);

		Documento<ComponenteTexto> referencias =
				documentoBibliografia.unirDocumentosIguales(documentoWeb);
		System.out.println();
		System.out.println("TODAS LAS REFERENCIAS DE POOA");
		Biblioteca.visualizar(referencias);

		Documento<Componente> docTotal =
				referencias.unirDocumentos(documentoEcuaciones);
		System.out.println();
		System.out.println("REFERENCIAS Y FORMULAS DE POOA");
		Biblioteca.visualizar(docTotal);

		Documento<Componente> docTotal2 =
				referencias.unirDocumentos2(documentoEcuaciones);
		System.out.println();
		System.out.println("REFERENCIAS Y FORMULAS DE POOA");
		Biblioteca.visualizar(docTotal2);
	}
}
