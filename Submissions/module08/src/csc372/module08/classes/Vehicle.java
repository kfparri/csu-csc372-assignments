package csc372.module08.classes;

/**
 * Vehicle - This is the core class used for the vehicle database
 */
public class Vehicle {
	// Set private variables 
	private String make;
	private String model;
	private double milesPerGallon;
	
	/**
	 * Returns the make of this vehicle
	 * @return Make
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * Sets the make of this vehicle
	 * @param value
	 */
	public void setMake(String value) {
		make = value;
	}
	
	/**
	 * Returns the model of this vehicle
	 * @return model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Sets the model of this vehicle
	 * @param value
	 */
	public void setModel(String value) {
		model = value;
	}
	
	/**
	 * Returns the miles per gallon for this vehicle
	 * @return milesPerGallon
	 */
	public double getMilesPerGallon() {
		return milesPerGallon;
	}
	
	/**
	 * Sets the miles per gallon for this vehicle
	 * @param value
	 */
	public void setMilesPerGallon(double value) {
		milesPerGallon = value;
	}
	
	/**
	 * Returns the values of the vehicle as a String
	 * @return Object as a string 
	 */
	public String toString() {
        return make + " " + model + " (" + milesPerGallon + " mpg)";
    }
}
