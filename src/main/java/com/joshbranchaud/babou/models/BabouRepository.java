package com.joshbranchaud.babou.models;

public class BabouRepository {

	private String localPath;
	
	private BabouChangeSet changeSet;
	
	public BabouRepository(String repoPath) {
		
		this.localPath = repoPath;
		this.changeSet = new BabouChangeSet();
	}

	public BabouChangeSet getChangeSet() {
		return changeSet;
	}

	public void setChangeSet(BabouChangeSet changeSet) {
		this.changeSet = changeSet;
	}

	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
}
