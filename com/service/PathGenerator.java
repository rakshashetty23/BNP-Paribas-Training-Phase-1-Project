package com.service;

import java.io.File;

public class PathGenerator {
	public String getPath(){
		String directoryPath = "./Locked Me App File Storage/";
		File currentFolder = new File(directoryPath);
		boolean exists = currentFolder.exists();
		if(exists) {
			return directoryPath;
		}
		else {
			currentFolder.mkdir();
			return directoryPath;
		}
	}
	
}
