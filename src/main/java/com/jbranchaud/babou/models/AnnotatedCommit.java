package com.jbranchaud.babou.models;

import java.util.ArrayList;

public class AnnotatedCommit implements Comparable<AnnotatedCommit> {
	private String commitSummary;
	private ArrayList<AnnotatedFiles> annotatedFiles;

	public AnnotatedCommit(String commitSummary, ArrayList<AnnotatedFiles> annotatedFiles) {
		this.commitSummary = commitSummary;
		this.annotatedFiles = annotatedFiles;
	}

	/*
	 * compare: AnnotatedCommit -> boolean
	 * 
	 * given an AnnotatedCommit object, this method will determine if this AnnotatedCommit is the same as the given AnnotatedCommit. If so, true is
	 * returned, otherwise false is returned.
	 */
	public boolean compare(AnnotatedCommit annotatedCommit) {

		// first check the commitSummary
		if (!this.commitSummary.equals(annotatedCommit.getCommitSummary())) {
			return false;
		}

		// check the size of the annotatedFiles lists
		if (this.annotatedFiles.size() != annotatedCommit.getAnnotatedFiles().size()) {
			return false;
		}

		// check the lists
		for (AnnotatedFiles thoseFiles : annotatedCommit.getAnnotatedFiles()) {
			boolean consistent = false;
			for (AnnotatedFiles theseFiles : this.annotatedFiles) {
				consistent = consistent || theseFiles.compare(thoseFiles);
			}
			if (!consistent) {
				return false;
			}
		}

		return true;
	}

	@Override
	public int compareTo(AnnotatedCommit o) {
		// TODO Auto-generated method stub
		return 0;
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
