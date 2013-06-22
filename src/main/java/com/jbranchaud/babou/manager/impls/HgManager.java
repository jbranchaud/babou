package com.jbranchaud.babou.manager.impls;

import com.jbranchaud.babou.manager.RepoManager;
import com.jbranchaud.babou.models.BabouChangeset;

public class HgManager extends RepoManager {
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
