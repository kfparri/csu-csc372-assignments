package csc372.module08.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * VehicleDatabase - This class stores all the data for a vehicle database
 *   in a linked list object.  This class will also save the data to a 
 *   text file.
 */
public class VehicleDatabase {
	private LinkedList<Vehicle> vehicles;
	
	/**
	 * Adds a new vehicle to the database
	 * @param newVehicle
	 */
	public void addVehicle(Vehicle newVehicle) {
		vehicles.add(newVehicle);
	}
	
	/**
	 * Save the content of this database to a text file.  The file name is 
	 *   passed as a parameter to this function.
	 * @param filePath to save the file
	 */
	public void saveDatabase(String filePath) {
		// first, sort the list by MPG using a lamda expression
		vehicles.sort(Comparator.comparingDouble(Vehicle::getMilesPerGallon));
		
		// write the contents to a file using the BufferedWriter class
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
			
			for(Vehicle v : vehicles) {
				writer.write(v.toString());
				writer.newLine();
			}
			
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// default constructor
	public VehicleDatabase() {
		vehicles = new LinkedList<>();
	}
}
