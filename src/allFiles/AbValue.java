package allFiles;

import java.util.Scanner;

public class AbValue
{

	/**Write a Java function called absoluteValue(). The access modifier should
	 * be public, it should have a return type of double, and it should take one
	 * double parameter as input. If the double parameter is less than 0, it should
	 * return that number negated. Otherwise, it should return the parameter unchanged.*/

	public static void main(String[] args)
	{
		//new scanner and variable declaration
		Scanner scanner1 = new Scanner(System.in);
		double number;
		double value;
		double negate = -1;
			
		//intake number
		System.out.println("Enter a number:  ");
		number = Double.parseDouble(scanner1.nextLine());
			
		//defines value based on function 1
		value = absoluteValue(negate, number);	
      	
		//prints the absolute value
      	System.out.println("The absolute value of " + number + " is " + value + ".");
		scanner1.close();
	}
  	
  	public static double absoluteValue(double negate, double number)
    {
      //if negative, multiply by -1
  	  if (number < 0)
      {
        double value = number * negate;
        return value;
      }
      //if positive, or 0, remain the same
  	  else
      {
        double value = number;
        return value;
      }
    }
  
}
