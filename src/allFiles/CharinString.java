package allFiles;

/**
 * Compare String and character to find how much in common
 * @author Sabrina Groves
 * @since 3/15/2021
 */

//import scanner
import java.util.Scanner;

public class CharinString
{
	//new scanner
	public static Scanner scan = new Scanner(System.in);
	
	//main method to get other methods
	public static void main(String[] args)
	{
		String str = userInput();
		int same = compareTo(str);
		System.out.println("The string and character share " + same + " of the same letters.");
	}
	
	//takes a string from the user
	//@return the user's string
	public static String userInput()
	{
		String userString;
		System.out.println("Enter a string as input:  ");
		userString = scan.nextLine();
		return userString;
	}
	
	//find commonality between string and character
	//@param takes string from method userInput
	//@retun integer of commonality
	public static int compareTo(String userString)
	{
		String userInput;
		char userCharacter;
		System.out.println("Enter a character as input:  ");
		userInput = scan.nextLine();
		userCharacter = userInput.charAt(0);
		
		//find the length of the String
		int length = userString.length();
		
		//create an array to hold the string
		char[] letters = new char[length];
		
		//index start
		int index = 0;
		
		for(index = 0; index < userString.length(); index++)
		{
			letters[index] = userString.charAt(index);
		}
		
		//count start
		int count = 0;
		
		//accumulator
		int total = 0;
		
		for(count = 0; count < userString.length(); count++)
		{
			if(letters[count] == userCharacter)
			{
				total +=1;
			}
		}
		return total;
		
	}
}
