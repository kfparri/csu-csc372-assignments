package csc372.module06.objects;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSorter {
	public void sort(ArrayList<Student> students, Comparator<Student> comparer) {
		// get the length of the array
		int length = students.size();
		
		// selection sort starts at one end of the array and always puts the smallest
		//  value in the first position in the array then moves that position up one
		//  until there are no more elements to shift up to.
		
		// Here is a more "graphical" representation to help visualize the sort a little
		//  better (taken from ChatGPT)
		/*
		Selection Sort (Visual Guide) - Sorting by rollNumber:

		Before Sorting:
		+-----+-----+-----+-----+
		|  5  |  2  |  4  |  1  |
		+-----+-----+-----+-----+

		Iteration 1:
		- Look for the minimum from index 0 to 3
		- Found minimum: 1 at index 3
		- Swap index 0 and index 3

		Result:
		+-----+-----+-----+-----+
		|  1  |  2  |  4  |  5  |
		+-----+-----+-----+-----+

		Iteration 2:
		- Look for the minimum from index 1 to 3
		- Found minimum: 2 at index 1
		- Swap index 1 and index 1 (no change)

		Result:
		+-----+-----+-----+-----+
		|  1  |  2  |  4  |  5  |
		+-----+-----+-----+-----+

		Iteration 3:
		- Look for the minimum from index 2 to 3
		- Found minimum: 4 at index 2
		- Swap index 2 and index 2 (no change)

		Result:
		+-----+-----+-----+-----+
		|  1  |  2  |  4  |  5  |
		+-----+-----+-----+-----+

		Sorted!
		*/
		for(int i = 0; i < length - 1; i++) {
			// set the min index to the current outer loop index
			int minIndex = i;
			
			for(int j = i + 1; j < length; j++) {
				// compare the min value against the current item, if the current is 
				//  smaller than the current min, set the min index to this element
				if(comparer.compare(students.get(j), students.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			
			// perform the swap
			// this will swap the min index to the current position at i 
			Student temp = students.get(minIndex);
			students.set(minIndex, students.get(i));
			students.set(i, temp);
		}
	}
}
