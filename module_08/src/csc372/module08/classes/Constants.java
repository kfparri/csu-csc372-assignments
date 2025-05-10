package csc372.module08.classes;

/**
 * Constants - This class is a central point for all string prompts and
 *   messages for the vehicle database
 */
public class Constants {
	/**
	 * @return Returns the prompt for vehicle make
	 */
	public static String vehicleMakePrompt() {
		return "Please enter the make of the vehicle (q to quit):";
	}
	
	/**
	 * @return Returns the prompt for vehicle model
	 */
	public static String vehicleModelPrompt() {
		return "Please enter the model of the vehicle (q to quit):";
	}
	
	/**
	 * @return Returns the prompt for vehicle mpg
	 */
	public static String vehicleMpgPrompt() {
		return "Please enter the miles per gallon of the vehicle(q to quit):";
	}
	
	/**
	 * @return Returns the name for the output file of the vehicle 
	 *  database
	 */
	public static String outputFileName() {
		return "VehicleDatabase.txt";
	}
	
	/**
	 * @return Returns the message to display when the app closes
	 */
	public static String applicationQuitMessage() {
		return "The application has exported the database content to a file named: " + outputFileName();
	}
	
	/**
	 * @return Returns message for invalid miles per gallon input
	 */
	public static String invalidDoubleMessage() {
		return "The provided input could not be parsed to a double, please try again.";
	}
	
	/**
	 * @return Returns message that vehicle was added to database
	 */
	public static String vehicleAddedMessage() {
		return "Added the vehicle to the database!\n";
	}
}
