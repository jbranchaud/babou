package com.joshbranchaud.babou.core;

import com.joshbranchaud.babou.models.BabouChangeSet;
import com.joshbranchaud.babou.models.BabouRepository;

public abstract class RepoManager {
	
	protected BabouRepository babouRepository;
	
	public RepoManager(String localPath) {
		this.babouRepository = new BabouRepository(localPath);
	}
	
	public abstract boolean commit(BabouChangeSet changeSet, String message);
	
	public abstract BabouChangeSet getChanges();
}
