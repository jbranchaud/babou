package com.joshbranchaud.babou.models;

import java.util.ArrayList;
import java.util.List;

public class BabouChangeSet {

	private List<String> added;

	private List<String> removed;

	private List<String> modified;
	
	public BabouChangeSet() {
		
		this.added = new ArrayList<String>();
		this.removed = new ArrayList<String>();
		this.modified = new ArrayList<String>();
	}

	public List<String> getAdded() {
		return added;
	}

	public void setAdded(List<String> added) {
		this.added = added;
	}

	public List<String> getRemoved() {
		return removed;
	}

	public void setRemoved(List<String> removed) {
		this.removed = removed;
	}

	public List<String> getModified() {
		return modified;
	}

	public void setModified(List<String> modified) {
		this.modified = modified;
	}
}
