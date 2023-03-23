package es.usantatecla.aX_dispensers.a8_parametrized.a4_map.a1_arrays;

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
