package es.usantatecla.u6excepciones.escuela;

class Teacher extends Person {

	private int code;
	private AlumnoDinamico[] alumnos = new AlumnoDinamico[100];
	private float[] notas = new float[100];
	private int numAlumnos = 0;

	public Teacher(String nombre, int codigo) {
		super(nombre);
		this.code = codigo;
		System.out.println("Profesor(" + nombre + ", " + codigo + ")");
	}

	public void setAlumno(AlumnoDinamico alumno) {
		alumnos[numAlumnos++] = alumno;
		alumno.setProfesor(this);
	}

	public void write() {
		System.out.println("Profesor " + code + ": " +
				this.getName() + " --------");
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println((i + 1) + ". " + alumnos[i].getName());
		}
	}
}
