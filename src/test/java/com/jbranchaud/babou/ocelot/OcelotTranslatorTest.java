package com.jbranchaud.babou.ocelot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jbranchaud.ocelot.OcelotTranslator;

public class OcelotTranslatorTest {

	@Test
	public void testCreateFileAnnotation_singleFile() {
		
		String filename = "src/Ocelot.java";
		String annotatedFilename = "[src/Ocelot.java]";
		
		String resultingAnnotation = OcelotTranslator.createFileAnnotation(filename);
		
		assertEquals(annotatedFilename, resultingAnnotation);
	}
	
	@Test
	public void testCreateFileAnnotation_multiFile() {
		
		assert(false);
	}
	
	@Test
	public void testCreateFileAnnotation_emptyString() {
		
		assert(false);
	}
	
	@Test
	public void testCreateOcelotAnnotation() {
		
		assert(false);
	}
}
