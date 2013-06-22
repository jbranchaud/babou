package com.joshbranchaud.babou.core;

import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoFilepatternException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.api.CommitCommand;

import com.joshbranchaud.babou.models.BabouChangeSet;
import com.joshbranchaud.babou.utils.GitUtil;

public class GitManager extends RepoManager {

	private Repository repository;
	
	public GitManager(String localPath) {
		super(localPath);
		this.repository = GitUtil.getRepository(this.babouRepository.getLocalPath());
	}
	
	public boolean commit(BabouChangeSet changeSet, String message) {

		Git git = new Git(this.repository);
		AddCommand addCommand = git.add();
		addCommand = this.addChangeSet(addCommand, changeSet);
		try {
			addCommand.call();
			CommitCommand commit = git.commit();
			commit.setMessage(message).call();
		} catch (NoFilepatternException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (GitAPIException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		return true;
	}

	public BabouChangeSet getChanges() {
		
		return null;
	}
	
	private AddCommand addChangeSet(AddCommand addCommand, BabouChangeSet changeSet) {
		
		for(String addedFile : changeSet.getAdded()) {
			addCommand.addFilepattern(addedFile);
		}
		
		for(String removedFile : changeSet.getRemoved()) {
			addCommand.addFilepattern(removedFile);
		}
		
		for(String modifiedFile : changeSet.getModified()) {
			addCommand.addFilepattern(modifiedFile);
		}
		
		return addCommand;
	}
}
