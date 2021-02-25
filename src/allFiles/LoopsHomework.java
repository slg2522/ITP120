package allFiles;

import java.util.Scanner;

public class LoopsHomework
{
	public static void main(String[] args)
	{
		//Problem 1a.
		int x = 2;
		int y = x++;				//y is assigned the value of x, then 1 is added
		System.out.println(y);		//y is printed as equivalent to x, bc addition has not occurred
		
		//Problem 1b.
		x = 2;
		System.out.println(x++);	//x is printed prior to adding 1
		
		//Problem 1c.
		x = 2;
		System.out.println(--x);	// 1 is subtracted prior to printing x
		
		//Problem 1d.
		x = 8;
		y = x--;
		System.out.println(y);		//y set equal to x, then 1 is subtracted
		
		//Problem 2a.
		x = 2;
		y = x++;
		System.out.println(y);		//y set equal to x, then 1 is added
		
		//Problem 2b.
		x = 2;
		System.out.println(x++);	//x is printed prior to adding 1
		
		//Problem 2c.
		x = 2;
		System.out.println(--x);	//1 is subtracted prior to printing x
		
		//Problem 2d.
		x = 8;
		y = x--;
		System.out.println(y);		//y is set equal to x, prior to subtracting 1
		
		/**________________________________________________________________________________________________________________________________________________ */
		
		/*Problem 3: Write a program using while loop, where in if user enters a number less than 50 or larger than 500,
		 * indicate that its an invalid input. ( Write an input validation program that takes the number in the range of 50 to 500. */
		
		Scanner scannerA = new Scanner (System.in);
		
		int number;
		System.out.println("What is your number?");
		number = Integer.parseInt(scannerA.nextLine());
		
		while (number > 50 && number < 500)
		{
			System.out.println("The number is a valid input.");
			System.out.println("Enter a new number.");
			number = Integer.parseInt(scannerA.nextLine());
		}
		System.out.println("The number is an invalid input.");
		
		/**________________________________________________________________________________________________________________________________________________ */
		
		/**Write a for loop that displays all of the odd numbers between 1 & 49. */
		
		int odd = 1;
		
		System.out.println("All of the odd numbers between 1 and 49 (including 1 & 49):");
		
		while (odd < 50)
		{
			System.out.println(odd);
			odd = odd + 2;
		}
		System.out.println("No more odd numbers!");
		
		/**________________________________________________________________________________________________________________________________________________ */
		
		/**Write a for loop that takes 5 input numbers from a user and then displays the sum of all of the numbers.*/
		
		//Variable declaration & set total equal to nothing
		int integers;
		int total = 0;
			
		//Takes in the 5 integers and adds one to the count
			for (int counts = 1; counts <= 5; counts++)
			{
				System.out.println("Enter an integer:  ");
				integers = scannerA.nextInt();
				total += integers; 
			}
		System.out.println("The sum of the integers is: " + total + ".");
			
		/**________________________________________________________________________________________________________________________________________________ */
		
		//Write a loop program for the following output: (6 diagonal #'s)
		//#
		// #
		//  #
		//   #
		//    #
		//     #
		
		//total number of lines
		final int enters = 6;
		
		//controls printing iterations
		for (int iterations = 0; iterations < enters; iterations++)
		{
			//controls number of spaces
			for (int spaces = 0; spaces < iterations; spaces++)
			{
				System.out.print(" ");
			}
			//prints the # symbol once every iteration
			System.out.println('#');
		}
		
		scannerA.close();
	}
}
