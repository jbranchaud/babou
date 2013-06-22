package com.joshbranchaud.babou.models;

public class BabouRepository {

	private String localPath;
	
	public BabouRepository(String repoPath) {
		
		this.localPath = repoPath;
	}
	
	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}
}
