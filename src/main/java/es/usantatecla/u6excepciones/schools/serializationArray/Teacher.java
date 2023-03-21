package es.usantatecla.u6excepciones.schools.serializationArray;

class Teacher extends Person {

	private int code;
	private Student[] students = new Student[100];
	private int numStudents = 0;

	public Teacher(String name, int code) {
		super(name);
		this.code = code;
		Console.getInstance().writeln("Profesor(" + name + ", " + code + ")");
	}

	public void setStudent(Student student) {
		this.students[this.numStudents++] = student;
		student.setTeacher(this);
	}

	public void show() {
		Console.getInstance().writeln("Profesor " + code + ": " + this.getName() + " --------");
		for (int i = 0; i < this.numStudents; i++) {
			Console.getInstance().writeln((i + 1) + ". " + students[i].getName());
		}
	}

}
