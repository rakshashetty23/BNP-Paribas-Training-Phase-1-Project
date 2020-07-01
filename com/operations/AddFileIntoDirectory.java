package com.operations;

import java.io.File;
import java.io.IOException;

public class AddFileIntoDirectory {

	public AddFileIntoDirectory(String fileName, String directoryPath){
		
		directoryPath += fileName;
		File f1 = new File(directoryPath);
		try {
			boolean op = f1.createNewFile();
			
			if(op == true) {
				System.out.println(fileName + " added successfully !!!");
			}
			else {
				System.out.println("A file with same name already exists");
			}
			
		} catch (IOException e) {
			
			System.out.println("File cannot be added currently.");
			
		}
		
	}
}
