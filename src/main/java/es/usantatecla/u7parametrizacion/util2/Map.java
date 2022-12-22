package es.usantatecla.u7parametrizacion.util2;

class Item<Clave, Valor> {

	private Clave clave;
	private Valor valor;

	Item(Clave clave, Valor valor) {
		this.clave = clave;
		this.valor = valor;
	}

	Clave getClave() {
		return clave;
	}

	Valor getValor() {
		return valor;
	}

	void setValor(Valor valor) {
		this.valor = valor;
	}
}

public class Map<Clave, Valor> {

	private static final int CAPACIDAD = 8191;
	private Lista<Item<Clave, Valor>> listaClavesValores =
			new Lista<Item<Clave, Valor>>();
	private Lista<Item<Clave, Valor>>[] listas = new Lista[CAPACIDAD];

	public Valor put(Clave clave, Valor valor) {
		int i = this.hash(clave);
		if (listas[i] == null) {
			listas[i] = new Lista<Item<Clave, Valor>>();
		} else {
			Iterador<Item<Clave, Valor>> iterador = listas[i].iterador();
			while (iterador.hasNext()) {
				Item<Clave, Valor> item = iterador.next();
				if (clave.equals(item.getClave())) {
					Valor antiguo = item.getValor();
					item.setValor(valor);
					return valor;
				}
			}
		}
		listas[i].add(new Item<Clave, Valor>(clave, valor));
		return null;
	}

	public Valor get(Clave clave) {
		int i = this.hash(clave);
		Lista<Item<Clave, Valor>> lista = listas[i];
		Iterador<Item<Clave, Valor>> iterador = lista.iterador();
		while (iterador.hasNext()) {
			Item<Clave, Valor> item = iterador.next();
			if (clave.equals(item.getClave())) {
				return item.getValor();
			}
		}
		return null;
	}

	private int hash(Clave clave) {
		int hash = clave.hashCode();
		if (hash < 0) {
			hash = Math.abs(hash + 1);
		}
		return hash % CAPACIDAD;
	}

	public static void main(String[] args) {
		Map<String, Integer> map = new Map<String, Integer>();
		map.put("Enero", new Integer(31));
		map.put("Febrero", new Integer(28));
		map.put("Marzo", new Integer(31));
		map.put("Abril", new Integer(30));
		map.put("Mayo", new Integer(31));

		System.out.println("Enero = " + map.get("Enero"));
		System.out.println("Febrero = " + map.get("Febrero"));
		System.out.println("Marzo = " + map.get("Marzo"));
		System.out.println("Abril = " + map.get("Abril"));
		System.out.println("Mayo = " + map.get("Mayo"));
	}
}
