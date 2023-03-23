package es.usantatecla.aX_dispensers.a8_parametrized.a4_map;

import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.dispensers.unboundedDispensers.UnboundedQueue;
import es.usantatecla.aX_dispensers.a8_parametrized.a3_iterator.utils.Iterator;

class Map<Key, Value> {

  private static final int CAPACITY = 8191;

  private UnboundedQueue<Item<Key, Value>>[] queues = new UnboundedQueue[Map.CAPACITY];

  public Value put(Key key, Value value) {
    int i = this.hash(key);
    if (queues[i] == null) {
      queues[i] = new UnboundedQueue<Item<Key, Value>>();
    } else {
      Iterator<Item<Key, Value>> iterador = queues[i].getIterator();
      while (iterador.hasNext()) {
        Item<Key, Value> item = iterador.next();
        if (key.equals(item.getClave())) {
          Value antiguo = item.getValor();
          item.setValor(value);
          return antiguo;
        }
      }
    }
    queues[i].add(new Item<Key, Value>(key, value));
    return null;
  }

  public Value get(Key clave) {
    int i = this.hash(clave);
    UnboundedQueue<Item<Key, Value>> lista = queues[i];
    Iterator<Item<Key, Value>> iterador = lista.getIterator();
    while (iterador.hasNext()) {
      Item<Key, Value> item = iterador.next();
      if (clave.equals(item.getClave())) {
        return item.getValor();
      }
    }
    return null;
  }

  private int hash(Key clave) {
    int hash = clave.hashCode();
    if (hash < 0) {
      hash = Math.abs(hash + 1);
    }
    return hash % Map.CAPACITY;
  }

}