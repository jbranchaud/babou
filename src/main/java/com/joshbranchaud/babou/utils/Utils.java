package com.joshbranchaud.babou.utils;

import java.io.File;

public class Utils {

	public static boolean verifyDirectory(String path) {
		
		File directory = new File(path);
		if(directory.exists() && directory.isDirectory()) {
			return true;
		}
		
		return false;
	}
}
