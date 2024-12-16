package es.usantatecla.nestedDocs;

// 1.3. Clases Anónimas
// creación de un único objto de una clas declarada al vuelo a partir de una base
// error por absurda definición del constructor "imposible" de usar
// sí puede añadir atributos y redefinir métodos
// pero no puede añadir métodos no tiene sentido porque la referencia es a la clase base
  
abstract class Base {

  public void m() {

  }

  public void n() {

  }

}

class Nominal {

  private Base attribute = new Base() {

    public void m() {

    }
  };

  public Base method(Base parameter) {
    Base local = new Base() {

      public void m() {

      }

    };
    local.m();
    local.n();
    this.method(new Base() {

      public void m() {

      }
    });
    return new Base() {

      public void m() {

      }
    };
  }

}

// es/usantatecla/aX_menu/a7_local locales en opciones y main
// es/usantatecla/aX_menu/a8_anonymus anonimas en opciones pero no en main
