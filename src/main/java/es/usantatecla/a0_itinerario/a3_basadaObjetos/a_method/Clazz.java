package es.usantatecla.a0_itinerario.a3_basadaObjetos.a_method;

import es.usantatecla.utils.Console;

class X {
}

class Clazz {

    private int primitive;
    private int[] primitiveArray;
    private X object;
    private X[] objectArray;

    public void methodWithoutArguments() {
        // sentences
    }

    public void methodWitArguments(int primitive, int[] primitiveArray, X object, X[] objectArray) {
        // sentences
    }

    public void methodWitArguments(int primitive, int[] primitiveArray, X object) {
        // sentences
    }

    public void methodWitArguments(int[] primitiveArray, X object, X[] objectArray, int primitive) {
        // sentences
    }

    public int methodReturPrimitive() {
        // sentences
        return 0;
    }

    public int[] methodReturPrimitiveArray() {
        // sentences
        return new int[] {};
    }

    public X methodReturObject() {
        // sentences
        return new X();
    }

    public X[] methodReturObjectArray() {
        // sentences
        return new X[] {};
    }

}

class Client {

    public static void main(String[] args) {
        Console console = new Console();
        console.writeln();
        Clazz object = new Clazz();
        object.methodWithoutArguments();
        object.methodWitArguments(0, new int[] {}, new X(), new X[] {});
        object.methodWitArguments(0, new int[] {}, new X());
        object.methodWitArguments(new int[] {}, new X(), new X[] {}, 0);
        X x = object.methodReturObject();
        X[] xs = object.methodReturObjectArray();
        int primitive = object.methodReturPrimitive();
        int[] primitiveArray = object.methodReturPrimitiveArray();
    }
}
