package com.jbranchaud.babou.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jbranchaud.babou.models.BabouRepository;

/**
 * Abstract class that all {@link RepoManager} implementations should extend.
 * 
 * @author Dan Wiechert
 */
public abstract class AbstractRepoManager implements RepoManager {
	protected final Logger log = LoggerFactory.getLogger(getClass());
	private BabouRepository repo;

	/**
	 * Full constructor.
	 * 
	 * @param localRepo
	 *            The local repository.
	 */
	protected AbstractRepoManager(final String localRepo) {
		this.repo = new BabouRepository(localRepo);
	}

	/**
	 * @return the repo
	 */
	public final BabouRepository getRepo() {
		return repo;
	}

	/**
	 * @param repo
	 *            the repo to set
	 */
	public final void setRepo(final BabouRepository repo) {
		this.repo = repo;
	}
}
