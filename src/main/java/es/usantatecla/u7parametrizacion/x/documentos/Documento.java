package es.usantatecla.u7parametrizacion.x.documentos;

import es.usantatecla.u7parametrizacion.x.componentes.Componente;
import es.usantatecla.u7parametrizacion.x.componentes.Visualizable;

public class Documento<V extends Visualizable> {

	private final int MAX_COMPONENTES;
	private Componente<V>[] componentes;
	private int numComponentes;

	public Documento(int maxComponentes) {
		MAX_COMPONENTES = maxComponentes;
		componentes = new Componente[MAX_COMPONENTES];
		numComponentes = 0;
	}

	public void addComponente(Componente<V> componente) {
		this.componentes[numComponentes++] = componente;
	}

	public IteradorDocumento<V> iterador() {
		return new IteradorDocumento<V>(componentes, numComponentes);
	}

//	public Componente<V> getComponente(int posicion) {
//		return this.componentes[posicion];
//	}
//
//	public void visualizar() {
//		for (int i = 0; i < numComponentes; i++) {
//			componentes[i].visualizar();
//		}
//	}
//
	public Documento<V> unirDocumentosIguales(Documento<V> documento) {
		Documento<V> documentoAux = new Documento<V>(
				MAX_COMPONENTES + documento.MAX_COMPONENTES);
		for (int i = 0; i < numComponentes; i++) {
			documentoAux.addComponente(componentes[i]);
		}
		for (int i = 0; i < documento.numComponentes; i++) {
			documentoAux.addComponente(documento.componentes[i]);
		}
		return documentoAux;
	}

	public <V2 extends Visualizable> Documento<Visualizable> unirDocumentos(
			Documento<V2> documento) {
		Documento<Visualizable> documentoAux = new Documento<Visualizable>(
				MAX_COMPONENTES + documento.MAX_COMPONENTES);
		for (int i = 0; i < numComponentes; i++) {
			documentoAux.addComponente(new Componente<Visualizable>(
					componentes[i].getNombre(),
					componentes[i].getContenido()));
		}
		for (int i = 0; i < documento.numComponentes; i++) {
			documentoAux.addComponente(new Componente<Visualizable>(
					documento.componentes[i].getNombre(),
					documento.componentes[i].getContenido()));
		}
		return documentoAux;
	}

	public Documento<Visualizable> unirDocumentos2(
			Documento<? extends Visualizable> documento) {
		Documento<Visualizable> documentoAux = new Documento<Visualizable>(
				MAX_COMPONENTES + documento.MAX_COMPONENTES);
		for (int i = 0; i < numComponentes; i++) {
			documentoAux.addComponente(new Componente<Visualizable>(
					componentes[i].getNombre(),
					componentes[i].getContenido()));
		}
		for (int i = 0; i < documento.numComponentes; i++) {
			documentoAux.addComponente(new Componente<Visualizable>(
					documento.componentes[i].getNombre(),
					documento.componentes[i].getContenido()));
		}
		return documentoAux;
	}
}
