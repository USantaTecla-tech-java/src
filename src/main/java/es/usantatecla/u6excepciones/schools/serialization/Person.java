package es.usantatecla.u6excepciones.schools.serialization;

import java.io.Serializable;

abstract class Person implements Serializable {

	private String name;

	public Person(String name) {
		Console.getInstance().writeln("Persona(" + name + ")");
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract void show();

}
