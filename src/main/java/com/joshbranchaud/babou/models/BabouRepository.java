package com.joshbranchaud.babou.models;

import java.io.IOException;

import org.eclipse.jgit.lib.Repository;

import com.joshbranchaud.babou.utils.GitUtil;

public class BabouRepository {

	private String localPath;
	
	private Repository repository;
	
	private String branch;
	
	public BabouRepository(String repoPath) {
		
		this.localPath = repoPath;
		this.repository = GitUtil.getRepository(repoPath);
		try {
			this.branch = this.repository.getBranch();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
