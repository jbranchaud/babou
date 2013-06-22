package com.jbranchaud.babou.manager;

import com.jbranchaud.babou.models.BabouChangeset;

/**
 * Interface to allow the babou system to see the changes to the repo and to commit the local changes.
 * 
 * @author Dan Wiechert
 */
public interface RepoManager {
	/**
	 * Gets the current changes in the local repository.
	 * 
	 * @return The {@link BabouChangeset} that represents the local changes.
	 */
	public BabouChangeset getChanges();

	/**
	 * Commits the changes that are in the provided {@link BabouChangeset}.
	 * 
	 * @param changeSet
	 *            The {@link BabouChangeset} which holds all of the local changes to persist.
	 * @return If the commit was succesful or not.
	 */
	public boolean commit(BabouChangeset changeSet);
}
