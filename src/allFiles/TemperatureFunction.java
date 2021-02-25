package allFiles;

/**This program creates a method to convert fahrenheit to celsius using 2 functions.*/

import java.util.Scanner;

public class TemperatureFunction
{
	public static void main(String[] args)
	{
		//scanner & variable declaration
		Scanner scannerT = new Scanner(System.in);
		double fahrenheit;
		double celsius;
		
		//takes in the temperature in fahrenheit
		System.out.println("Enter a temperature in fahrenheit: ");
		fahrenheit = Double.parseDouble(scannerT.nextLine());
		
		//defines celsius by its calculation function
		celsius = fahrenheitToCelsius(fahrenheit);
		
		//prints an expression for temperature using function 2
		printTemperature(fahrenheit, celsius);
		
		//closes the scanner
		scannerT.close();
	}
	
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		//calculates celsius
		double celsius = (fahrenheit - 32) * 0.55;
		return celsius;
	}
	public static void printTemperature(double fahrenheit, double celsius)
	{
		//an expression for F and C
		System.out.printf("F:  " + fahrenheit + "\nC:  " + "%5.2f%n", celsius);
	}
	
}