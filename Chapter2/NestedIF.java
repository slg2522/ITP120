package allFiles;
import java.util.Scanner;

public class NestedIF
{
	public static void main(String[] args)
	{
		double salary;
		double yearsOnJob;
		
		//Create Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//get annual salary
		System.out.println("Enter your annual salary:");
		salary = keyboard.nextDouble();
		
		//get years on the job
		System.out.println("Enter your total years:");
		yearsOnJob = keyboard.nextDouble();
		
		//Determine if qualified for loan
		if (salary >= 50000)
		{
			if (yearsOnJob >= 2)
			{
				System.out.println("You qualify for this loan.");
			}
			else
			{
					System.out.println("You do not qualify.");
			}
		}
keyboard.close();		
	}
}
