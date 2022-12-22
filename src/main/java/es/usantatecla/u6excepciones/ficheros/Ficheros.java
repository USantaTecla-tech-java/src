package es.usantatecla.u6excepciones.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Ficheros {

    public static void leerTexto() {
	BufferedReader in = null;
	try {
	    in = new BufferedReader(new FileReader("fichero.txt"));
	    String linea;
	    while ((linea = in.readLine()) != null) {
		System.out.println(linea);
	    }
	} catch (IOException ex) {
	    System.out.println("IOException al leer: " + ex.getMessage());
	} finally {
	    if (in != null) {
		try {
		    in.close();
		} catch (IOException ex) {
		    System.out.println("IOException al cerrar: "
			    + ex.getMessage());
		}
	    }
	}
    }

    public static void escribirTexto() {
	PrintWriter out = null;
	try {
	    out = new PrintWriter("fichero.txt");
	    out.print(1);
	    out.print(':');
	    out.print(" juan = ");
	    out.println(5.5);
	    out.println(2 + ": jose = " + 7.2);
	} catch (IOException ex) {
	    System.out.println("IOException al escribir:" + ex.getMessage());
	} finally {
	    if (out != null) {
		out.close();
	    }
	}
    }

    public static void escribirTexto2() {
	BufferedWriter out = null;
	try {
	    out = new BufferedWriter(new FileWriter("fichero.txt"));
	    out.write("1");
	    out.write(':');
	    out.write(" juan = ");
	    out.write("5.5");
	    out.newLine();
	    out.write(2 + ": jose = " + 7.2);
	    out.newLine();
	} catch (IOException ex) {
	    System.out.println("IOException al escribir:" + ex.getMessage());
	} finally {
	    if (out != null) {
		try {
		    out.close();
		} catch (IOException ex) {
		    System.out.println("IOException al cerrar: "
			    + ex.getMessage());
		}
	    }
	}
    }

    public static void escribirBinario() {
	DataOutputStream out = null;
	try {
	    out = new DataOutputStream(new FileOutputStream("fichero.dat"));
	    out.writeInt(1);
	    out.writeChar(':');
	    out.writeUTF(" juan = ");
	    out.writeDouble(5.5);
	    out.writeInt(2);
	    out.writeChar(':');
	    out.writeUTF(" jose = ");
	    out.writeDouble(7.2);
	} catch (IOException ex) {
	    System.out.println("IOException al escribir: " + ex.getMessage());
	} finally {
	    if (out != null) {
		try {
		    out.close();
		} catch (IOException ex) {
		    System.out.println("IOException al cerrar: "
			    + ex.getMessage());
		}
	    }
	}
    }

    public static void leerBinario() {
	DataInputStream in = null;
	try {
	    in = new DataInputStream(new FileInputStream("fichero.dat"));
	    System.out.println(in.readInt() + String.valueOf(in.readChar())
		    + in.readUTF() + in.readDouble());
	    System.out.println(in.readInt() + String.valueOf(in.readChar())
		    + in.readUTF() + in.readDouble());
	} catch (IOException ex) {
	    System.out.println("IOException al leer: "
		    + ex.getMessage());
	} finally {
	    if (in != null) {
		try {
		    in.close();
		} catch (IOException ex) {
		    System.out.println("IOException al cerrar: "
			    + ex.getMessage());
		}
	    }
	}
    }

    public static void main(String[] args) {
	Ficheros.escribirTexto2();
	Ficheros.leerTexto();
	System.out.println("----------------------------------");
	Ficheros.escribirBinario();
		Ficheros.leerBinario();
    }
}
