package com.joshbranchaud.babou.core;

import java.io.File;

import com.aragost.javahg.Changeset;
import com.aragost.javahg.Repository;
import com.aragost.javahg.WorkingCopy;
import com.joshbranchaud.babou.models.BabouChangeSet;

public class HgManager extends RepoManager {
	private final WorkingCopy copy;

	/**
	 * Full constructor.
	 * 
	 * @param localPath
	 *            The local repository.
	 */
	public HgManager(final String localPath) {
		super(localPath);
		copy = Repository.open(new File(localPath)).workingCopy();
	}

	@Override
	public boolean commit(BabouChangeSet changeSet, String message) {
		// TODO Auto-generated method stub
		copy.add(changeSet.getAdded().toArray(new String[changeSet.getAdded().size()]));
		copy.remove(changeSet.getRemoved().toArray(new String[changeSet.getRemoved().size()]));
		return false;
	}

	@Override
	public BabouChangeSet getChanges() {
		final BabouChangeSet changeSet = new BabouChangeSet();
		final Changeset hgChangeSet = copy.getParent1();
		changeSet.setAdded(hgChangeSet.getAddedFiles());
		changeSet.setModified(hgChangeSet.getModifiedFiles());
		changeSet.setRemoved(hgChangeSet.getDeletedFiles());
		return changeSet;
	}

}
