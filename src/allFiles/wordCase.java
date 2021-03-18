package allFiles;

import java.util.Scanner;

public class wordCase
{
	private static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter an integer between 1 and 9. Do not repeat values.");
		String word = keyboard.next();
		
		word = equalsIgnoreCase(word);
		
	}
}
