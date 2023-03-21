package es.usantatecla.aX_managers.schools.serializationCustomized;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student extends Person {

	private float qualification = (float) 5.0;
	private transient List teachers = new List();	// NO SERIALIZABLE

	public Student(String name) {
		super(name);
		Console.getInstance().writeln("Alumno(" + name + ")");
	}

	public void setTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}

	public void show() {
		Console.getInstance().writeln("Alumno: " + this.getName() + " --------");
		Iterator iterator = this.teachers.iterador();
		int i = 0;
		while (iterator.hasNext()) {
			Teacher tearcher = (Teacher) this.teachers.get(i);
			Console.getInstance().writeln((i + 1) + ". " + tearcher.getName());
			i++;
		}
		Console.getInstance().writeln("Nota: " + this.qualification);
	}

	private void readObject(ObjectInputStream in)
			throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		teachers = new List();
		int numProfesores = in.readInt();
		for (int i = 0; i < numProfesores; i++) {
			Teacher profesor = (Teacher) in.readObject();
			teachers.add(profesor);
		}
	}

	private void writeObject(ObjectOutputStream out)
			throws IOException {
		out.defaultWriteObject();
		out.writeInt(this.teachers.size());
		Iterator iterador = this.teachers.iterador();
		while (iterador.hasNext()) {
			Teacher profesor = (Teacher) iterador.next();
			out.writeObject(profesor);
		}
	}

}
