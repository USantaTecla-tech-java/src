package es.usantatecla.a0_itinerario.a4_orientadoObjetos.a6_enums.a2_enums;

enum Enum {
    OBJECT_1 {
        public void redefinedMethod() {
            Console.instance().writeln(OBJECT_1.name());
        }

    },
    OBJECT_2 {
        public void redefinedMethod() {
            Console.instance().writeln(OBJECT_2.name());
        }

        public void transmitedMethod() {
            Console.instance().writeln("Particular");
        }
    },
    OBJECT_3 {
        public void redefinedMethod() {
            Console.instance().writeln(OBJECT_3.name());
            this.addedMethod();
        }

        public void addedMethod() {
            Console.instance().writeln("addedMethod");
        }
    };

    public void transmitedMethod() {
        Console.instance().writeln("General");
    }

    public abstract void redefinedMethod();

    public static void main(String[] args){
        for(Enum current : Enum.values()){
            current.transmitedMethod();
            current.redefinedMethod();
            // if (current == Enum.OBJECT_3){
            //     current.addedMethod();
            // }
        }
        // Enum.OBJECT_3.addedMethod();
    }
}
