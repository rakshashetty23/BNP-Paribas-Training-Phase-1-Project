package com.operations;

import java.io.File;

public class SearchUserSpecifiedFile {
	
	public SearchUserSpecifiedFile(String fileNameToSearch, String directoryPath) {
		
		File currentFolder = new File( directoryPath );
		
		File [] listOfFiles = currentFolder.listFiles();
		
		boolean fileSearched = false;
		
		for( File f : listOfFiles ) {
			if( f.getName().equals(fileNameToSearch)) {
				fileSearched = true;
				System.out.println("File search successful.");
				System.out.println(f.getName());
			}
		}
		
		if( fileSearched == false) {
			System.out.println("File \"" + fileNameToSearch + "\" does not exist.");
		}
		
	}
}
