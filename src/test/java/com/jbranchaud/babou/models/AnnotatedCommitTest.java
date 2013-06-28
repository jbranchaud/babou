package com.jbranchaud.babou.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for {@link AnnotatedCommit}.
 * 
 * @author Dan Wiechert
 */
public class AnnotatedCommitTest {
	/**
	 * Ensures -1 is returned if the other annotated commit's summary is null.
	 */
	@Test
	public void compareTo_NullOther() {
		final AnnotatedCommit files = new AnnotatedCommit("summary", null);
		assertEquals(-1, files.compareTo(null));
	}

	/**
	 * Ensures -1 is returned if the other annotated commit's summary is null.
	 */
	@Test
	public void compareTo_NullOtherMessage() {
		final AnnotatedCommit files = new AnnotatedCommit("summary", null);
		assertEquals(-1, files.compareTo(new AnnotatedCommit(null, null)));
	}

	/**
	 * Ensures 1 is returned if this annotated commit's summary is null.
	 */
	@Test
	public void compareTo_NullMessage() {
		final AnnotatedCommit files = new AnnotatedCommit(null, null);
		assertEquals(1, files.compareTo(new AnnotatedCommit("summary", null)));
	}

	/**
	 * Ensures compareTo works as expected.
	 */
	@Test
	public void compareTo() {
		final AnnotatedCommit files = new AnnotatedCommit("summary2", null);
		assertEquals(-1, files.compareTo(new AnnotatedCommit("summary3", null)));
		assertEquals(1, files.compareTo(new AnnotatedCommit("summary1", null)));
	}
}
