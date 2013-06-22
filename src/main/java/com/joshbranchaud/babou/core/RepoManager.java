package com.joshbranchaud.babou.core;

import com.joshbranchaud.babou.models.BabouChangeSet;

public interface RepoManager {
	
	public boolean commit(BabouChangeSet changeSet, String message);
	
	public BabouChangeSet getChanges();
}
