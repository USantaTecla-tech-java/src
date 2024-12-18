package es.usantatecla.nestedDocs;

import java.util.function.Predicate;

// 1.4. Expresiones Lambda
// funciones anónimas, objeto/función, función flecha, ... 
// objetos de clases anónimas derivadas de interfaces/clases con un único método
// "incorporan" funciones de orden superior (patrón estrategia)
// con una notación de "función"

class ExternalPositivePredicate implements Predicate<Integer> {
  public boolean test(Integer integer) {
    return integer.intValue() > 0;
  }
}

class App {

  static class InnerPositivePredicate implements Predicate<Integer> {
    public boolean test(Integer integer) {
      return integer.intValue() > 0;
    }
  }

  public static void main(String[] args) {

    class LocalPositivePredicate implements Predicate<Integer> {
      public boolean test(Integer integer) {
        return integer.intValue() > 0;
      }
    }

    ExternalPositivePredicate externalPositivePredicate = new ExternalPositivePredicate();
    InnerPositivePredicate innerPositivePredicate = new InnerPositivePredicate();
    LocalPositivePredicate localPositivePredicate = new LocalPositivePredicate();
    Predicate<Integer> anonymusPositivePredicate = new Predicate<Integer>() {
      public boolean test(Integer integer) {
        return integer.intValue() > 0;
      }
    };

    Console.getInstance().writeln(externalPositivePredicate.test(3));
    Console.getInstance().writeln(innerPositivePredicate.test(3));
    Console.getInstance().writeln(localPositivePredicate.test(3));
    Console.getInstance().writeln(anonymusPositivePredicate.test(3));

    Predicate<Integer> externalPositivePredicate2 = new ExternalPositivePredicate();
    Predicate<Integer> innerPositivePredicate2 = new InnerPositivePredicate();
    Predicate<Integer> localPositivePredicate2 = new LocalPositivePredicate();
    Predicate<Integer> anonymusPositivePredicate2 = new Predicate<Integer>() {
      public boolean test(Integer integer) {
        return integer.intValue() > 0;
      }
    };

    Console.getInstance().writeln(externalPositivePredicate2.test(3));
    Console.getInstance().writeln(innerPositivePredicate2.test(3));
    Console.getInstance().writeln(localPositivePredicate2.test(3));
    Console.getInstance().writeln(anonymusPositivePredicate2.test(3));

    Predicate<Integer> allLambdaPredicate = (Integer integer) -> {
      return integer.intValue() > 0;
    };
    Predicate<Integer> withoutTypeLambdaPredicate = integer -> {
      return integer.intValue() > 0;
    };
    Predicate<Integer> withoutReturnLambdaPredicate = integer -> integer.intValue() > 0;

    Console.getInstance().writeln(allLambdaPredicate.test(3));
    Console.getInstance().writeln(withoutTypeLambdaPredicate.test(3));
    Console.getInstance().writeln(withoutReturnLambdaPredicate.test(3));
    // Console.getInstance().writeln(((integer) -> integer.intValue() > 0).test(3));

  }

}

// Referencia a Métodos!!!!

// Obtención de referencia a métodos como funciones lambda
// Clase::metodo
// Clase::new

// desde el ámbito de la función lambda se tiene acceso a los ámbitos que lo
// contienen
// - atributos de la clase
// - parámetros y locales del método
// PERO tienen que ser constantes o constantes efectivas,
// variables que no varían durante la ejecución del cuerpo de la función
// anónima!!!!

class AccessApp {

  private int variableAttribute;
  private final int finalAttribute = 0;
  private static int staticVariableAttribute;
  private static final int finalStaticVariableAttribute = 0;

  public static void main(String[] args) {
    AccessApp.staticMethod(0);
    new AccessApp().instanceMethod(0);
  }

  public void instanceMethod(int param) {
    int local = 0;
    Predicate<Integer> function = (integer) -> {
      Console.getInstance().writeln(variableAttribute);
      variableAttribute++;
      Console.getInstance().writeln(finalAttribute);
      Console.getInstance().writeln(staticVariableAttribute);
      staticVariableAttribute++;
      Console.getInstance().writeln(finalStaticVariableAttribute);
      Console.getInstance().writeln(param);
      // param++; no es constante efectiva
      Console.getInstance().writeln(local);
      // local++; no es constante efectiva
      Console.getInstance().writeln(integer);
      integer++;
      return true;
    };
  }

  public static void staticMethod(int param) {
    int local = 0;
    Predicate<Integer> function = (integer) -> {
      // Console.getInstance().writeln(variableAttribute); no estático
      // variableAttribute++; no estático
      // Console.getInstance().writeln(finalAttribute); no estático
      Console.getInstance().writeln(staticVariableAttribute);
      staticVariableAttribute++;
      Console.getInstance().writeln(finalStaticVariableAttribute);
      Console.getInstance().writeln(param);
      // param++; no es constante efectiva
      Console.getInstance().writeln(local);
      // local++; no es constante efectiva
      Console.getInstance().writeln(integer);
      integer++;
      return true;
    };

  }
}

// bien
// es/usantatecla/aX_report/a1_extends
// es/usantatecla/aX_report/a2_anonymus
// es/usantatecla/aX_report/a3_functional

// Ir a 1.4.1. FunctionalInterface

// bien!?!?
// es/usantatecla/aX_menu/a8_anonymus anonimas en opciones pero no en main
// es/usantatecla/aX_menu/a9_lambda funciones en opciones! No en main!!!

// default !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// static !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
