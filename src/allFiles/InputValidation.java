package allFiles;

/**Input Validation loop for Question 1: Exam 2
 * @author Sabrina Groves
 * @since 3/15/2021
 * */

//import scanner
import java.util.Scanner;

public class InputValidation
{
	public static void main(String[] args)
	{
		//scanner is called keyboard
		Scanner keyboard = new Scanner (System.in);
		
		//defines and declares input
		String input = "y";
		
		//input validation loop
		while(input.equalsIgnoreCase("y"))
		{
			//decide to stay in the loop or exit
			System.out.print("You have entered the loop.");
			System.out.println("Would you like to stay in the loop? Type Y for yes or N for no.");
			input = keyboard.nextLine();
			if (input != "y")
			{
				if(input.equalsIgnoreCase("n"))
				{
					System.out.print("You have chosen to exit the loop.");
				}
				else
				{
					System.out.print("Invalid input");
				}
			}
		}
		
		//close the scanner
		keyboard.close();
	}
}
