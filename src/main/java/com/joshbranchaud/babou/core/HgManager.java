package com.joshbranchaud.babou.core;

import com.joshbranchaud.babou.models.BabouChangeSet;

public class HgManager extends RepoManager {
	/**
	 * Full constructor.
	 * 
	 * @param localPath
	 *            The local repository.
	 */
	public HgManager(final String localPath) {
		super(localPath);
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
