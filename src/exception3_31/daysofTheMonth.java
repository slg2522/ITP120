package exception3_31;

/**
 * @author Sabrina Groves
 * @version 1.0
 * @since 3/31/2021
 * 
 * Write a program that has and does the following:
 * It has a class named daysofTheMonth. The class constructor accepts the array of the number of days as an argument.
 * There is a method in the class that returns the total number of days in the year.
 * If an array elements is other than 28, 29, 30, or 31, the class should throw a StrangeNumberOfDays Exception
 * Make sure there is appropriate documentation in the code.
 */

//import the scanner
import java.util.Scanner;

public class daysofTheMonth
{
	//intake scanner
	public static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args) throws StrangeNumberOfDaysException
	{
		//the names of the months
		String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
		
		//the traditional number of days
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//asks if program should switch the traditional days with the user input days
		System.out.println("Would you like to switch the traditional days per month?");
		System.out.println("Enter Yes or No.");
		String response = keyboard.nextLine();
		
		//intakes the user changes to the days of the months (if desired)
		//@exception thrown for days out of month total bounds (<28 || >31)
		if (response.equalsIgnoreCase("yes"))
		{
			System.out.println("Please enter 12 integers to represent the days in each month.");
			for(int index = 0; index < days.length; index++)
			{
				System.out.println(months[index] + ": ");
				days[index] = keyboard.nextInt();
				if(days[index] < 28 || days[index] > 31)
				{
					if (days[index] < 28)
					{
						throw new StrangeNumberOfDaysException("A month cannot have less than 28 days.");
					}
					else
					{
						throw new StrangeNumberOfDaysException("A month cannot have more than 31 days.");
					}
					
				}
			}
		}
		else
		{
			System.out.println("Thank you for your input. The traditional number of days will be used.");
		}
		
		//calls the method to get the total number of days
		int total = totalDays(days);
		
		//prints the total number of days
		System.out.println("The total days in the year are: " + total);
	}
	
	//method to get the total number of days
	public static int totalDays(int days[])
	{
		//sets the index and total to none
		int total = 0;
		int index = 0;
		
		//adds all the array elements up
		for(index = 0; index < days.length; index++)
		{
			total = total + days[index];
		}
		//@return the total days in a year as integer
		return total;
	}
}
