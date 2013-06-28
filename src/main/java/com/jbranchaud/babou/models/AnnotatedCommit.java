package com.jbranchaud.babou.models;

import java.util.List;

/**
 * Class that holds information about an annotated commit.
 * 
 * @author Dan Wiechert
 * @author Josh Branchaud
 */
public class AnnotatedCommit implements Comparable<AnnotatedCommit> {
	private String commitSummary;
	private List<AnnotatedFiles> annotatedFiles;

	/**
	 * Full constructor.
	 * 
	 * @param commitSummary
	 *            The commit summary.
	 * @param annotatedFiles
	 *            A {@link List} of {@link AnnotatedFiles}.
	 */
	public AnnotatedCommit(final String commitSummary, final List<AnnotatedFiles> annotatedFiles) {
		this.commitSummary = commitSummary;
		this.annotatedFiles = annotatedFiles;
	}

	/**
	 * Compares this commit summary to the other commit summary by using the {@link String#compareTo(String)} algorithm.
	 */
	@Override
	public int compareTo(final AnnotatedCommit other) {
		if (other == null || other.commitSummary == null) {
			return -1; // Other AnnotatedCommit is null so this one comes before it
		}
		
		if (this.commitSummary == null) {
			return 1;
		}

		return this.commitSummary.compareTo(other.commitSummary);
	}

	/**
	 * @return the commitSummary
	 */
	public final String getCommitSummary() {
		return commitSummary;
	}

	/**
	 * @param commitSummary
	 *            the commitSummary to set
	 */
	public final void setCommitSummary(final String commitSummary) {
		this.commitSummary = commitSummary;
	}

	/**
	 * @return the annotatedFiles
	 */
	public final List<AnnotatedFiles> getAnnotatedFiles() {
		return annotatedFiles;
	}

	/**
	 * @param annotatedFiles
	 *            the annotatedFiles to set
	 */
	public final void setAnnotatedFiles(final List<AnnotatedFiles> annotatedFiles) {
		this.annotatedFiles = annotatedFiles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annotatedFiles == null) ? 0 : annotatedFiles.hashCode());
		result = prime * result + ((commitSummary == null) ? 0 : commitSummary.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final AnnotatedCommit other = (AnnotatedCommit) obj;
		if (annotatedFiles == null) {
			if (other.annotatedFiles != null) {
				return false;
			}
		} else if (!annotatedFiles.equals(other.annotatedFiles)) {
			return false;
		}
		if (commitSummary == null) {
			if (other.commitSummary != null) {
				return false;
			}
		} else if (!commitSummary.equals(other.commitSummary)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AnnotatedCommit [" + (commitSummary != null ? "commitSummary=" + commitSummary + ", " : "")
				+ (annotatedFiles != null ? "annotatedFiles=" + annotatedFiles : "") + "]";
	}
}
