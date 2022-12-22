package es.usantatecla.u7parametrizacion.x.documentos2;

import es.usantatecla.u7parametrizacion.x.componentes2.Componente;

public class Documento<C extends Componente> {

	private final int MAX_COMPONENTES;
	private C[] componentes;
	private int numComponentes;

	public Documento(int maxComponentes) {
		MAX_COMPONENTES = maxComponentes;
		componentes = (C[]) new Componente[MAX_COMPONENTES];
		numComponentes = 0;
	}

	public void addComponente(C componente) {
		this.componentes[numComponentes++] = componente;
	}

	public IteradorDocumento<C> iterador() {
		return new IteradorDocumento<C>(componentes, numComponentes);
	}

//	public C getComponente(int posicion) {
//		return this.componentes[posicion];
//	}
//
//	public void visualizar() {
//		for (int i = 0; i < numComponentes; i++) {
//			componentes[i].visualizar();
//		}
//	}

	public Documento<C> unirDocumentosIguales(Documento<C> documento) {
		Documento<C> documentoAux = new Documento<C>(
				MAX_COMPONENTES + documento.MAX_COMPONENTES);
		for (int i = 0; i < numComponentes; i++) {
			documentoAux.addComponente(componentes[i]);
		}
		for (int i = 0; i < documento.numComponentes; i++) {
			documentoAux.addComponente(documento.componentes[i]);
		}
		return documentoAux;
	}

	public <T2 extends Componente> Documento<Componente> unirDocumentos(
			Documento<T2> documento) {
		Documento<Componente> documentoAux = new Documento<Componente>(
				MAX_COMPONENTES + documento.MAX_COMPONENTES);
		for (int i = 0; i < numComponentes; i++) {
			documentoAux.addComponente(componentes[i]);
		}
		for (int i = 0; i < documento.numComponentes; i++) {
			documentoAux.addComponente(componentes[i]);
		}
		return documentoAux;
	}

	public Documento<Componente> unirDocumentos2(
			Documento<? extends Componente> documento) {
		Documento<Componente> documentoAux = new Documento<Componente>(
				MAX_COMPONENTES + documento.MAX_COMPONENTES);
		for (int i = 0; i < numComponentes; i++) {
			documentoAux.addComponente(componentes[i]);
		}
		for (int i = 0; i < documento.numComponentes; i++) {
			documentoAux.addComponente(documento.componentes[i]);
		}
		return documentoAux;
	}
}
