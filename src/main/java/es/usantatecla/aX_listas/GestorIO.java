package es.usantatecla.aX_listas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class GestorIO {

	private static BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	private static GestorIO gestorIO = new GestorIO();

	public static GestorIO getGestorIO() {
		return gestorIO;
	}

	private GestorIO() {
	}

	public String readString(String mensaje) {
		String entrada = null;
		boolean valido = false;
		do {
			this.write(mensaje);
			try {
				entrada = br.readLine();
				valido = true;
			} catch (Exception e) {
				this.writelnError("de cadena de caracteres");
			}
		} while (!valido);
		return entrada;
	}

	public int readInt(String mensaje) {
		int entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Integer.parseInt(this.readString(mensaje));
				valido = true;
			} catch (Exception e) {
				this.writelnError("entero");
			}
		} while (!valido);
		return entrada;
	}

	public float readFloat(String mensaje) {
		float entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Float.parseFloat(this.readString(mensaje));
				valido = true;
			} catch (Exception e) {
				this.writelnError("real");
			}
		} while (!valido);
		return entrada;
	}

	public double readDouble(String mensaje) {
		double entrada = 0.0;
		boolean valido = false;
		do {
			try {
				entrada = Double.parseDouble(this.readString(mensaje));
				valido = true;
			} catch (Exception e) {
				this.writelnError("real");
			}
		} while (!valido);
		return entrada;
	}

	public long readLong(String mensaje) {
		long entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Long.parseLong(this.readString(mensaje));
				valido = true;
			} catch (Exception e) {
				this.writelnError("entero");
			}
		} while (!valido);
		return entrada;
	}

	public byte readByte(String mensaje) {
		byte entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Byte.parseByte(this.readString(mensaje));
				valido = true;
			} catch (Exception e) {
				this.writelnError("entero");
			}
		} while (!valido);
		return entrada;
	}

	public short readShort(String mensaje) {
		short entrada = 0;
		boolean valido = false;
		do {
			try {
				entrada = Short.parseShort(this.readString(mensaje));
				valido = true;
			} catch (Exception e) {
				this.writelnError("entero");
			}
		} while (!valido);
		return entrada;
	}

	public char readChar(String mensaje) {
		char caracter = ' ';
		boolean valido = false;
		do {
			String entrada = this.readString(mensaje);
			if (entrada.length() != 1) {
				this.writelnError("caracter");
			} else {
				caracter = entrada.charAt(0);
				valido = true;
			}
		} while (!valido);
		return caracter;
	}

	public boolean readBoolean(String mensaje) {
		boolean entradaLogica = true;
		boolean valido = false;
		do {
			String entrada = this.readString(mensaje);
			if (entrada.equalsIgnoreCase("true") ||
					entrada.equalsIgnoreCase("false")) {
				entradaLogica = Boolean.valueOf(entrada).booleanValue();
				valido = true;
			} else {
				this.writelnError("logico");
			}
		} while (!valido);
		return entradaLogica;
	}

	public void write(String salida) {
		System.out.print(salida);
	}

	public void writeln(String salida) {
		System.out.println(salida);
	}

	public void write(int salida) {
		System.out.print(salida);
	}

	public void writeln(int salida) {
		System.out.println(salida);
	}

	public void write(float salida) {
		System.out.print(salida);
	}

	public void writeln(float salida) {
		System.out.println(salida);
	}

	public void write(double salida) {
		System.out.print(salida);
	}

	public void writeln(double salida) {
		System.out.println(salida);
	}

	public void write(long salida) {
		System.out.print(salida);
	}

	public void writeln(long salida) {
		System.out.println(salida);
	}

	public void write(byte salida) {
		System.out.print(salida);
	}

	public void writeln(byte salida) {
		System.out.println(salida);
	}

	public void write(short salida) {
		System.out.print(salida);
	}

	public void writeln(short salida) {
		System.out.println(salida);
	}

	public void write(char salida) {
		System.out.print(salida);
	}

	public void writeln(char salida) {
		System.out.println(salida);
	}

	public void write(boolean salida) {
		System.out.print(salida);
	}

	public void writeln(boolean salida) {
		System.out.println(salida);
	}

	public void writeln() {
		System.out.println();
	}

	private void writelnError(String formato) {
		System.out.println("ERROR DE FORMATO! " +
				"Introduzca un valor con formato " + formato + ".");
	}

	public static void main(String args[]) {
		GestorIO gestorIO = GestorIO.getGestorIO();

		gestorIO.writeln(gestorIO.readInt("ENTERO? "));
		gestorIO.writeln(gestorIO.readChar("CARACTER? "));
		gestorIO.writeln(gestorIO.readFloat("REAL? "));
		gestorIO.writeln(gestorIO.readBoolean("BOOLEAN? "));
	}
}

