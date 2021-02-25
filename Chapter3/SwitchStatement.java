package allFiles;

import java.util.Scanner;

/**Demonstrates the switch case. REMEMBER TO USE THE BREAKS!!!!!! IF NOT< IT WILL JUST DROP TO THE BOTTOM OF THE LIST (in this case, if 3, say: "You entered 3. N/A." default */

public class SwitchStatement
{
	public static void main(String[] args)
	{
		//number taken from a user
		int number;
		
		//create scanner
		Scanner wahoo = new Scanner (System.in);
		
		//Get a number from the user
		System.out.println("Enter 1, 2, or 3:");
		number = wahoo.nextInt();
		
		//determine number entered
		switch(number)
		{
			case 1:
				System.out.println("You entered 1.");
				break;
			case 2:
				System.out.println("You entered 2.");
				break;
			case 3:
				System.out.println("You entered 3.");
				break;
			default:
				System.out.println("N/A");
		}
		wahoo.close();
	}
}
