package com.operations;

import java.io.File;

public class DeleteFileFromDirectory {

	public DeleteFileFromDirectory(String fileName, String directoryPath){
		
		directoryPath += fileName;
		
		File f1 = new File(directoryPath);
		
		if(f1.exists()) {
			boolean op = f1.delete();
			
			if(op == true) {
				System.out.println(fileName + " deleted successfully !!!");
			}
			else {
				System.out.println(fileName + " cannot be deleted.");
			}
		}
		else {
			System.out.println(fileName + " does not exist.");
		}
	}
}
