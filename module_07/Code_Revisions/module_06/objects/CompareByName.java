package csc372.module06.objects;

import java.util.Comparator;

/**
 * CompareByName - Helper class that allows you to sort two student objects 
 *   by name.
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class CompareByName implements Comparator<Student>{
	/**
	 * compare takes two Students and compares their name and determines
	 *  which one should come first in a sort.
	 */
	public int compare(Student a, Student b) {
		// When doing a comparison, determine what to sort by and return 
		//  either -1, 0, or 1 depending on the result of the comparison
		//  sorting logic:
		//  -1 if the first parameter object should be first
		//  0 if the two objects are equal
		//  1 if the right parameter object should be first
		
		int compare = a.getName().compareTo(b.getName());
		
		if (compare < 0) {
			return -1;
		} else if(compare > 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
