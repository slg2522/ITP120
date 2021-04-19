package allFiles;

/**
 * @author Sabrina Groves
 * @since 4/12/2021
 * @version 1.0
 */

import java.util.Scanner;

public class Question3Array
{
	private static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args)
	{
		//set the number of rows and columns in the array
		int ROWS = 20;
		int COLS = 3;
		//make the array
		int[][] records = new int [ROWS][COLS];
		
		//add all the elements to the array
		for(int x = 0; x < ROWS; x++)
		{
			for(int y = 0; y < COLS; y++)
			{
				//take in the user's input for all of the elements
				System.out.println("Enter the categorical information into the table. Note, column 1 represents the ages: ");
				records[x][y] = keyboard.nextInt();
			}
		}
		
		//calculate the average age and print out
		double age;
		double total = 0;
		
		//calculate the total of the first column (ages
		for(int index = 0; index < records.length; index++)
		{
			total = total + records[index][0];
		}
		//calculate the average of the ages
		age = total/ROWS;
		//print the average age
		System.out.println("The average age is: " + age + "years old.");
	}
}
