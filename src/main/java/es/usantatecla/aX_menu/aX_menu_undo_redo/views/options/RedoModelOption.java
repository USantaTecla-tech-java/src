package es.usantatecla.aX_menu.aX_menu_undo_redo.views.options;

public class RedoModelOption extends ModelOption {

  private Registry registry;

  public RedoModelOption(Registry registry) {
    super("Rehacer", null);
    this.registry = registry;
  }

  @Override
  public void interact() {
        this.registry.redo();
  }
    
}
