package es.usantatecla.u6excepciones.schools.serializationArray;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class School {

	private Person[] persons = new Person[100];
	private int numPersons = 0;

	public void manage() {
		Student jose = new Student("jose");
		Student juan = new Student("juan");
		Student maria = new Student("maria");
		Teacher ana = new Teacher("ana", 1);
		ana.setStudent(jose);
		ana.setStudent(juan);
		Teacher jesus = new Teacher("jesus", 2);
		jesus.setStudent(juan);
		jesus.setStudent(maria);
		this.persons[this.numPersons++] = ana;
		this.persons[this.numPersons++] = jesus;
		this.persons[this.numPersons++] = jose;
		this.persons[this.numPersons++] = juan;
		this.persons[this.numPersons++] = maria;

		Console.getInstance().writeln("Tras grabar");
		this.write();
		this.show();
		
		Console.getInstance().writeln("Tras borrar");
		this.delete();
		this.show();

		Console.getInstance().writeln("Tras recuperar");
		this.read();
		this.show();
	}

	private void show() {
		for (int i=0; i < this.numPersons; i++) {
			this.persons[i].show();
		}
	}

	private void write() {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream (new FileOutputStream("fichero.dat"));
			out.writeInt(numPersons);
			out.writeObject(persons);
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

	private void delete() {
		persons = null;
		numPersons = 0;
	}

	private void read() {
		numPersons = 0;
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream (new FileInputStream("fichero.dat"));
			int total = in.readInt();
			persons = (Person[]) in.readObject();
			numPersons = total;
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

	public static void main(String[] args) {
		new School().manage();
	}
}
