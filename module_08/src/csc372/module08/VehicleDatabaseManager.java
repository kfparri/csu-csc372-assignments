package csc372.module08;

import java.util.Scanner;

import csc372.module08.classes.*;

/**
 * VehicleDatabaseManager is the entry point to create and output 
 *   the vehicle database
 */
public class VehicleDatabaseManager {

	private static VehicleDatabase db;
	
	public static void main(String[] args) {
		// setup the scanner for the default input
		Scanner scanner = new Scanner(System.in);
		
		// create the vehicle database
		db = new VehicleDatabase();
		
		String tempInput = "";
		
		while(true) {
			// create a temp vehicle to load
			Vehicle temp = new Vehicle();
			
			// prompt for the make
			tempInput = getInput(Constants.vehicleMakePrompt(), scanner);
			
			// check for quit string
			checkForQuit(tempInput);
			
			// set the make
			temp.setMake(tempInput);
			
			// prompt for model
			tempInput = getInput(Constants.vehicleModelPrompt(), scanner);
			
			// check for quit string
			checkForQuit(tempInput);
			
			// set the model
			temp.setModel(tempInput);
			
			while(true) {
				// prompt for MPG
				tempInput = getInput(Constants.vehicleMpgPrompt(), scanner);
				
				// check for quit string
				checkForQuit(tempInput);
				
				try {
					// make sure they have passed a valid double
					temp.setMilesPerGallon(Double.parseDouble(tempInput));
					break;
				} catch(NumberFormatException e) {
					// display an error about bad input and prompt again
					System.out.println(Constants.invalidDoubleMessage());
				}
			}
			
			// add vehicle to database
			db.addVehicle(temp);
			
			// display confirmation to the user about adding the vehicle
			System.out.println(Constants.vehicleAddedMessage());
		}

	}

	private static String getInput(String prompt, Scanner scanner) {
		String retVal = "";
		
		// loop until we get a valid response (any string with length > 0)
		while(true) {
			// display the prompt
			System.out.print(prompt + " ");
			
			try {
				// get the next line provided
				retVal = scanner.nextLine();
				
				// an input of length zero is invalid, all other input is 
				//  valid
				if(retVal.length() > 0) {
					break;
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		// return the provided value
		return retVal;
	}
	
	private static void checkForQuit(String input) {
		if(input.toLowerCase().equals("q")) {
			// user has requested to quit, print the file and display quitting message			
			db.saveDatabase(Constants.outputFileName());
			
			System.out.println(Constants.applicationQuitMessage());
			
			// exit the program
			System.exit(0);
		}
	}
}
