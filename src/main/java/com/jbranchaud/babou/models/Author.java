package com.jbranchaud.babou.models;

/**
 * Class that holds information about the commit author.
 * 
 * @author Dan Wiechert
 * @author Josh Branchaud
 */
public class Author implements Comparable<Author> {
	private String name;
	private String email;

	/**
	 * Full constructor.
	 * 
	 * @param name
	 *            The author's name.
	 * @param email
	 *            The author's email.
	 */
	public Author(final String name, final String email) {
		this.name = name;
		this.email = email;
	}

	/**
	 * Compares this name to the other name by using the {@link String#compareTo(String)} algorithm.
	 */
	@Override
	public int compareTo(final Author other) {
		if (other == null || other.name == null) {
			return -1; // Other Author is null so this one comes before it
		}
		
		if (this.name == null) {
			return 1;
		}

		return this.name.compareTo(other.name);
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public final String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public final void setEmail(final String email) {
		this.email = email;
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
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		final Author other = (Author) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
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
		return "Author [" + (name != null ? "name=" + name + ", " : "") + (email != null ? "email=" + email : "") + "]";
	}
}
