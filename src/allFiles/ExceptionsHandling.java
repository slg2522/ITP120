package allFiles;

//import the exceptions, readers, file handlers, and scanner
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Sabrina Groves
 * @version 2.0
 * @since 4/3/2021
 * 
 * Practice:
 * 1) Putting an existing code in try catch block (5pts)
 * 2) Implement catching any three types of exceptions mentioned/ showed in the videos / discussed during the class. (15pts)
 * 3) Implement catching multiple exceptions in one catch block. (5pts)
 *
 *
 *This program takes a sum from a file, random number generator (through an array), and user. The sums are compared to one another
 *to determine (in)consistencies.
 */

public class ExceptionsHandling
{
	//create scanner
	public static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args) throws IOException //not sure if this is necessary?
	{
		try
		{	
			//Take in the file's answer through buffered reader
			System.out.println("Enter the name of a file to take data from.");
			String fileName = keyboard.nextLine();
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			//a good file to try: "C:\Users\sabri\Desktop\OneToTen.txt"
			
			//create random class object
			Random randomNumbers = new Random();
			
			//Asks the user for the sum of a group of random numbers
			System.out.print("What is the sum of ");
			
			//create several random numbers in an array
			int numbers [] = new int [10];
			int sum = 0;
			//provide 10 random numbers to be summed by the computer and user
			for(int index = 0; index < numbers.length; index++)
			{
				numbers[index] = randomNumbers.nextInt(100);
				sum = sum + numbers[index];
				if(index < (numbers.length - 1))
				{
					System.out.print(numbers[index] + ", ");
				}
				else
				{
					System.out.print("and " + numbers[index] + "?");
				}
				
			}
			
			//take in the user's answer
			int userAnswer = keyboard.nextInt();
			
			//calculate the total of the numbers in a random, user-specified file
			int total = 0;
			String s;
			while((s = br.readLine()) != null)
			{
				total = Integer.parseInt(s) + total;
			}
			br.close();
			
			//check whether a file's total is serendipitously the same as that of the random numbers and user calculation
			//is the user correct?
			if(userAnswer == sum && sum == total)
			{
				System.out.println("Everyone is correct!");
			}
			else if(userAnswer == sum)
			{
				System.out.println("The user is correct!");
			}
			else if(total == sum)
			{
				System.out.println("The file is correct!");
			}
			else if(total == userAnswer)
			{
				System.out.println("The user and file totals match, but both are incorrect.");
			}
			else
			{
				System.out.println("Everyone is incorrect.");
			}
		}		
		//catch the exceptions 
		catch (FileNotFoundException | InputMismatchException | NumberFormatException e)
		{
			e.printStackTrace();
		}
		finally
		{
			keyboard.close();
		}
	}
}
