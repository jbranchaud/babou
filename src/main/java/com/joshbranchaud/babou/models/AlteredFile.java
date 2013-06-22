package com.joshbranchaud.babou.models;

import java.io.File;

public class AlteredFile {

	private String absolutePath;
	
	private String baseName;
	
	private String extension;
	
	private String type;
	
	public AlteredFile(String filepath, String type) {
		this.absolutePath = filepath;
		this.baseName = filepath.substring(filepath.lastIndexOf(File.separator) + 1);
		this.extension = this.baseName.substring(this.baseName.lastIndexOf(".") + 1);
		this.type = verifyType(type);
	}
	
	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static String verifyType(String type) {
		return "";
	}
}
