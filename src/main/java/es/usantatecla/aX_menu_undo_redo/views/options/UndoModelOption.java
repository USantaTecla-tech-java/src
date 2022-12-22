package es.usantatecla.aX_menu_undo_redo.views.options;

public class UndoModelOption extends ModelOption {

  private Registry registry;

  public UndoModelOption(Registry registry) {
    super("Deshacer", null);
    this.registry = registry;
  }

  @Override
  public void interact() {
        this.registry.undo();
  }
    
}
