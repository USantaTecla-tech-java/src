package es.usantatecla.u7parametrizacion.dispensadores.dispensadores;

import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.colas.ColaAcotada;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.colas.ColaNoAcotada;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.pilas.PilaAcotada;
import es.usantatecla.u7parametrizacion.dispensadores.dispensadores.pilas.PilaNoAcotada;
import es.usantatecla.u7parametrizacion.dispensadores.util.GestorIO;
import es.usantatecla.u7parametrizacion.dispensadores.util.Intervalo;
import es.usantatecla.u7parametrizacion.dispensadores.util.Iterador;

public abstract class Dispensador<Elemento> {

	public abstract void meter(Elemento elemento) throws ExDispensadorLleno;

	public abstract Elemento sacar() throws ExDispensadorVacio;

	public abstract boolean vacio();

	public abstract Iterador<Elemento> iterador();

	public void invertir() {
		Dispensador<Elemento> dispensador = this.dispensadorAlterno();
		while (!this.vacio()) {
			try {
				dispensador.meter(this.sacar());
			} catch (ExDispensadorLleno ex) {
				ex.reparar();
			} catch (ExDispensadorVacio ex) {
			}
		}
		while (!dispensador.vacio()) {
			try {
				this.meter(dispensador.sacar());
			} catch (ExDispensadorLleno ex) {
				ex.reparar();
			} catch (ExDispensadorVacio ex) {
			}
		}
	}

	public abstract Dispensador<Elemento> dispensadorAlterno();

	public static void dump(Dispensador dispensadores[]) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		for (int i = 0; i < dispensadores.length; i++) {
			gestorIO.out("Dispensador " + (i + 1) + " ****************\n");
			Iterador iterador = dispensadores[i].iterador();
			int posicion = 1;
			while (iterador.hasNext()) {
				gestorIO.out(posicion + ": " + iterador.next() + "\n");
				posicion++;
			}
		}
	}

	public static void main(String arg[]) {
		GestorIO gestorIO = GestorIO.getGestorIO();
		// ERROR: No se puede crear una array generico
		// Dispensador<Intervalo> dispensadores[] =
		//		new Dispensador<Intervalo>[4];
		Dispensador<Intervalo> dispensadores[] = new Dispensador[4];
		int tamaños[] = { -4, 0, 4, 0};

		gestorIO.out("\n############ Inicial ############\n");
		int actual = 0;
		do {
			try {
				switch (actual) {
					case 0:
						dispensadores[actual] =
								new PilaAcotada<Intervalo>(tamaños[actual]);
						break;
					case 1:
						dispensadores[actual] =
								new PilaNoAcotada<Intervalo>();
						break;
					case 2:
						dispensadores[actual] =
								new ColaAcotada<Intervalo>(tamaños[actual]);
						break;
					case 3:
						dispensadores[actual] =
								new ColaNoAcotada<Intervalo>();
						break;
				}
				actual++;
			} catch (ExDispensadorInvalido ex) {
					gestorIO.out("Excepción al crear: " +
							ex.getMessage() + "\n");
				tamaños[actual] = -tamaños[actual];
			}
		} while (actual < 4);
		gestorIO.out("\n############ Tras crear ############\n");
		dump(dispensadores);

		gestorIO.out("\n############ Metiendo ############\n");
		for (int j = 0; j < dispensadores.length; j++) {
			for (int i = 0; i < 6; i++) {
				try {
					dispensadores[j].meter(new Intervalo(-i, i));
				} catch (ExDispensadorLleno ex) {
					gestorIO.out("Excepción al meter: " +
							ex.getMessage() + "\n");
					ex.reparar();
				}
			}
		}
		gestorIO.out("\n############ Tras meter ############\n");
		dump(dispensadores);

		gestorIO.out("\n############ Sacando ############\n");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < dispensadores.length; j++) {
				if (j % 2 != 0 || i < 4) {
					try {
						dispensadores[j].sacar();
					} catch (ExDispensadorVacio ex) {
						gestorIO.out("Excepción al sacar: " +
								ex.getMessage() + "\n");
					}
				}
			}
		}
		gestorIO.out("\n############ Tras sacar ############\n");
		dump(dispensadores);

//		gestorIO.out("\n############ Inviertiendo ############\n");
//		for (int i = 0; i < dispensadores.length; i++) {
//			dispensadores[i].invertir();
//		}
//		gestorIO.out("\n############ Tras invertir ############\n");
//		dump(dispensadores);
	}
}
