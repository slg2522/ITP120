package allFiles;

/**for loops program a known number of iterations. 
 * 		conditional loop = executes as long as the condition exists
 * 		count-controlled loop = executes a specific number of iterations*/

import java.util.Scanner;    // Needed for the Scanner class

/**
   This program demonstrates a user controlled for loop.
*/


public class ForLoop
{
	   public static void main(String[] args)
	   {
	      int number;    // Loop control variable
	      int maxValue;  // Maximum value to display
	          
	      System.out.println("I will display a table of " +
	                         "numbers and their squares.");

	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	      
	      // Get the maximum value to display.
	      System.out.print("How high should I go? ");
	      maxValue = keyboard.nextInt();

	      // Display the table.
	      System.out.println("Number   Number Squared");
	      System.out.println("-----------------------");
	      for (number = 1; number <= maxValue; number++)
	      {
	         System.out.println(number + "\t\t" + 
	                            number * number);
	      }
	   }
}
