package com.joshbranchaud.babou.core;

import java.util.List;

import com.joshbranchaud.babou.models.BabouChangeSet;

public class HgManager extends RepoManager {
	
	// TODO: Add a Mercurial specific Repository object here.
	
	public HgManager(String localPath) {
		super(localPath);
	}

	public boolean commit(BabouChangeSet changeSet, String message) {
		// TODO Auto-generated method stub
		return false;
	}

	public BabouChangeSet getChanges() {
		// TODO Auto-generated method stub
		return null;
	}

}
