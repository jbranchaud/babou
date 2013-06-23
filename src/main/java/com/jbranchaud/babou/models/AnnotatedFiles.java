package com.jbranchaud.babou.models;

import java.util.ArrayList;

public class AnnotatedFiles {

	private String message;
	
	private ArrayList<String> filenames;
	
	public AnnotatedFiles(String message, ArrayList<String> filenames) {
		
		this.message = message;
		this.filenames = filenames;
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
