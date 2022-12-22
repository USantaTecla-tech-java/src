package es.usantatecla.aX_menu_undo_redo.views.options;

import java.util.ArrayList;
import java.util.List;

public class Registry {
	
	private List<RegistrableModelOption> options;
	private int activeOption;
	
	public Registry() {
		this.activeOption = 0;
		this.options = new ArrayList<>();
	}

	public void register(RegistrableModelOption option) {
		for (int i = 0; i < this.activeOption; i++) {
			this.options.remove(0);
		}
		this.activeOption = 0;
		this.options.add(this.activeOption, option);
	}

	public boolean undoable() {
		return this.activeOption < this.options.size();
	}

	public void undo() {
		assert this.undoable();

		this.options.get(this.activeOption).undo();
		this.activeOption++;
	}

	public boolean redoable() {
		return this.activeOption > 0;
	}

	public void redo() {
		assert this.redoable();

		this.activeOption--;
		this.options.get(this.activeOption).redo();
	}

}
