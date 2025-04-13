package csc372.module04;

/**
 * Rectangle - This is an implementation of the abstract Shape class
 * 	it has the functions of a shape in addition to some custom 
 * 	properties (side1, side2, and side3)
 * 
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class Triangle extends Shape{
	// Create private variables for each side
	double side1, side2, side3;
	
	/**
	 * Set the value for side1
	 * @param value as double
	 */
	public void setSide1(double value) {
		side1 = value;
	}
	
	/**
	 * Get the value for side 1
	 * @return side1 as double
	 */
	public double getSide1() {
		return side1;
	}
	
	/**
	 * Set the value for side2
	 * @param value as double
	 */
	public void setSide2(double value) {
		side2 = value;
	}
	
	/**
	 * Get the value for side2
	 * @return side2 as a double
	 */
	public double getSide2() {
		return side2;
	}
	
	/**
	 * Set the value for side3
	 * @param value as double
	 */
	public void setSide3(double value) {
		side3 = value;
	}
	
	/**
	 * Get the value for side3
	 * @return side3 as double
	 */
	public double getSide3() {
		return side3;
	}
	
	/**
	 * Calculate the area of the Triangle
	 * @return The calculated area as double
	 * @throws Exception 
	 */
	@Override
	public double area() throws Exception {
		// Set the initial return value to 0
		double retVal = 0.0;
		
		// ensure we have valid lengths for all three sides before 
		//  trying to calculate the area
		if(side1 > 0 && side2 > 0 && side3 > 0) {
			// find the Semi permimeter of the triangle
			double S;
			try {
				S = this.perimeter() / 2;
				
				// Find the area using Heron's Formula
				retVal = Math.sqrt(S * (S - side1) * (S - side2) * (S - side3));
			} catch (Exception e) {
				e.printStackTrace();
			}			
		} else {
			throw new Exception("All three sides must be greater than 0");
		}
		
		// return the calculated area or 0.
		return retVal;
	}

	/**
	 * Calculate the perimeter of the triangle
	 * @return The calculated perimeter as double
	 * @throws Exception 
	 */
	@Override
	public double perimeter() throws Exception {
		// Set the initial return value to 0
		double retVal = 0.0;
		
		// ensure we have valid lengths for all three sides before
		//  trying to calculate the perimeter
		if(side1 > 0 && side2 > 0 && side3 > 0) {
			retVal = side1 + side2 + side3;
		} else {
			throw new Exception("All three sides must be greater than 0");
		}
		
		// return the calculated area or 0
		return retVal;
	}
	
	/**
	 * Returns the area and perimeter as a string value
	 * @return String
	 */
	public String toString() {
		String retVal = "";
		
		try {
			retVal = "Triangle (side1: " + side1 + ", side2: " + side2 + ", side3: " + side3 + ") Area: " + this.area() + " Perimeter: " + this.perimeter();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retVal;
	}
	
	/**
	 * Creates a new instance of Triangle
	 * @param s1 side1 as double
	 * @param s2 side2 as double
	 * @param s3 side3 as double
	 */
	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

}
