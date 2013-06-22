package com.joshbranchaud.babou.core;

import java.util.List;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import com.joshbranchaud.babou.utils.GitUtil;

public class GitManager implements RepoManager {

	public boolean commit(List<String> files, String message) {
		
		Repository repo = GitUtil.getRepository("");
		Git git = new Git(repo);
		// TODO Auto-generated method stub
		return false;
	}

	
}
