package es.usantatecla.aX_menu.a8_anonymus;

class ModelIterativeMenu extends IterativeMenu<Model> {

    public ModelIterativeMenu(Model model) {
        super("Model Iterative Dynamic Menu", model);
    }

    protected void addOptions() {
        this.add(new Option<Model>("Listar", this.getTarget()) {

            public void interact() {
                for (int i = 0; i < this.getTarget().size(); i++) {
                    Console.getInstance().writeln((i + 1) + ". " + this.getTarget().get(i));
                }
                Console.getInstance().writeln();
            }

        });
        this.add(new Option<Model>("Listar inverso", this.getTarget()) {

            public void interact() {
                for (int i = this.getTarget().size() - 1; i >= 0; i--) {
                    Console.getInstance().writeln((i + 1) + ". " + this.getTarget().get(i));
                }
                Console.getInstance().writeln();
            }

        });
        this.add(new Option<Model>("Buscar", this.getTarget()){

            public void interact() {
                String string;
                boolean ok;
                do {
                    string = Console.getInstance().readString("Dame una cadena de caracteres: ").trim();
                    ok = !string.equals("");
                    if (!ok) {
                        Console.getInstance().writeln("Error! Introduce algún caracter");
                    }
                } while (!ok);
                Console.getInstance().writeln((this.getTarget().find(string) ? "Si" : "No") + " se encuentra");
            }

        });
        this.add(new Option<Model>("Añadir", this.getTarget()){

            public void interact() {
                String string;
                do {
                    string = Console.getInstance().readString("Dame una cadena de caracteres: ");
                } while (string.trim().equals(""));
                this.getTarget().add(string.trim());
            }

        });
        this.add(new Option<Model>("Eliminar", this.getTarget()) {

            public void interact() {
                new ModelDynamicMenu(this.getTarget()).interact();
            }
        });
    }

}
