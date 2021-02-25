package allFiles;

import java.util.Scanner;

/**Collects petfood grade. When 'a' is not present, the statement falls down to 'A' and proceeds bc no break. */

public class SwitchMultipleAnswers
{
	public static void main(String[] args)
	{
		String userInput;
		char foodGrade;
		
		//create scanner
		Scanner petscanner = new Scanner (System.in);
		
		//ask for pet food grade
		System.out.println("Which pet food grade would you like: A, B, or C?");
		userInput = petscanner.nextLine();
		foodGrade = userInput.charAt(0);
		
		switch(foodGrade)
		{
		case 'a':
		case 'A':
			System.out.println("30 cents per lb.");
			break;
		case 'b':
		case 'B':
			System.out.println("20 cents per lb.");
			break;
		case 'c':
		case 'C':
			System.out.println("10 cents per lb.");
			break;
		default:
			System.out.println("N/A");
		}
		petscanner.close();
	}
	
}
