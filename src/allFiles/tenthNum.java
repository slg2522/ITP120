package allFiles;

/**
 * Exam 2, Question 6: For loop to display the numbers 10 through 250 in increments of 10
 * @author Sabrina Groves
 * @since 3/15/2021
 */

public class tenthNum
{
	public static void main(String[] args)
	{
	//creates a number variable to increase by 10 later
	int num = 0;
	
	//finds and stores the length of the list of numbers
	int length = 250/10;
	
	//starts index at 0
	int index = 0;
	
	//for loop including 10 and 250
	for(index = 0; index < length; index++)
	{
		num +=10;
		System.out.print(num + " ");
	}
	}
}
