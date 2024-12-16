package es.usantatecla.aX_menu.a10_colletions;

import es.usantatecla.aX_menu.a10_colletions.utils.Console;
import es.usantatecla.aX_menu.a10_colletions.utils.IterativeMenu;

class ModelIterativeMenu extends IterativeMenu<Model> {

    public ModelIterativeMenu(Model model) {
        super("Model Iterative Dynamic Menu", model);
    }

    protected void addOptions() {
        this.add("Listar", (Model model) -> {
            for (int i = 0; i < model.size(); i++) {
                Console.getInstance().writeln((i + 1) + ". " + model.get(i));
            }
            Console.getInstance().writeln();
        });
        this.add("Listar inverso", (Model model) -> {
            for (int i = model.size() - 1; i >= 0; i--) {
                Console.getInstance().writeln((i + 1) + ". " + model.get(i));
            }
            Console.getInstance().writeln();
        });
        this.add("Buscar", (Model model) -> {
            String string;
            boolean ok;
            do {
                string = Console.getInstance().readString("Dame una cadena de caracteres: ").trim();
                ok = !string.equals("");
                if (!ok) {
                    Console.getInstance().writeln("Error! Introduce algún caracter");
                }
            } while (!ok);
            Console.getInstance().writeln((model.find(string) ? "Si" : "No") + " se encuentra");
        });
        this.add("Añadir", (Model model) -> {
            String string;
            do {
                string = Console.getInstance().readString("Dame una cadena de caracteres: ");
            } while (string.trim().equals(""));
            model.add(string.trim());
        });
        this.add("Eliminar", (Model model) -> {
            new ModelDynamicMenu(model).interact();
        });
    }

}
