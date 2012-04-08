package protege.gui.db2onto.design;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.protege.editor.core.ui.list.MList;


public class CustomList extends MList {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2188874369022922269L;
	private ListCellRenderer cellRenderer;
	
	public CustomList() {
		super.setModel(new CustomMutableListModel());
		cellRenderer = new CustomListCellRenderer();
		MListCellRenderer ren = (MListCellRenderer) getCellRenderer();
		ren.setContentRenderer(cellRenderer);
		
	}
	
	public void setCellRenderer(ListCellRenderer cellRenderer) {
		if(!(getCellRenderer() instanceof MListCellRenderer)) {
            super.setCellRenderer(cellRenderer);
        }
        else {
        	cellRenderer = cellRenderer;
        }
	}
	
	public void setListData(final Object[] listData) {
        CustomMutableListModel model = (CustomMutableListModel) getModel();
        model.clear();
        for (Object o : listData) {
                model.addElement(o);
            }
    }
	
	public Object getSelectedValue() {
        CustomListItem item = ((CustomListItem) super.getSelectedValue());
        if(item == null) {
            return null;
        }
        return (Object) item.getObject();
    }


    public Object getSelectedObject() {
        return getSelectedValue();
    }
    
    public static void main(String args[]) {
    	String array[] = {"item 1", "item 2", "item 3"};
    	final CustomList list = new CustomList();
    	list.setListData(array);
    	list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
//				list.getSelectedValue();
				System.out.println("d");
//				System.out.println(list.getSelectedValue());
			}
		});
    	
    	JFrame f = new JFrame();
        f.getContentPane().setLayout(new BorderLayout());
        f.getContentPane().add(new JScrollPane(list));
        f.setSize(400, 250);
        f.setVisible(true);
    }
}
