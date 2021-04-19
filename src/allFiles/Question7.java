package allFiles;

/**
 * @author Sabrina Groves
 * @version 1.0
 * @since 4/12/2021
 */

import java.util.Scanner;

public class Question7
{
	private static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args)
	{
		//an array of numbers
		int[] numbers = {1, 2, 3, 4, 5};
		//a number n
		System.out.println("Enter a number n.");
		int n = keyboard.nextInt();
		
		//numbers less than n
		System.out.println("Here are all of the array elements that are less than your number (" + n + ")");
		//loop through the array
		for(int index = 0; index < numbers.length; index++)
		{
			//find the elements less than n
			if (numbers[index] < n)
			{
				//print the elements
				System.out.println(numbers[index]);
			}
		}
	}
}
