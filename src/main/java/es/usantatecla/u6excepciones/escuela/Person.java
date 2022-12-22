package es.usantatecla.u6excepciones.escuela;

import java.io.Serializable;

abstract class Person implements Serializable {

	private String name;

	protected Person() {
		System.out.println("Persona(): nombre = " + name);
		name = "<vacio>";
	}

	public Person(String name) {
		System.out.println("Persona(" + name + ")");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void write();
}
