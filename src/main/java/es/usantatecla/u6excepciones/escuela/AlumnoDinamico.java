package es.usantatecla.u6excepciones.escuela;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import es.usantatecla.u6excepciones.util.listas.Iterator;
import es.usantatecla.u6excepciones.util.listas.List;

class AlumnoDinamico extends Person {

	private float nota = ((float) ((int) (Math.random() * 1000))) / 100;
	private transient List profesores = new List();	// NO SERIALIZABLE

	public AlumnoDinamico(String nombre) {
		super(nombre);
		System.out.println("Alumno(" + nombre + ")");
	}

	public void setProfesor(Teacher profesor) {
		profesores.add(profesor);
	}

	public void write() {
		System.out.println("Alumno: " + this.getName() + " --------");
		Iterator iterador = profesores.iterador();
		int i = 0;
		while (iterador.hasNext()) {
			Teacher profesor = (Teacher) iterador.next();
			System.out.println((++i) + ". " + profesor.getName());
		}
		System.out.println("Nota: " + nota);
	}

	private void readObject(ObjectInputStream in)
			throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		profesores = new List();
		int numProfesores = in.readInt();
		for (int i = 0; i < numProfesores; i++) {
			Teacher profesor = (Teacher) in.readObject();
			profesores.add(profesor);
		}
	}

	private void writeObject(ObjectOutputStream out)
			throws IOException {
		out.defaultWriteObject();
		out.writeInt(profesores.size());
		Iterator iterador = profesores.iterador();
		while (iterador.hasNext()) {
			Teacher profesor = (Teacher) iterador.next();
			out.writeObject(profesor);
		}
	}
}
