package es.usantatecla.a0_itinerario.a7_parametrized.a1_multimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class MultiMap<Key ,Value> {

	private Map<Key, Collection<Value>> maps =
			new HashMap<Key, Collection<Value>>();

	public boolean add(Key key, Value value) {
		boolean added = false;
		Collection<Value> collection = this.get(key);
		if (collection == null) {
			collection = new LinkedList<Value>();
			collection.add(value);
			maps.put(key, collection);
			added = true;
		} else {
			Value current = null;
			Iterator<Value> iterator = collection.iterator();
			while (iterator.hasNext() && !value.equals(current)) {
				current = iterator.next();
			}
			if (!value.equals(current)) {
				collection.add(value);
				maps.put(key, collection);
				added = true;
			}
		}
		return added;
	}

	public Collection<Value> get(Key key) {
		return this.maps.get(key);
	}


}
