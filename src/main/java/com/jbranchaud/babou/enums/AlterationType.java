package com.jbranchaud.babou.enums;

/**
 * Enum that holds the different states a file can be in.
 * 
 * @author Dan Wiechert
 */
public enum AlterationType {
	/** The file was added and is currently untracked in the system. */
	ADDED,
	/** The file was modified. */
	MODIFIED,
	/** The file has been removed and needs to be untracked. */
	REMOVED;
}
