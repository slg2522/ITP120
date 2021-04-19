package thirdTest;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrays
{
	private static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args)
	{
		//Two dimensional arrays are arrays of arrays.
		
		//An array can hold multiple values of the same data type simultaneously.
		
		//Elements start numbering from 0 and count up.
		//Elements are assigned subscripts (indexes) to pinpoint specific elements in an array. Subscripts always start from 0.
		
		//Bounds checking: means cannot use a subscript outside the range of valid subscripts.
		//Off-by-one errors: usually bc you forgot the subscript starts at 0, not 1.
		
		//initialize array elements
		int[][] coordinates = {{0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}};
		
		//print the coordinates one by one
		System.out.println("Each of a 2D array's elements:");
		//Enhanced for loop!
		for(int[] x: coordinates)
		{
			for(int y: x)
			{
				System.out.println(y);
			}
			System.out.println();
		}
		
//____________________________________________________________________________________________________________________________________________
		
		//print all the coordinates
		System.out.println("Each of the rows of the 2D array:");
		for(int index = 0; index < coordinates.length; index++)
		{
			System.out.println(Arrays.deepToString(coordinates));
		}
		
//____________________________________________________________________________________________________________________________________________
		
		//Declare an array with 3 rows and 4 columns
		double[][] arrayName = new double [3][4];
		
		//set the first value of the array to 95
		arrayName[0][0] = 95;
		
		//can process 2D arrays with nested loops: intake values
		final int ROWS = 3;
		final int COLS = 4;
		double[][] scores = new double[ROWS][COLS];
		for(int row = 0; row < ROWS; row++)
		{
			for(int column = 0; column < COLS; column++)
			{
				System.out.println("Enter a score: ");
				scores[row][column] = keyboard.nextDouble();
				
			}
		}
		
		System.out.println("\nScores:");
		
		//print the scores out
		for(int row = 0; row < ROWS; row++)
		{
			for(int column = 0; column < COLS; column++)
			{
				System.out.println(scores[row][column]);	
			}
		}
		
		//the length function in a 2D array operates on the:
		System.out.println("Number of rows: " + scores.length); //number of rows overall
		System.out.println("Number of columns in row 1: " + scores[1].length); //number of columns when row is specified
		
//____________________________________________________________________________________________________________________________________________
	
		//Processing Array Elements
		scores[0][2] = 0;
		System.out.println(++scores[0][2]); //Pre-increment operation
		scores[0][2] = 0;
		System.out.println(scores[0][2]++); //Post-increment operation
	
//____________________________________________________________________________________________________________________________________________
	
		//Let user specify number of elements
		System.out.println("How many elements do you have?");
		int numElements = keyboard.nextInt();
		
		//make an array with that many elements
		int cabinets[][];
		cabinets = new int[numElements][numElements];
		for(int x = 0; x < cabinets.length; x++)
		{
			for(int y = 0; y < cabinets.length; y++)
			{
				System.out.println("Fill the array: ");
				cabinets[x][y] = keyboard.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(cabinets));

//____________________________________________________________________________________________________________________________________________
				
		//Easy way to copy arrays:
  		int[][] originalArray = {{1, 2, 3}, {4, 5, 6}};
  		int[][] copyArray = new int[originalArray.length][];
  		
  		//creates loop to fill array
  		for(int i = 0; i < originalArray.length; i++)
  		{
  			copyArray[i] = originalArray[i].clone();
  		}
  		
  		System.out.println(Arrays.deepToString(originalArray));
  		System.out.println(Arrays.deepToString(copyArray));

//____________________________________________________________________________________________________________________________________________
  		
  		boolean arraysEqual;
  		arraysEqual = false;
  		int index = 0;
  		
  		//Compare arrays -- using == only compares locations in the memory
  		if(originalArray.length != copyArray.length)
  			arraysEqual = false;
  		else
  			arraysEqual = true;
  		
  		if (arraysEqual = true)
  		{
  			while (arraysEqual && index < originalArray.length)
  			{
  				for(int x = 0; x < originalArray.length; x++)
  	  				for(int y = 0; y < originalArray.length; y++)
  	  				{
  	  					if(originalArray[x][y] != copyArray[x][y])
  	  					{
  	  						arraysEqual = false;
  	  					}
  	  					else
  	  					{
  	  						arraysEqual = true;
  	  						index++;
  	  					}
  	  				}
  			}			
  		}
  		if(arraysEqual = true)
  		{
  			System.out.println("The arrays are equal.");
  		}
  		else
  		{
  			System.out.println("The arrays are unequal.");
  		}

//____________________________________________________________________________________________________________________________________________
  	  		
	}
}
