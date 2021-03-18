package allFiles;

/**
 * This program provides an example of a two dimensional array of gas prices
 * @author Sabrina Groves
 * @version 1.0
 *@since 3/17/2021
 */

public class TwoDimArray
{
	public static void main(String[] args)
	{
		//double [] [] prices = new double[3][2];
		
		//defines the gas prices for the 2D array
		double [] [] prices =
			{
					{3.979, 4.099},
					{4.1999, 4.299},
					{4.599, 4.499}
			};
		
		//gets the value from row 0, column 1
		double regl = prices[0][1];
		
		//prints the retrieved value
		System.out.println("Prints the value at row 0, column 1: " + regl);
		
		int j;
		
		System.out.println();
		System.out.println("Prints all of the gas prices: ");
		
		//Loop through the two dimensional array
		for (int i = 0; i < prices.length; i++)
		{
			for (j = 0; j < prices[0].length; j++)
			{
				System.out.printf("%10.3f", prices[i][j]);
			}
			System.out.println();
		}
		
	}
}
