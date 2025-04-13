package csc372.module04;

/**
 * Shape - This is an abstract class that acts as the base for several
 * 	different shape classes.
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public abstract class Shape {
	// Create some abstract functions that each shape should have
	
	// calculate the area of the shape
	public abstract double area() throws Exception;
	
	// calculate the perimeter of the shape
	public abstract double perimeter() throws Exception;
}
