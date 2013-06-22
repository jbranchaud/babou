package com.jbranchaud.babou.models;

import com.jbranchaud.babou.enums.AlterationType;

public class AlteredFile {
	private String localPath;
	private AlterationType type;

	public AlteredFile() {

	}

	public AlteredFile(final String localPath, final AlterationType type) {
		this.localPath = localPath;
		this.type = type;
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

	/**
	 * @return the type
	 */
	public final AlterationType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public final void setType(final AlterationType type) {
		this.type = type;
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
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		final AlteredFile other = (AlteredFile) obj;
		if (localPath == null) {
			if (other.localPath != null) {
				return false;
			}
		} else if (!localPath.equals(other.localPath)) {
			return false;
		}
		if (type != other.type) {
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
		return "AlteredFile [" + (localPath != null ? "localPath=" + localPath + ", " : "") + (type != null ? "type=" + type : "") + "]";
	}
}
