package protege.gui.db2onto.design;

import javax.swing.DefaultListModel;

public class CustomMutableListModel extends DefaultListModel{
	public CustomMutableListModel() {
		
	}
	
	public void setElementAt(Object o, int index) {
		super.setElementAt(new CustomListItem(o), index);
	}
	
	public void addElement(Object o) {
		super.addElement(new CustomListItem(o));
	}
	
	public void add(int index, Object o) {
		super.add(index, new CustomListItem(o));
	}
	
	public Object set(int index, Object o) {
		return super.set(index, new CustomListItem(o));
	}
}
