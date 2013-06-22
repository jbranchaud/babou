package com.joshbranchaud.babou.core;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;

import com.joshbranchaud.babou.models.BabouChangeSet;
import com.joshbranchaud.babou.utils.GitUtil;

public class GitManager extends RepoManager {

	private Repository repository;
	
	public GitManager(String localPath) {
		super(localPath);
		this.repository = GitUtil.getRepository(this.babouRepository.getLocalPath());
	}
	
	public boolean commit(BabouChangeSet changeSet, String message) {
		
		Repository repo = GitUtil.getRepository("");
		Git git = new Git(repo);
		// TODO Auto-generated method stub
		return false;
	}

	public BabouChangeSet getChanges() {
		
		return null;
	}
}
