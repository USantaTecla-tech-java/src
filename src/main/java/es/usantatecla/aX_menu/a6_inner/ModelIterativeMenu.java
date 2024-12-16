package es.usantatecla.aX_menu.a6_inner;

class ModelIterativeMenu extends IterativeMenu<Model> {

    public ModelIterativeMenu(Model model) {
        super("Model Iterative Dynamic Menu", model);
    }

    class ListModelOption extends Option<Model> {

        public ListModelOption(Model model) {
            super("Listar", model);
        }

        public void interact() {
            for (int i = 0; i < this.getTarget().size(); i++) {
                Console.getInstance().writeln((i + 1) + ". " + this.getTarget().get(i));
            }
            Console.getInstance().writeln();
        }

    }

    class InverseListModelOption extends Option<Model> {

        public InverseListModelOption(Model model) {
            super("Listar inverso", model);
        }
    
        public void interact() {
            for (int i = this.getTarget().size() - 1; i >= 0; i--) {
                Console.getInstance().writeln((i + 1) + ". " + this.getTarget().get(i));
            }
            Console.getInstance().writeln();
        }
    
    }

    class FindModelOption extends Option<Model> {

        public FindModelOption(Model model) {
            super("Buscar", model);
        }

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

    }

    class AddModelOption extends Option<Model> {

        public AddModelOption(Model model) {
            super("Añadir", model);
        }
    
        public void interact() {
            String string;
            do {
                string = Console.getInstance().readString("Dame una cadena de caracteres: ");
            } while (string.trim().equals(""));
            this.getTarget().add(string.trim());
        }
    
    }

    class RemoveModelsOption extends Option<Model> {

        public RemoveModelsOption(Model model) {
            super("Eliminar", model);
        }
    
        public void interact() {
            new ModelDynamicMenu(this.getTarget()).interact();
        }
    }

    protected void addOptions() {
        this.add(new ListModelOption(this.getTarget()));
        this.add(new InverseListModelOption(this.getTarget()));
        this.add(new FindModelOption(this.getTarget()));
        this.add(new AddModelOption(this.getTarget()));
        this.add(new RemoveModelsOption(this.getTarget()));
    }

}
