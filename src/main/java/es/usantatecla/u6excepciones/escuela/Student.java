package es.usantatecla.u6excepciones.escuela;

class Student extends Person {

	private float qualification = 0.1f;
	private Teacher[] teachers = new Teacher[100];
	private int numProfesores = 0;

	public Student(String nombre) {
		super(nombre);
		System.out.println("Alumno(" + nombre + ")");
	}

	public void setProfesor(Teacher profesor) {
		teachers[numProfesores++] = profesor;
	}

	public void write() {
		System.out.println("Alumno: " + this.getName() + " --------");
		for (int i = 0; i < numProfesores; i++) {
			System.out.println((i + 1) + ". " + teachers[i].getName());
		}
		System.out.println("Nota: " + qualification);
	}
}
