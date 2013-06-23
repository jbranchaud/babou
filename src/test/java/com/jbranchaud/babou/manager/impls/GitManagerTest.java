package com.jbranchaud.babou.manager.impls;

import org.junit.Test;

import com.jbranchaud.babou.manager.RepoManager;
import com.jbranchaud.babou.models.BabouChangeset;

/**
 * Tests for {@link GitManager}.
 * 
 * @author Dan Wiechert
 */
public class GitManagerTest {
	@Test
	public void test() {
		final RepoManager manager = new GitManager("C:\\Users\\Dan\\git\\babou\\.git");
		final BabouChangeset changeset = manager.getChanges();
		System.out.println(changeset);
	}
}
