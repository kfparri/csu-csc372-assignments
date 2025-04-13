package csc372.module04;

/**
 * Circle - This is an implementation of the abstract Shape class
 * 	it has the functions of a shape in addition to a custom 
 * 	property for the radius 
 *  
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class Circle extends Shape {
	// Private variable for the radius of this circle
	private double radius;
	
	/**
	 * Set the radius of the Circle
	 * @param value - The value of the radius
	 */
	public void setRadius(double value) {
		radius = value;
	}
	
	/**
	 * Get the radius of the circle
	 * @return - Radius of the circle as a double
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Calculate the area of the circle
	 * @return The area as a double
	 * @throws Exception 
	 */
	@Override
	public double area() throws Exception {
		// first initialize the return value to 0
		double retVal = 0.0;
		
		// we only want to calculate the area if the radius is
		//  greater than 0, otherwise it has no area.
		if(radius > 0) {
			retVal = Math.PI * Math.pow(radius, 2);
		} else {
			throw new Exception("Radius must be greater than 0");
		}
		
		// return the calculated area (or 0 if the radius is invalid)
		return retVal;
	}

	/**
	 * Calculate the perimeter of the circle
	 * @return The perimeter as a double
	 * @throws Exception 
	 */
	@Override
	public double perimeter() throws Exception {
		// first, initialize the return value to 0
		double retVal = 0.0;
		
		// we only want to calculate the perimeter if the radius
		//  is greater than 0 otherwise it is invalid
		if(radius > 0) {
			retVal = 2 * Math.PI * radius;
		} else {
			throw new Exception("Radius must be greater than 0");
		}
		
		// return calculated perimeter or 0 if the radius is invalid
		return retVal;
	}
	
	/**
	 * Returns the area and perimeter as a string value
	 * @return String
	 */
	public String toString() {
		String retVal = "";
		
		try {
			retVal = "Circle (radius: " + radius + ") Area: " + this.area() + " perimeter: " + this.perimeter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retVal;
	}

	/**
	 * Creates a new instance of Circle class
	 * @param radius - The radius of the circle as a double
	 */
	public Circle(double radius) {
		if(radius > 0) {
			this.radius = radius;
		} else {
			throw new IllegalArgumentException("Radius must be greater than 0");
		}
	}
}
