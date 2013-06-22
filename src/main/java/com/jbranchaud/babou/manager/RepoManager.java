package com.jbranchaud.babou.manager;

import com.jbranchaud.babou.models.BabouChangeset;

public interface RepoManager {
	public BabouChangeset getChanges();

	public boolean commit(BabouChangeset changeSet);
}
