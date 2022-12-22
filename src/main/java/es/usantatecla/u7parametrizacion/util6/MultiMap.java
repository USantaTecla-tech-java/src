package es.usantatecla.u7parametrizacion.util6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class MultiMap<Clave ,Valor> {

	private Map<Clave, Collection<Valor>> map =
			new HashMap<Clave, Collection<Valor>>();

	public boolean add(Clave clave, Valor valor) {
		boolean add = false;
		Collection<Valor> coleccion = this.get(clave);
		if (coleccion == null) {
			coleccion = new LinkedList<Valor>();
			coleccion.add(valor);
			map.put(clave, coleccion);
			add = true;
		} else {
			Valor actual = null;
			Iterator<Valor> iterador = coleccion.iterator();
			while (iterador.hasNext() && !valor.equals(actual)) {
				actual = iterador.next();
			}
			if (!valor.equals(actual)) {
				coleccion.add(valor);
				map.put(clave, coleccion);
				add = true;
			}
		}
		return add;
	}

	public Collection<Valor> get(Clave clave) {
		return map.get(clave);
	}

	public static void main(String[] args) {
		MultiMap<String, Integer> multimap = new MultiMap<String, Integer>();
		multimap.add("Enero", new Integer(1));
		multimap.add("Enero", new Integer(2));
		multimap.add("Enero", new Integer(1));
		multimap.add("Febrero", new Integer(1));
		multimap.add("Febrero", new Integer(1));
		multimap.add("Marzo", new Integer(1));
		multimap.add("Marzo", new Integer(3));
		multimap.add("Marzo", new Integer(2));

		System.out.println("Enero = " + multimap.get("Enero"));
		System.out.println("Febrero = " + multimap.get("Febrero"));
		System.out.println("Marzo = " + multimap.get("Marzo"));
		System.out.println("Abril = " + multimap.get("Abril"));
	}
}
