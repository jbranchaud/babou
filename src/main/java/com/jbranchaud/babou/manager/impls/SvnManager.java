package com.jbranchaud.babou.manager.impls;

import com.jbranchaud.babou.manager.AbstractRepoManager;
import com.jbranchaud.babou.manager.RepoManager;
import com.jbranchaud.babou.models.AnnotatedCommit;
import com.jbranchaud.babou.models.BabouChangeset;

/**
 * Implementation of {@link RepoManager} that uses svn as the version control system.
 * 
 * @author Dan Wiechert
 */
public class SvnManager extends AbstractRepoManager {
	/**
	 * Full constructor.
	 * 
	 * @param localRepo
	 *            The local repository path.
	 */
	public SvnManager(final String localRepo) {
		super(localRepo);
	}

	@Override
	public BabouChangeset getChanges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean commit(final AnnotatedCommit annotatedCommit) {
		// TODO Auto-generated method stub
		return false;
	}
}
