package com.joshbranchaud.babou.core;

import com.joshbranchaud.babou.models.BabouChangeSet;

public abstract class RepoManager {
	
	private BabouChangeSet changeSet;
	
	public abstract boolean commit(BabouChangeSet changeSet, String message);
	
	public abstract BabouChangeSet getChanges();
}
