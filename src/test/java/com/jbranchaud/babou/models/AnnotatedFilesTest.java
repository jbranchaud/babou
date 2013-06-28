package com.jbranchaud.babou.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for {@link AnnotatedFiles}.
 * 
 * @author Dan Wiechert
 */
public class AnnotatedFilesTest {
	/**
	 * Ensures -1 is returned if the other annotated files' is null.
	 */
	@Test
	public void compareTo_NullOther() {
		final AnnotatedFiles files = new AnnotatedFiles("message", null);
		assertEquals(-1, files.compareTo(null));
	}

	/**
	 * Ensures -1 is returned if the other annotated files' message is null.
	 */
	@Test
	public void compareTo_NullOtherMessage() {
		final AnnotatedFiles files = new AnnotatedFiles("message", null);
		assertEquals(-1, files.compareTo(new AnnotatedFiles(null, null)));
	}

	/**
	 * Ensures 1 is returned if this annotated files' message is null.
	 */
	@Test
	public void compareTo_NullMessage() {
		final AnnotatedFiles files = new AnnotatedFiles(null, null);
		assertEquals(1, files.compareTo(new AnnotatedFiles("message", null)));
	}

	/**
	 * Ensures compareTo works as expected.
	 */
	@Test
	public void compareTo() {
		final AnnotatedFiles files = new AnnotatedFiles("message2", null);
		assertEquals(-1, files.compareTo(new AnnotatedFiles("message3", null)));
		assertEquals(1, files.compareTo(new AnnotatedFiles("message1", null)));
	}
}
