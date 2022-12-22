package es.usantatecla.aX_menu_undo_redo.views.options;

import es.usantatecla.aX_menu_undo_redo.models.Model;

public abstract class RegistrableModelOption extends ModelOption {

  protected Registry registry;

  public RegistrableModelOption(String string, Model model, Registry registry) {
    super(string, model);
    this.registry = registry;
  }
  
  public abstract void undo();
  public abstract void redo();

}
