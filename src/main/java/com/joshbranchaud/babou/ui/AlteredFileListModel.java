package com.joshbranchaud.babou.ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class AlteredFileListModel implements ListModel {

	List<ListDataListener> dataListeners;
	
	public AlteredFileListModel() {
		this.dataListeners = new ArrayList<ListDataListener>();
	}
	
	@Override
	public void addListDataListener(ListDataListener dataListener) {

		this.dataListeners.add(dataListener);
	}

	@Override
	public Object getElementAt(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeListDataListener(ListDataListener dataListener) {

		this.dataListeners.remove(dataListener);
	}
}
