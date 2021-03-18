package allFiles;

/**Random Classes Methods:
 * nextDouble() = next random double between 0.0 and 1.0
 *nextFloat() = float between 0.0 and 1.0
 *nextInt() = integer between -2,147,483,648 and +2,147,483,648
 *nextInt(int n) = accepts integer argument n and returns random number within 0 and n
 *nextLong() = next long between trillions of - and +
 */

import java.util.Scanner;
import java.util.Random;

public class GenRandomNum
{
	public static void main(String[] args)
	{
	int num1;
	int num2;
	int sum;
	int userAnswer;
	
	//create scanner
	Scanner keyboard = new Scanner(System.in);
	
	//create random class object
	Random randomNumbers = new Random();
	
	//get random numbers
	num1 = randomNumbers.nextInt(100);
	num2 = randomNumbers.nextInt(100);
	
	//get user's answer
	System.out.println("What is the sum of " + num1 + " and " + num2 + "?");
	userAnswer = keyboard.nextInt();
	
	//sum
	sum = num1 + num2;
	System.out.println(num1 + " + " + num2 + " = " + sum);
	
	//is user correct
	if(userAnswer == sum)
	{
		System.out.println("Correct!");
	}
	else
	{
		System.out.println("Incorrect");
	}
	
	keyboard.close();
	}
}
