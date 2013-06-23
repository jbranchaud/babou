package com.jbranchaud.babou.models;

import java.util.ArrayList;

public class AnnotatedCommit {

	private String commitSummary;
	
	private ArrayList<AnnotatedFiles> annotatedFiles;
	
	public AnnotatedCommit(String commitSummary, ArrayList<AnnotatedFiles> annotatedFiles) {
		
		this.commitSummary = commitSummary;
		this.annotatedFiles = annotatedFiles;
	}

	public String getCommitSummary() {
		return commitSummary;
	}

	public void setCommitSummary(String commitSummary) {
		this.commitSummary = commitSummary;
	}

	public ArrayList<AnnotatedFiles> getAnnotatedFiles() {
		return annotatedFiles;
	}

	public void setAnnotatedFiles(ArrayList<AnnotatedFiles> annotatedFiles) {
		this.annotatedFiles = annotatedFiles;
	}
}
