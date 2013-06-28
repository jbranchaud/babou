package com.jbranchaud.babou.models;

import java.util.ArrayList;

public class AnnotatedFiles implements Comparable<AnnotatedFiles> {

	private String message;
	
	private ArrayList<String> filenames;
	
	public AnnotatedFiles(String message, ArrayList<String> filenames) {
		
		this.message = message;
		this.filenames = filenames;
	}
	
	/*
	 * compare: AnnotatedFiles -> boolean
	 * 
	 * given another AnnotatedFiles class, this method will determine if
	 * this AnnotatedFiles is the same as the given AnnotatedFiles
	 * instance. If so, true is returned, otherwise false is returned.
	 */
	public boolean compare(AnnotatedFiles annotatedFiles) {
		
		// check the message first
		if(!this.message.equals(annotatedFiles.getMessage())) {
			return false;
		}
		
		// check the length of the filename lists
		if(this.filenames.size() != annotatedFiles.getFilenames().size()) {
			return false;
		}
		
		// check each of the filenames
		for(String filename : annotatedFiles.getFilenames()) {
			if(!this.filenames.contains(filename)) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public int compareTo(AnnotatedFiles other) {
		if (other == null) {
			return -1; // Other AnnotatedFiles is null so this one comes before it
		}
		
		return this.message == null ? 1 : this.message.compareTo(other.message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<String> getFilenames() {
		return filenames;
	}

	public void setFilenames(ArrayList<String> filenames) {
		this.filenames = filenames;
	}
}
