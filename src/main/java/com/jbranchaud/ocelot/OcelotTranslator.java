package com.jbranchaud.ocelot;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.jgit.util.StringUtils;

public final class OcelotTranslator {

	public static final String FILE_ANNOTATION_OPENING = "[";
	public static final String FILE_ANNOTATION_CLOSING = "]";
	public static final String FILE_ANNOTATION_DELIMITER = "|";
	
	/*
	 * createOcelotAnnotation: Map<ArrayList<String, String> -> String
	 * 
	 * given a mapping of filename lists to the message for those files,
	 * this method will create the commit message utilizing the Ocelot
	 * annotation specification.
	 */
	public static String createOcelotAnnotation(Map<ArrayList<String>, String> messages) {
		
		String message = "";
		
		
		
		return message;
	}
	
	/*
	 * createFileAnnotation: String -> String
	 * 
	 * given a String representing a filename, this method will wrap the
	 * filename in the appropriate annotation syntax and return it.
	 */
	public static String createFileAnnotation(String filename) {
		
		return FILE_ANNOTATION_OPENING + filename + FILE_ANNOTATION_CLOSING;
	}
	
	/*
	 * createFileAnnotation: ArrayList<String> -> String
	 * 
	 * given a list of Strings representing filenames, this method will
	 * concatenate the filenames with the delimiter and then wrap them in the
	 * appropriate annotation syntax.
	 */
	public static String createFileAnnotation(ArrayList<String> filenames) {
		
		String annotation = StringUtils.join(filenames, FILE_ANNOTATION_DELIMITER);
		
		return FILE_ANNOTATION_OPENING + annotation + FILE_ANNOTATION_CLOSING;
	}
}
