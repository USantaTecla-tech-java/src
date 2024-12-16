package es.usantatecla.nestedDocs;

// 1.2. Clases Locales

// Clase anidada declarada dentro del ámbito de un método de una clase exterior
// no puede ser pública, protegida o privada
// no puede ser estática

class Outer {

  private int variableAttribute;
  private final int finalAttribute = 0;
  private static int staticVariableAttribute = 0;
  private static final int finalStaticVariableAttribute = 0;

  private void method() {

    class Local {

      private int localVariableAttribute;
      private final int localFinalAttribute = 0;
      // private static int localStaticVariableAttribute = 0; Error!!!!!
      private static final int localFinalStaticVariableAttribute = 0;

      public void m() {
        int local1 = variableAttribute;
        int local2 = finalAttribute;
        int local3 = staticVariableAttribute;
        int local4 = finalStaticVariableAttribute;

        int staticLocal1 = localVariableAttribute;
        int staticLocal2 = localFinalAttribute;
        // int staticLocal3 = localStaticVariableAttribute;
        int staticLocal4 = localFinalStaticVariableAttribute;
      }
    }

    Local local = new Local();

  }

}

// es/usantatecla/aX_menu/a6_inner internas en opciones y main
// es/usantatecla/aX_menu/a7_local locales en opciones y main
