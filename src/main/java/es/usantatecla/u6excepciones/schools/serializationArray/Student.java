package es.usantatecla.u6excepciones.schools.serializationArray;

class Student extends Person {

	private float qualification = (float) 5.0;
	private Teacher[] teachers = new Teacher[100];
	private int numTeachers = 0;

	public Student(String name) {
		super(name);
		Console.getInstance().writeln("Alumno(" + name + ")");
	}

	public void setTeacher(Teacher teacher) {
		this.teachers[this.numTeachers++] = teacher;
	}

	public void show() {
		Console.getInstance().writeln("Alumno: " + this.getName() + " --------");
		for (int i = 0; i < this.numTeachers; i++) {
			Console.getInstance().writeln((i + 1) + ". " + this.teachers[i].getName());
		}
		Console.getInstance().writeln("Nota: " + this.qualification);
	}

}
