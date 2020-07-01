package com.app;

import java.util.Scanner;

import com.operations.AddFileIntoDirectory;
import com.operations.DeleteFileFromDirectory;
import com.operations.RetrieveFileNames;
import com.operations.SearchUserSpecifiedFile;
import com.service.PathGenerator;

public class LockedMeApp {
 
	public static void main(String args[]) {
		
		LockedMeApp lm = new LockedMeApp();
		lm.welcomeScreen();
	}
 
	public void welcomeScreen() {
		
		String directoryPath = new PathGenerator().getPath();
		 
		Scanner sc = new Scanner(System.in);
		 
		int optionNo = 0;
		 
		System.out.println(" ------- LockedMe.com -------\n");
		 
		System.out.println("Developed By - Raksha Shetty (Batch 2)");
		System.out.println("Phase 1 project\n");
		 
		while(optionNo != 3) {
		 
			System.out.println("\\--> Main Menu");
			System.out.println("1. Display all the files stored in the application.");
			System.out.println("2. Add a file \\ Delete a file \\ Search file");
			System.out.println("3. Exit LockedMe.com");
			 
			System.out.println("Enter an option to perform the above listed operations.");
			optionNo = sc.nextInt();
			 
			switch(optionNo) {
			 
				case 1:	System.out.println("List of all Files : \n");
				 		new RetrieveFileNames(directoryPath);
				 		System.out.println("\n");
				 		break;
				 			
				case 2:	char operationChoice;
					 	do {
							 	System.out.println("a. Insert a file into the application");
					 			System.out.println("b. Delete a file from the application");
					 			System.out.println("c. Search file from the application");
					 			System.out.println("d. Return to Main Menu");
					 			System.out.println("Enter an option to perform the above listed operations.");
					 			operationChoice = sc.next().charAt(0);
					 			
					 			if(operationChoice == 'a') {
					 				System.out.println("\nEnter the file to be inserted into the application ");
					 				String file = sc.next();
					 				new AddFileIntoDirectory(file, directoryPath);
					 				System.out.println("\r");
					 			}
					 			else if(operationChoice == 'b') {
					 				System.out.println("Enter the file name to be deleted from the application ");
					 				String fileName = sc.next();
					 				new DeleteFileFromDirectory(fileName, directoryPath);
					 				System.out.println("\n");
					 			}
					 			else if(operationChoice == 'c') {
					 				System.out.println("Enter the file name to be searched from the application ");
					 				String fileName = sc.next();
					 				new SearchUserSpecifiedFile(fileName, directoryPath);
					 				System.out.println("\n");
					 			}
					 			else if(operationChoice == 'd') {
					 				break;
					 			}
					 			else {
					 				System.out.println("Invalid choice. Please enter the correct option.");
					 			}
						}while(operationChoice != 'd');
				 		break;
				 				
						 			 
				case 3:	System.out.println("Closing Locked.Me App\nExiting...");
					 	break;
					 	
				default: System.out.println("Invalid choice. Please enter the correct option");
					 	 break;
			}
		}
		 
	 }
}

	