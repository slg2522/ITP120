package allFiles;

public class Operators
{
	public static void main(String[] args)
	{
		//Arithmetic Operators
		/*_______________________________________________________________________________________
		 * Operator		Meaning			Type			Example
		 * +			Addition		Binary			total = coat + tax
		 * -			Subtraction		Binary			cost = total - tax
		 * *			Multiplication	Binary			tax = cost * rate
		 * /			Division		Binary			salePrice=original / 2
		 * %			Modulus			Binary			remainder = value % 3
		 _______________________________________________________________________________________*/
		
		//Precedence:
			//Highest: - (unary negation), *, /, %
			//Lowest: +, -
		
		//Examples:
			//6 - 3 * 2 + 7 - 1 = 6
			//4 + 17 % 2 - 1= 4
			//(4 + 17) % 2 - 1 = 0
		
		//The Math Class
			//Math.pow() raises the first number to the power of the second number
					//Example: result = Math.pow(4.0, 2.0) = 4^2 = 16
										//x = 3 * Math.pow(6.0, 3.0) = 3 * 6^3 = 648
			//Math.sqrt() finds the square root
					//Example: result = Math.sqrt(9.0) = 3.0
		
		//Assignment Statement Examples:
			x = x + 4	adds 4 to x
			x = x - 3	subtracts 3 from x
			x = x * 10	multiplies x by 10
			x = x / 2	divides x by 2
			x = x % 4	assigns the remainder of x/4 to x
			
		//Combined Assignment Operators Examples:
			x += 5		same as x = x + 5
			y -= 2		same as y = y - 2
			z *= 10		same as z = z * 10
			a /= b		same as a = a / b
			c %= 3		same as c = c % 3
				 
	}
}
