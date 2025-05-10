package csc372.module06;
import java.util.ArrayList;

import csc372.module06.objects.*;

/**
 * Main - Driver class to display the different sort functions 
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class Main {

	public static void main(String[] args) {
		// Initialize a list of 10 students
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(115, "Alice", "123 first street"));
		students.add(new Student(398, "Hank", "890 eighth street"));
		students.add(new Student(42, "James", "100 tenth street"));
		students.add(new Student(123, "Charlie", "345 third street"));		
		students.add(new Student(112, "Ingrid", "901 ninth street"));
		students.add(new Student(223, "David", "456 fourth street"));
		students.add(new Student(54, "Ellen", "567 fifth street"));
		students.add(new Student(422, "Frank", "678 sixth street"));
		students.add(new Student(112, "Bob", "234 second street"));
		students.add(new Student(100, "George", "789 seventh street"));
		
		// display the list of students before we sort them
		System.out.println("Before sorting order:");
		displayList(students);
		
		// create a new instance of the selection sorter.  Optionally
		//  this class could be static to make the function a singleton
		SelectionSorter sorter = new SelectionSorter();
		
		// call the sort method with the roll number comparator
		// This function does not need to return a value because the 
		//  students object is passed by reference and will be modified
		//  in the function and the main.
		sorter.sort(students, new CompareByRollNumber());
		
		// display the results of the sort
		System.out.println("After sorting by roll number:");
		displayList(students);
		
		// sort the list again, this time by name
		sorter.sort(students, new CompareByName());
		
		// print the new order on the list
		System.out.println("After sorting by name:");
		displayList(students);
	}
	
	private static void displayList(ArrayList<Student> students) {
		for(Student s : students) {
			System.out.println(s.toString());
		}
	}

}
