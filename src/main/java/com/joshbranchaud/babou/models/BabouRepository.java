package com.joshbranchaud.babou.models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jgit.lib.Repository;

import com.joshbranchaud.babou.utils.GitUtil;

public class BabouRepository {

	private String localPath;
	
	private Repository repository;
	
	private String branch;
	
	private BabouChangeSet changeSet;
	
	public BabouRepository(String repoPath) {
		
		this.localPath = repoPath;
		this.repository = GitUtil.getRepository(repoPath);
		try {
			this.branch = this.repository.getBranch();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
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

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}
