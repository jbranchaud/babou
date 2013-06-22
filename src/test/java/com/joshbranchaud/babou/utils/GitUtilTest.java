package com.joshbranchaud.babou.utils;

import java.net.URL;

import org.eclipse.jgit.lib.Repository;
import org.junit.Test;

/**
 * Tests for {@link GitUtil}.
 * 
 * @author jbranchaud
 */
public class GitUtilTest {

	@Test(expected=InvalidRepositoryException.class)
	public void getRepository_doesNotExist() {
		
		String fakePath = "this/path/definitely/does/not/exist/on/your/machine";
		Repository repo = GitUtil.getRepository(fakePath);
	}
	
	@Test(expected=InvalidRepositoryException.class)
	public void getRepository_isNotDirectory() {
		
		URL url = GitUtilTest.class.getResource("/file.txt");
		String filepath = url.getPath();
		Repository repo = GitUtil.getRepository(filepath);
	}
	
	@Test
	public void getRepsitory() {
		
		/*
		 * TODO: Still need to test this, probably going to us Mockito.
		 */
	}
}
