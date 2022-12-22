package es.usantatecla.u7parametrizacion.dispensadores.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GestorIO {

	private static BufferedReader b =
			new BufferedReader(new InputStreamReader(System.in));
	private static GestorIO gestorIO = new GestorIO();

	public static GestorIO getGestorIO() {
		return gestorIO;
	}

	private GestorIO() {
	}

	public String inString(String titulo) {
		String entrada = null;
		boolean valido = false;
		do {
			this.out(titulo);
			try {
				entrada = b.readLine();
				valido = true;
			} catch (Exception e) {
				this.mostrarError("de cadena de caracteres");
			}
		} while (!valido);
		return entrada;
	}

	public int inInt(String titulo) {
		int entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Integer.parseInt(this.inString(titulo));
				valido = true;
			} catch (Exception e) {
				this.mostrarError("entero");
			}
		} while (!valido);
		return entrada;
	}

	public float inFloat(String titulo) {
		float entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Float.parseFloat(this.inString(titulo));
				valido = true;
			} catch (Exception e) {
				this.mostrarError("real");
			}
		} while (!valido);
		return entrada;
	}

	public double inDouble(String titulo) {
		double entrada = 0.0;
		boolean valido = false;
		do {
			try {
				entrada = Double.parseDouble(this.inString(titulo));
				valido = true;
			} catch (Exception e) {
				this.mostrarError("real");
			}
		} while (!valido);
		return entrada;
	}

	public long inLong(String titulo) {
		long entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Long.parseLong(this.inString(titulo));
				valido = true;
			} catch (Exception e) {
				this.mostrarError("entero");
			}
		} while (!valido);
		return entrada;
	}

	public byte inByte(String titulo) {
		byte entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Byte.parseByte(this.inString(titulo));
				valido = true;
			} catch (Exception e) {
				this.mostrarError("entero");
			}
		} while (!valido);
		return entrada;
	}

	public short inShort(String titulo) {
		short entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Short.parseShort(this.inString(titulo));
				valido = true;
			} catch (Exception e) {
				this.mostrarError("entero");
			}
		} while (!valido);
		return entrada;
	}

	public char inChar(String titulo) {
		char caracter = ' ';
		boolean valido = false;
		do {
			String entrada = this.inString(titulo);
			if (entrada.length() != 1) {
				this.mostrarError("caracter");
			} else {
				caracter = entrada.charAt(0);
				valido = true;
			}
		} while (!valido);
		return caracter;
	}

	public boolean inBoolean(String titulo) {
		boolean entradaLogica = true;
		boolean valido = false;
		do {
			String entrada = this.inString(titulo);
			if (entrada.equalsIgnoreCase("true") ||
					entrada.equalsIgnoreCase("false")) {
				entradaLogica = Boolean.valueOf(entrada).booleanValue();
				valido = true;
			} else {
				this.mostrarError("logico");
			}
		} while (!valido);
		return entradaLogica;
	}

	public void out(String salida) {
		System.out.print(salida);
	}

	public void out(int salida) {
		System.out.print(salida);
	}

	public void out(float salida) {
		System.out.print(salida);
	}

	public void out(double salida) {
		System.out.print(salida);
	}

	public void out(long salida) {
		System.out.print(salida);
	}

	public void out(byte salida) {
		System.out.print(salida);
	}

	public void out(short salida) {
		System.out.print(salida);
	}

	public void out(char salida) {
		System.out.print(salida);
	}

	public void out(boolean salida) {
		System.out.print(salida);
	}

	private void mostrarError(String formato) {
		System.out.println("ERROR DE FORMATO! " +
				"Introduzca un valor con formato " + formato + ".");
	}

	public static void main(String args[]) {
		GestorIO gestor = new GestorIO();

		gestor.out(gestor.inInt("ENTERO? "));
		gestor.out(gestor.inChar("CARACTER? "));
		gestor.out(gestor.inFloat("REAL? "));
		gestor.out(gestor.inBoolean("BOOLEAN? "));
	}
}
