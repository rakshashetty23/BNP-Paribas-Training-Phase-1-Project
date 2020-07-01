package com.operations;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class RetrieveFileNames {

	
	public RetrieveFileNames(String directoryPath) {
		
		ArrayList<String> fileNamesList = new ArrayList<String>();
		
		File currentFolder = new File(directoryPath);
		
		File [] listOfFiles = currentFolder.listFiles();
		
		for(File f : listOfFiles) {
			fileNamesList.add(f.getName());
		}
		
		Collections.sort(fileNamesList);
		
		if(fileNamesList.isEmpty() == true) {
			System.out.println("Currently there are no files in the directory");
		}
		else {
			for( Object o : fileNamesList) {
				System.out.println(o);;
			}
		}	
	}

	
	
}
