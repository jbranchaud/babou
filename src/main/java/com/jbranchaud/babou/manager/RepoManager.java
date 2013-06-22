package com.jbranchaud.babou.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jbranchaud.babou.models.BabouChangeset;
import com.jbranchaud.babou.models.BabouRepository;

public abstract class RepoManager {
	protected final Logger log = LoggerFactory.getLogger(getClass());
	private BabouRepository repo;

	protected RepoManager(final String localRepo) {
		this.repo = new BabouRepository(localRepo);
	}

	public abstract BabouChangeset getChanges();

	public abstract boolean commit(BabouChangeset changeSet);
}
