package es.usantatecla.nestedDocs;

// 1.1. Clases Internas

// Declaración de clase interna y gestión de sus objetos desde la clase externa

class Outer {

  class Inner {

  }

  private Inner attribute = new Inner();

  private Inner method(Inner inner) {
    Inner local = new Inner();
    return local;
  }

  static class StaticInner {
  }

  private StaticInner staticAttribute = new StaticInner();

  private StaticInner method(StaticInner inner) {
    StaticInner local = new StaticInner();
    return local;
  }
}

// Gestión de objetos de clase interna desde el exterior de la clase externa

class VisibilityOuter {

  private class PrivateInner {
  }

  protected class ProtectedInner {
  }

  public class PublicInner {
  }

  private static class StaticPrivateInner {
  }

  protected static class StaticProtectedInner {
  }

  public static class StaticPublicInner {
  }

}

class Other {

  // private VisibilityOuter.PrivateInner privateAttribute;
  private VisibilityOuter.ProtectedInner protectedAttribute; // depende de relaciones y paquetes
  private VisibilityOuter.PublicInner publicAttribute;
  // private VisibilityOuter.StaticPrivateInner staticPrivateInner;
  private VisibilityOuter.StaticPublicInner staticProtectedInner; // depende de relaciones y paquetes
  private VisibilityOuter.StaticPublicInner staticPublicInner;

  public VisibilityOuter.PublicInner m(VisibilityOuter.PublicInner parameter) {
    VisibilityOuter outer = new VisibilityOuter();
    VisibilityOuter.PublicInner local = outer.new PublicInner();
    return local;
  }

  public VisibilityOuter.StaticPublicInner m(VisibilityOuter.StaticPublicInner parameter) {
    VisibilityOuter.StaticPublicInner local = new VisibilityOuter.StaticPublicInner();
    return local;
  }

}
// ejemplo Mes estático de Date

// Accesibilidad miembros de la clase externa desde la clase interna

class AccessOuter {

  private int variableAttribute;
  private final int finalAttribute = 0;
  private static int staticVariableAttribute;
  private static final int finalStaticVariableAttribute = 0;

  class InstanceClass {

    public void instanceMethod() {
      int local1 = variableAttribute;
      int local2 = finalAttribute;
      int local3 = staticVariableAttribute;
      int local4 = finalStaticVariableAttribute;
    }

  }

  static class StaticClass {
    public void instanceMethod() {
      // int local1 = variableAttribute; Error
      // int local2 = finalAttribute; Error
      int local3 = staticVariableAttribute;
      int local4 = finalStaticVariableAttribute;
    }

    public static void staticMethod() {
      // int local1 = variableAttribute; Error
      // int local2 = finalAttribute; Error
      int local3 = staticVariableAttribute;
      int local4 = finalStaticVariableAttribute;
    }
  }

}

// Ejemplos:
// es/usantatecla/aX_menu/a4_5_parametrized/a4_modelDynamicMenu sin internas
// es/usantatecla/aX_menu/a6_inner internas en opciones y main

