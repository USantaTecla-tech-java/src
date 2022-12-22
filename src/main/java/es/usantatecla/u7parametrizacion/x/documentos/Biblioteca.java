package es.usantatecla.u7parametrizacion.x.documentos;

import es.usantatecla.u7parametrizacion.x.componentes.Componente;
import es.usantatecla.u7parametrizacion.x.componentes.Formula;
import es.usantatecla.u7parametrizacion.x.componentes.Simbolo;
import es.usantatecla.u7parametrizacion.x.componentes.Texto;
import es.usantatecla.u7parametrizacion.x.componentes.Visualizable;

public class Biblioteca {

	public static void visualizar(Documento<?> documento) {
		IteradorDocumento<?> iterador = documento.iterador();
		while (iterador.hasNext()) {
			Componente<?> componente = iterador.next();
			componente.visualizar();
		}
	}

	public static void main(String[] arg) {
		Formula formula1 = new Formula(
				new Formula(new Simbolo("x"), "^", new Simbolo("2")),
				"<",
				new Formula(new Simbolo("3"), "*", new Simbolo("y")));
		Componente<Formula> ecuacion1 = new Componente<Formula>("Premisa",
				formula1);

		Formula formula2 = new Formula(
				new Simbolo("E"), "=", new Formula(
						new Simbolo("m"),
						"*",
						new Formula(new Simbolo("c"), "^", new Simbolo("2"))));
		Componente<Formula> ecuacion2 = new Componente<Formula>("Energia",
				formula2);

		Documento<Formula> documentoEcuaciones = new Documento<Formula>(5);
		documentoEcuaciones.addComponente(ecuacion1);
		documentoEcuaciones.addComponente(ecuacion2);
		System.out.println();
		System.out.println("DOCUMENTO DE ECUACIONES");
		Biblioteca.visualizar(documentoEcuaciones);

		Componente<Texto> bibliografia1 = new Componente<Texto>("Arnold",
				new Texto("El lenguaje de programación Java"));
		Componente<Texto> bibliografia2 = new Componente<Texto>("Deitel",
				new Texto("Cómo programar en Java"));

		Documento<Texto> documentoBibliografia = new Documento<Texto>(5);
		documentoBibliografia.addComponente(bibliografia1);
		documentoBibliografia.addComponente(bibliografia2);
		System.out.println();
		System.out.println("BIBLIOGRAFIA DE POOA");
		Biblioteca.visualizar(documentoBibliografia);

		Componente<Texto> web1 = new Componente<Texto>("API Java",
				new Texto("http://docs.oracle.com/javase/7/docs/api/"));
		
		Documento<Texto> documentoWeb = new Documento<Texto>(5);
		documentoWeb.addComponente(web1);
		System.out.println();
		System.out.println("REFERENCIAS WEB DE POOA");
		Biblioteca.visualizar(documentoWeb);

		Documento<Texto> referencias =
				documentoBibliografia.unirDocumentosIguales(documentoWeb);
		System.out.println();
		System.out.println("TODAS LAS REFERENCIAS DE POOA");
		Biblioteca.visualizar(referencias);

		Documento<Visualizable> docTotal =
				referencias.unirDocumentos(documentoEcuaciones);
		System.out.println();
		System.out.println("REFERENCIAS Y FORMULAS DE POOA");
		Biblioteca.visualizar(docTotal);

		Documento<Visualizable> docTotal2 =
				referencias.unirDocumentos2(documentoEcuaciones);
		System.out.println();
		System.out.println("REFERENCIAS Y FORMULAS DE POOA");
		Biblioteca.visualizar(docTotal2);
	}
}
