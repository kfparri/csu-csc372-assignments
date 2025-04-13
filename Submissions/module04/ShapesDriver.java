package csc372.module04;

/**
 * The ShapesDriver class demonstrates the power of abstract
 * 	classes by allowing use to create a single data structure
 *  that can hold multiple classes that extend the Shape class.
 *  
 *  @author 	Kyle Parrish
 *  @version 	1.0.0
 */
public class ShapesDriver {

	/**
	 * Program main entry point
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// Create three instances of shapes classes that extend 
			//  the Shape class
			Triangle triangle = new Triangle(3, 4, 5);
			Circle circle = new Circle(12.5);
			Rectangle square = new Rectangle (4, 4);
			
			// Create an array of Shape and add the instances created
			//  above to it.
			Shape[] shapeArray = new Shape[] {triangle, circle, square};
	
			// Loop through the array and print the toString() method
			//  to show that it is calling the child class function.
			for(Shape shape : shapeArray) {
				System.out.println(shape.toString());
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
