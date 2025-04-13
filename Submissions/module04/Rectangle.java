package csc372.module04;

/**
 * Rectangle - This is an implementation of the abstract Shape class
 * 	it has the functions of a shape in addition to some custom 
 * 	properties (length and width)
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class Rectangle extends Shape {
	// private variables for length and width
	private double length, width;
	
	/**
	 * Set the length of the sides of the rectangle
	 * @param value - Length of the side
	 */
	public void setLength(double value) {
		length = value;
	}
	
	/**
	 * Returns the length of the Rectangle
	 * @return Length as a double
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * Sets the width of the Rectangle
	 * @param value - The width of the Rectangle
	 */
	public void setWidth(double value) {
		width = value;
	}
	
	/**
	 * Returns the width of the Rectangle
	 * @return Width as a double
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Get the area of the Rectangle
	 * @return The calculated area based on the side length and width
	 * @throws Exception 
	 */
	@Override
	public double area() throws Exception {
		double retVal = 0.0;
		
		// if we have a valid length and width, calculate the area
		if(length > 0 && width > 0) {
			retVal = length * width;
		} else {
			throw new Exception("Lenght and Width must be greater than 0");
		}
		
		return retVal;
	}

	/**
	 * Get the perimeter of the Rectangle
	 * @return The calculated perimeter based on the length and the width
	 * @throws Exception 
	 */
	@Override
	public double perimeter() throws Exception {
		double retVal = 0.0;
		
		if(length > 0 && width > 0) {
			retVal = 2 * length + 2 * width;
		} else {
			throw new Exception("Both Length and Width must be greater than 0");
		}
		
		return retVal;
	}
	
	/**
	 * Returns the area and perimeter of the Rectangle as a String
	 * @return String
	 */
	public String toString() {
		String result = "";
		
		try {
			result = "Rectangle (length: " + length + " width: " + width + ") Area: " + this.area() + " Permimeter: " + this.perimeter();
		}
		catch(Exception ex) {
			System.out.println(ex.getStackTrace());
		}
		
		return result;
	}

	/**
	 * Constructor of the Rectangle
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		if(length > 0) {
			this.length = length;
		} else {
			throw new IllegalArgumentException("Length must be greater than 0"); 
		}
		
		if(width > 0) {
			this.width = width;			
		} else {
			throw new IllegalArgumentException("Width must be greater than 0");
		}
	}
}
