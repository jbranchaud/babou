package com.jbranchaud.babou.manager.impls;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.IndexDiff;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.RepositoryBuilder;
import org.eclipse.jgit.treewalk.FileTreeIterator;
import org.eclipse.jgit.treewalk.WorkingTreeIterator;

import com.jbranchaud.babou.enums.AlterationType;
import com.jbranchaud.babou.manager.AbstractRepoManager;
import com.jbranchaud.babou.manager.RepoManager;
import com.jbranchaud.babou.models.AlteredFile;
import com.jbranchaud.babou.models.BabouChangeset;

/**
 * Implementation of {@link RepoManager} that uses git as the version control system.
 * 
 * @author Dan Wiechert
 */
public class GitManager extends AbstractRepoManager {
	private final Repository repo;

	/**
	 * Full constructor.
	 * 
	 * @param localRepo
	 *            The local repository path.
	 */
	public GitManager(final String localRepo) {
		super(localRepo);
		final RepositoryBuilder builder = new RepositoryBuilder();
		try {
			repo = builder.setGitDir(new File(localRepo)).readEnvironment().findGitDir().build();
		} catch (IOException e) {
			log.error("Could not initialize with provided git repo {}.", localRepo);
			throw new IllegalStateException("Could not initialize with provided git repo.", e);
		}
	}

	@Override
	public BabouChangeset getChanges() {		
		final WorkingTreeIterator iterator = new FileTreeIterator(repo);
		final IndexDiff diff;
		try {
			diff = new IndexDiff(repo, Constants.HEAD, iterator);
			diff.diff();
		} catch (IOException e) {
			log.error("Unable to create diff for repo {}.", repo);
			throw new IllegalStateException("Unable to create diff for repo.", e);
		}

		final BabouChangeset changeSet = new BabouChangeset();
		
		// New files
		for (final String added : diff.getAdded()) {
			changeSet.getAlteredFiles().add(new AlteredFile(added, AlterationType.ADDED));
		}
		for (final String untracked : diff.getUntracked()) {
			changeSet.getAlteredFiles().add(new AlteredFile(untracked, AlterationType.ADDED));
		}
		
		// Modified files
		for (final String added : diff.getChanged()) {
			changeSet.getAlteredFiles().add(new AlteredFile(added, AlterationType.MODIFIED));
		}
		for (final String modified :  diff.getModified()) {
			changeSet.getAlteredFiles().add(new AlteredFile(modified, AlterationType.MODIFIED));
		}
		
		// Removed files
		for (final String removed : diff.getRemoved()) {
			changeSet.getAlteredFiles().add(new AlteredFile(removed, AlterationType.REMOVED));
		}
		
		return changeSet;
	}

	@Override
	public boolean commit(final BabouChangeset changeSet) {
		// TODO Auto-generated method stub
		return false;
	}
}
