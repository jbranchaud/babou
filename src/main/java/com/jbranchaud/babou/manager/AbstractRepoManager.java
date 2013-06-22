package com.jbranchaud.babou.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jbranchaud.babou.models.BabouChangeset;
import com.jbranchaud.babou.models.BabouRepository;

/**
 * Abstract class that all
 * 
 * @author Dan Wiechert
 */
public abstract class AbstractRepoManager implements RepoManager {
	protected final Logger log = LoggerFactory.getLogger(getClass());
	private BabouRepository repo;

	protected AbstractRepoManager(final String localRepo) {
		this.repo = new BabouRepository(localRepo);
	}
}
