package allFiles;

/**
 * @author Sabrina Groves
 * @version 1.0
 * @since 3/17/2021
 * 
In this assignment, you will be imitating the Lo She magic square functioning. 
Lo Shu is 3*3 grid square. It contains the digits 1 through 9 in them.
The magic of the square is that each row, column and diagonal in the Lo She square add unto the same number. 
Your program should accept a two dimentional input array from the user and test whether that makes a Lo Shu magic square or not.
Display the outcome of the testing and the grid.
*/

//example:
//	4	9	2
//	3	5	7
//	8	1	6

import java.util.Scanner;

public class Array_3
{
	private static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args)
	{
		//defines a 2D array that holds the Lo Shu square values
		int square[][] = getNumber();
		
		//tries the solution
		ifCorrect(square);
	}
		
		/**method defines and assigns values to array*/
		public static int[][] getNumber()
		{
			//initialize & define the array
			int [] [] grid = new int [3] [3];
			
			//defines and initializes indexes
			int i = 0;
			int j = 0;
			
			//create a loop to gather array values
			for (i = 0; i < grid.length; i++)
			{
				for (j = 0; j < grid[0].length; j++)
				{
					System.out.println("Enter an integer between 1 and 9. Do not repeat values.");
					grid[i][j] = keyboard.nextInt();
				}
			}
			return grid;
			//prints to check
			//System.out.println(grid [i-1] [j-1]);
		}
		
		/**method checks totals for each set of three*/
		public static void ifCorrect(int grid[][])
		{
			//defines and initializes indexes
			int i = 0;
			int j = 0;
			
			//creates sums for each of the square spaces
			int sumR0 = grid[i][j] + grid[i][j+1] + grid[i][j+2];
			int sumR1 = grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2];
			int sumR2 = grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
			int sumC0 = grid[i][j] + grid[i+1][j] + grid[i+2][j];
			int sumC1 = grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
			int sumC2 = grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];
			int diag1 = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
			int diag2 = grid[i+2][j+2] + grid[i+1][j+1] + grid[i][j];
					
			//tests if sums are equal
			if (sumR0 == sumR1 && sumR0 == sumR2 && sumR0 == sumC0 && sumR0 == sumC1 && sumR0 == sumC2 && sumR0 == diag1 && sumR0 == diag2)
			{
				System.out.println("You have completed the Lo Shu Square correctly!");
			}
			else
			{
				System.out.println("Sorry, try again.");
			}
			
		}
		
}
