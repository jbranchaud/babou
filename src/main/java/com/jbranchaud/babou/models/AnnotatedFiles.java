package com.jbranchaud.babou.models;

import java.util.List;

/**
 * Class that holds information about annotated files.
 * 
 * @author Dan Wiechert
 * @author Josh Branchaud
 */
public class AnnotatedFiles implements Comparable<AnnotatedFiles> {
	private String message;
	private List<String> filenames;

	/**
	 * Full constructor.
	 * 
	 * @param message
	 *            The message.
	 * @param filenames
	 *            The {@link List} of filenames.
	 */
	public AnnotatedFiles(final String message, final List<String> filenames) {
		this.message = message;
		this.filenames = filenames;
	}

	/**
	 * Compares this message to the other message by using the {@link String#compareTo(String)} algorithm.
	 */
	@Override
	public int compareTo(final AnnotatedFiles other) {
		if (other == null) {
			return -1; // Other AnnotatedFiles is null so this one comes before it
		}

		return this.message == null ? 1 : this.message.compareTo(other.message);
	}

	/**
	 * @return the message
	 */
	public final String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public final void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * @return the filenames
	 */
	public final List<String> getFilenames() {
		return filenames;
	}

	/**
	 * @param filenames
	 *            the filenames to set
	 */
	public final void setFilenames(final List<String> filenames) {
		this.filenames = filenames;
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
		result = prime * result + ((filenames == null) ? 0 : filenames.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
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
		final AnnotatedFiles other = (AnnotatedFiles) obj;
		if (filenames == null) {
			if (other.filenames != null) {
				return false;
			}
		} else if (!filenames.equals(other.filenames)) {
			return false;
		}
		if (message == null) {
			if (other.message != null) {
				return false;
			}
		} else if (!message.equals(other.message)) {
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
		return "AnnotatedFiles [" + (message != null ? "message=" + message + ", " : "") + (filenames != null ? "filenames=" + filenames : "") + "]";
	}
}
