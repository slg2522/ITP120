package allFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;

/**
 * 
 * @author Sabrina Groves
 * @version 1.0
 * @since 3/31/2021
 * 
 * Practice:
 * 1) Putting an existing code in try catch block (5pts)
 * 2) Implement catching any three types of exceptions mentioned/ showed in the videos / discussed during the class. (15pts)
 * 3) Implement catching multiple exceptions in one catch block. (5pts)
 *
 */

import java.util.Scanner;

public class ExceptionsHandling
{
	public static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args) throws IOException
	{
		try
		{	
			//Take in the file's answer through buffered reader
			System.out.println("Enter the name of a file to take data from.");
			String fileName = keyboard.nextLine();
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			//file name: "C:\Users\sabri\Desktop\OneToTen.txt"
			
			//create random class object
			Random randomNumbers = new Random();
			
			System.out.print("What is the sum of ");
			
			//create several random numbers in an array
			int numbers [] = new int [10];
			int sum = 0;
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
			
			//calculate the total of the numbers in the file
			int total = 0;
			String s;
			while((s = br.readLine()) != null)
			{
				total = Integer.parseInt(s) + total;
			}
			System.out.println("Total: " + total);
			br.close();
			
			//is user correct
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
				System.out.println("Everyone is incorrect");
			}
		}
		catch (NumberFormatException | InputMismatchException | FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			keyboard.close();
		}
	}
}
