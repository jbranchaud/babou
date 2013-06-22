package com.jbranchaud.babou.models;

import java.util.ArrayList;
import java.util.List;

public class BabouChangeset {
	private Author author;
	private List<AlteredFile> alteredFiles;

	public BabouChangeset() {
		this.alteredFiles = new ArrayList<AlteredFile>();
	}

	public BabouChangeset(final Author author, final List<AlteredFile> alteredFiles) {
		this.author = author;
		this.alteredFiles = alteredFiles;
	}

	/**
	 * @return the author
	 */
	public final Author getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public final void setAuthor(final Author author) {
		this.author = author;
	}

	/**
	 * @return the alteredFiles
	 */
	public final List<AlteredFile> getAlteredFiles() {
		return alteredFiles;
	}

	/**
	 * @param alteredFiles
	 *            the alteredFiles to set
	 */
	public final void setAlteredFiles(final List<AlteredFile> alteredFiles) {
		this.alteredFiles = alteredFiles;
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
		result = prime * result + ((alteredFiles == null) ? 0 : alteredFiles.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
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
		final BabouChangeset other = (BabouChangeset) obj;
		if (alteredFiles == null) {
			if (other.alteredFiles != null) {
				return false;
			}
		} else if (!alteredFiles.equals(other.alteredFiles)) {
			return false;
		}
		if (author == null) {
			if (other.author != null) {
				return false;
			}
		} else if (!author.equals(other.author)) {
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
		return "BabouChangeset [" + (author != null ? "author=" + author + ", " : "") + (alteredFiles != null ? "alteredFiles=" + alteredFiles : "")
				+ "]";
	}
}
