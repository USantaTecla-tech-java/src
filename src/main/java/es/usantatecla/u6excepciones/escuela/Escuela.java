package es.usantatecla.u6excepciones.escuela;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Escuela {

	public static void main(String[] args) {
		Escuela apl = new Escuela();
		apl.iniciar();
	}

	private Person[] personas = new Person[100];
	private int numPersonas = 0;

	public void iniciar() {
		AlumnoDinamico jose = new AlumnoDinamico("jose");
		AlumnoDinamico juan = new AlumnoDinamico("juan");
		AlumnoDinamico maria = new AlumnoDinamico("maria");
		Teacher ana = new Teacher("ana", 1);
		ana.setAlumno(jose);
		ana.setAlumno(juan);
		Teacher jesus = new Teacher("jesus", 2);
		jesus.setAlumno(juan);
		jesus.setAlumno(maria);
		personas[numPersonas++] = ana;
		personas[numPersonas++] = jesus;
		personas[numPersonas++] = jose;
		personas[numPersonas++] = juan;
		personas[numPersonas++] = maria;

		System.out.println("######### Inicial #########");
		this.escribir();

		System.out.println("######### Antes de guardar #########");
		this.guardar2();
		System.out.println("######### Despues de guardar #########");
		this.escribir();

		this.borrar();
		System.out.println("######### Despues de borrar #########");
		this.escribir();

		System.out.println("######### Antes de restaurar #########");
		this.restaurar2();
		System.out.println("######### Despues de restaurar #########");
		this.escribir();
	}

	private void escribir() {
		for (int i = 0; i < numPersonas; i++) {
			personas[i].write();
		}
	}

	private void borrar() {
		personas = null;
		numPersonas = 0;
	}

	private void guardar() {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream (new FileOutputStream("fichero.dat"));
			out.writeInt(numPersonas);
			for (int i = 0; i < numPersonas; i++) {
				out.writeObject(personas[i]);
			}
		} catch (IOException ex) {
			System.out.println("IOException al escribir: " +
				ex.getMessage());
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: " +
						ex.getMessage());
				}
			}
		}
	}

	private void restaurar() {
		personas = new Person[100];
		numPersonas = 0;
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream (new FileInputStream("fichero.dat"));
			int total = in.readInt();
			for (int i = 0; i < total; i++) {
				personas[numPersonas] = (Person) in.readObject();
				numPersonas++;
			}
		} catch (IOException ex) {
			System.out.println("IOException al leer: " +
				ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException al leer: " +
				ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: " +
						ex.getMessage());
				}
			}
		}
	}

	private void guardar2() {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream (new FileOutputStream("fichero.dat"));
			out.writeInt(numPersonas);
			out.writeObject(personas);
			out.close();
		} catch (IOException ex) {
			System.out.println("IOException al escribir: " +
				ex.getMessage());
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: " +
						ex.getMessage());
				}
			}
		}
	}

	private void restaurar2() {
		numPersonas = 0;
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream (new FileInputStream("fichero.dat"));
			int total = in.readInt();
			personas = (Person[]) in.readObject();
			numPersonas = total;
		} catch (IOException ex) {
			System.out.println("IOException al leer: " +
				ex.getMessage());
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException al leer: " +
				ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar: " +
						ex.getMessage());
				}
			}
		}
	}
}
