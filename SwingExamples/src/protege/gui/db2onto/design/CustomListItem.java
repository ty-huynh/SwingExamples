package protege.gui.db2onto.design;

import org.protege.editor.core.ui.list.MListItem;

public class CustomListItem implements MListItem {

	Object object;
	
	public CustomListItem(Object o) {
		object = o;
	}
	public String toString() {
		return "LI : " + object.toString(); 
	}
	
	public Object getObject() {
		return object;
	}
	@Override
	public String getTooltip() {
		// TODO Auto-generated method stub
		return "tooltip: " + object.toString();
	}

	@Override
	public boolean handleDelete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void handleEdit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDeleteable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEditable() {
		// TODO Auto-generated method stub
		return true;
	}

}
