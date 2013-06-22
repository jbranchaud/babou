package com.joshbranchaud.babou.core;

import com.joshbranchaud.babou.models.BabouChangeSet;

public class HgManager extends RepoManager {
	/**
	 * Full constructor.
	 * 
	 * @param localRepo
	 *            The local repository.
	 */
	public HgManager(final String localRepo) {
		
	}

	@Override
	public boolean commit(BabouChangeSet changeSet, String message) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BabouChangeSet getChanges() {
		final BabouChangeSet changeSet = new BabouChangeSet();
		return changeSet;
	}

}
