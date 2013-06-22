package com.jbranchaud.babou.manager.impls;

import com.jbranchaud.babou.manager.AbstractRepoManager;
import com.jbranchaud.babou.manager.RepoManager;
import com.jbranchaud.babou.models.BabouChangeset;

/**
 * Implementation of {@link RepoManager} that uses mecurial as the version control system.
 * 
 * @author Dan Wiechert
 */
public class HgManager extends AbstractRepoManager {
	/**
	 * Full constructor.
	 * 
	 * @param localRepo
	 *            The local repository path.
	 */
	public HgManager(final String localRepo) {
		super(localRepo);
	}

	@Override
	public BabouChangeset getChanges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean commit(final BabouChangeset changeSet) {
		// TODO Auto-generated method stub
		return false;
	}
}
