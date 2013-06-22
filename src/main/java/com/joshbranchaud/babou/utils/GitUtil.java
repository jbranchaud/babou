package com.joshbranchaud.babou.utils;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.RepositoryBuilder;

public class GitUtil {
	
	/*
	 * getRepository: String -> Repository
	 * 
	 * given a String that represents the path of a local git repository,
	 * this method will verify that it represents a path to a repository
	 * and instantiate a jgit Repository object for it. The Repository
	 * will be returned.
	 */
	public static Repository getRepository(String repoPath) {
		
		// the repository we are instantiating
		Repository repo = null;
		
		// create a File object for the repoPath
		File repoDir = new File(repoPath);
		try {
			if(!repoDir.exists() || !repoDir.isDirectory()) {
				throw new InvalidRepositoryException(repoPath + " is not a valid repository location.");
			}
			
			RepositoryBuilder repoBuilder = new RepositoryBuilder();
			repo = repoBuilder.setGitDir(repoDir)
								.readEnvironment()
								.findGitDir()
								.build();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		return repo;
	}
}
