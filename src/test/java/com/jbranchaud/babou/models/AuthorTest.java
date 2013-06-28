package com.jbranchaud.babou.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for {@link Author}.
 * 
 * @author Dan Wiechert
 */
public class AuthorTest {
	/**
	 * Ensures -1 is returned if the other author's name is null.
	 */
	@Test
	public void compareTo_NullOther() {
		final Author files = new Author("name", null);
		assertEquals(-1, files.compareTo(null));
	}

	/**
	 * Ensures -1 is returned if the other author's name is null.
	 */
	@Test
	public void compareTo_NullOtherMessage() {
		final Author files = new Author("name", null);
		assertEquals(-1, files.compareTo(new Author(null, null)));
	}

	/**
	 * Ensures 1 is returned if this author's name is null.
	 */
	@Test
	public void compareTo_NullMessage() {
		final Author files = new Author(null, null);
		assertEquals(1, files.compareTo(new Author("name", null)));
	}

	/**
	 * Ensures compareTo works as expected.
	 */
	@Test
	public void compareTo() {
		final Author files = new Author("name2", null);
		assertEquals(-1, files.compareTo(new Author("name3", null)));
		assertEquals(1, files.compareTo(new Author("name1", null)));
	}
}
