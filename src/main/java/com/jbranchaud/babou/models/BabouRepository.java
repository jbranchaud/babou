package com.jbranchaud.babou.models;

public class BabouRepository {
	private String localPath;

	public BabouRepository() {

	}

	public BabouRepository(final String localPath) {
		this.localPath = localPath;
	}

	/**
	 * @return the localPath
	 */
	public final String getLocalPath() {
		return localPath;
	}

	/**
	 * @param localPath
	 *            the localPath to set
	 */
	public final void setLocalPath(final String localPath) {
		this.localPath = localPath;
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
		result = prime * result + ((localPath == null) ? 0 : localPath.hashCode());
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
		final BabouRepository other = (BabouRepository) obj;
		if (localPath == null) {
			if (other.localPath != null) {
				return false;
			}
		} else if (!localPath.equals(other.localPath)) {
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
		return "BabouRepository [" + (localPath != null ? "localPath=" + localPath : "") + "]";
	}
}
