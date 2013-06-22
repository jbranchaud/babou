package com.joshbranchaud.babou.core;

import java.util.List;

public interface Committer {
	
	public boolean commit(List<String> files, String message);
}
