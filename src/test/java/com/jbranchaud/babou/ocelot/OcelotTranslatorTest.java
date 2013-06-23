package com.jbranchaud.babou.ocelot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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
		
		String filename1 = "src/Ocelot.java";
		String filename2 = "src/Babou.java";
		ArrayList<String> filenames = new ArrayList<String>();
		filenames.add(filename1);
		filenames.add(filename2);
		
		String annotatedFilename = "[src/Ocelot.java|src/Babou.java]";
		
		String resultingAnnotation = OcelotTranslator.createFileAnnotation(filenames);
		
		assertEquals(annotatedFilename, resultingAnnotation);
	}
	
	@Test
	public void testCreateFileAnnotation_emptyString() {
		
		assertTrue(false);
	}
	
	@Test
	public void testCreateOcelotAnnotation() {
		
		assertTrue(false);
	}
}
