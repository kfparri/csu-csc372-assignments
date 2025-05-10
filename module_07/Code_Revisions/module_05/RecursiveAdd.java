package csc372.module05;

import java.util.Scanner;

/**
 * RecursiveAdd - This application performs simple addition of multiple numbers
 *  using a recursive method 
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class RecursiveAdd {

	public static void main(String[] args) {
		// setup a scanner for the default input (Console) to get input from the user
		Scanner scanner = new Scanner(System.in);
		
		// int list to store all values to add together
		int[] numbers = new int[5];
		
		// simple program display
		System.out.println("This program will take 5 integers as input and add them together using a recursive function");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = getInput("Enter integer " + (i +1) + ": ", scanner);
		}
				
		scanner.close();
		// calculate the sum of the array using the recursive function
		// we want to start with the first number of the array so the 
		//  index is 0 (the first element)
		int result = recursiveAdd(numbers, 0);
		
		// print the results to the screen
		System.out.println("The sum of the 5 integers is: " + result);
	}

	/**
	 * getInput prompts the user and expects them to enter an integer value.  It will 
	 *   continue to prompt until an int is provided and then return the value
	 * @param prompt The text to prompt the user when waiting for input
	 * @param scanner A scanner setup to read in the next line of input from the user
	 * @return The provided integer value
	 */
	private static int getInput(String prompt, Scanner scanner) {
		int retVal = -1;
		
		// loop until we get valid input
		while(true) {
			// print out the prompt
			System.out.print(prompt + " ");
			
			try {
				// try to parse the provided input into an int
				retVal = Integer.parseInt(scanner.nextLine());
				
				// we got a valid integer, break out of loop
				break;
			} catch(NumberFormatException e) {
				// prompt the user to try again
				System.out.println("Invalid input.  Please enter a valid integer.");
			}
		}
		
		// return the provided value
		return retVal;		
	}
	
	/**
	 * recursiveAdd - This function takes a list of integers as an array and
	 *   adds them recursively.  
	 * @param numbersToAdd Integer array to add together
	 * @param index The index this function is trying to add to
	 * @return The sum of all the values in the array
	 */
	private static int recursiveAdd(int[] numbersToAdd, int index) {
		// Check for the base case, if the index we are providing is length of the array
		//  we are beyond the array and should return 0 (index is 0 based so if the array is
		//  5 elements in length the max index is 4, if we are at 5 we have reached the base case)
		if(index == numbersToAdd.length) {
			return 0;
		}
		
		// we are not at the base case so add this value to the results of the recursive call
		// we must make sure that we increment the index value so we don't get stuck in an 
		//  endless recursive call
		return numbersToAdd[index] + recursiveAdd(numbersToAdd, index + 1);
	}
}
